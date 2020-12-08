package com.stuforum.demo.dao;

import com.stuforum.demo.entity.ArticleComment;
import com.stuforum.demo.entity.ArticleCommentExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleComment record);

    int insertSelective(ArticleComment record);

    List<ArticleComment> selectByExample(ArticleCommentExample example);

    ArticleComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleComment record);

    int updateByPrimaryKey(ArticleComment record);
}