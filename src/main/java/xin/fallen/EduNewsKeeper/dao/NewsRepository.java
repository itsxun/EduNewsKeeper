package xin.fallen.EduNewsKeeper.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.fallen.EduNewsKeeper.pojo.News;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {

}