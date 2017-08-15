package xin.fallen.EduNewsKeeper.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author: Fallen
 * Date: 2017/8/15
 * Time: 10:02
 * Usage:
 */
@Entity
public class NewsCategory {
    @Id
    private int recordId;
    private String categoryId;
    private String categoryZh;

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryZh() {
        return categoryZh;
    }

    public void setCategoryZh(String categoryZh) {
        this.categoryZh = categoryZh;
    }

    @Override
    public String toString() {
        return "NewsCategory{" +
                "recordId=" + recordId +
                ", categoryId='" + categoryId + '\'' +
                ", categoryZh='" + categoryZh + '\'' +
                '}';
    }
}
