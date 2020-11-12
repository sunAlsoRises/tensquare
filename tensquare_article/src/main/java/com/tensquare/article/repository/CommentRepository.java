package com.tensquare.article.repository;

import com.tensquare.article.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
    //springdataMongodb 支持通过查询方法名来进行定义的方式实现
    //根据发布时间和点赞数查询
    List<Comment> findByPublishdateAndThumbup(Date date,Integer thumbup);
    //根据用户id查询 并且时间倒序
    List<Comment> findByUseridOrderByPublishdateDesc(String userid);
    //根据文章id查询
    List<Comment> findByArticleid(String articleid);
}