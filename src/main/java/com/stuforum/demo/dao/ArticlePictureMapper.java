package com.stuforum.demo.dao;

import com.stuforum.demo.entity.ArticlePicture;
import com.stuforum.demo.entity.ArticlePictureExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticlePictureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticlePicture record);

    int insertSelective(ArticlePicture record);

    List<ArticlePicture> selectByExample(ArticlePictureExample example);

    ArticlePicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticlePicture record);

    int updateByPrimaryKey(ArticlePicture record);
}