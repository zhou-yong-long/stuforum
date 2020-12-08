package com.stuforum.demo.dao;

import com.stuforum.demo.entity.ArticleCategory;
import com.stuforum.demo.entity.ArticleCategoryExample;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);

    List<ArticleCategory> selectByExample(ArticleCategoryExample example);

    ArticleCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleCategory record);

    int updateByPrimaryKey(ArticleCategory record);
}