package xin.fallen.EduNewsKeeper.pojo;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

/**
 * Author: Fallen
 * Date: 2017/8/14
 * Time: 22:38
 * Usage:
 */
@Entity
public class News implements Serializable {
    @Id
    @GeneratedValue
    private Long newsId;
    private int category;
    private String title;
    private String url;

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
