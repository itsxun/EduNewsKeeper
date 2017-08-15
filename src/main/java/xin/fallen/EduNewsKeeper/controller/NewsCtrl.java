package xin.fallen.EduNewsKeeper.controller;

import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;
import xin.fallen.EduNewsKeeper.dao.NewsCategoryRepository;
import xin.fallen.EduNewsKeeper.dao.NewsRepository;
import xin.fallen.EduNewsKeeper.pojo.News;
import xin.fallen.EduNewsKeeper.util.JsonResultHandle;
import xin.fallen.EduNewsKeeper.vo.JsonResult;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

/**
 * Author: Fallen
 * Date: 2017/8/14
 * Time: 22:50
 * Usage:
 */
@RestController
public class NewsCtrl {
    @Resource
    private NewsRepository newsRepository;
    @Resource
    private NewsCategoryRepository newsCategoryRepository;

    @PostMapping("/news/new")
    public JsonResult newsSave(@NotNull News news) {
        if (news == null || news.getCategory() == 0 || news.getTitle() == null || news.getUrl() == null)
            return JsonResultHandle.resDispatcher("信息未填写完整", 0);
        return JsonResultHandle.resDispatcher(news == newsRepository.save(news));
    }

    @GetMapping("/category/{category-id}")
    public JsonResult findNewsByCategoryId(@PathVariable("category-id") int categoryId) {
        News news = new News();
        news.setCategory(categoryId);
        return JsonResultHandle.resDispatcher(newsRepository.findAll(Example.of(news)));
    }

    @GetMapping("/category-list")
    public JsonResult findAllCategory() {
        return JsonResultHandle.resDispatcher(newsCategoryRepository.findAll());
    }

    @GetMapping("/news/{news-id}/detail")
    public JsonResult findNewsByNewsId(@PathVariable("news-id") int newsId) {
        News news = new News();
        news.setNewsId((long) newsId);
        return JsonResultHandle.resDispatcher(newsRepository.findAll(Example.of(news)));
    }

    @GetMapping("/news/{news-id}/delete")
    public JsonResult deleteNewsByNewsId(@PathVariable("news-id") int newsId) {
        newsRepository.delete((long) newsId);
        return JsonResultHandle.resDispatcher(1);
    }
}