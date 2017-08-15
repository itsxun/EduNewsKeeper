package xin.fallen.EduNewsKeeper.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.fallen.EduNewsKeeper.pojo.NewsCategory;

/**
 * Author: Fallen
 * Date: 2017/8/15
 * Time: 10:03
 * Usage:
 */
public interface NewsCategoryRepository extends JpaRepository<NewsCategory, Long> {

}
