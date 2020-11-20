package dao;

import entity.ArticlePicture;
import entity.ArticlePictureExample;
import java.util.List;

public interface ArticlePictureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticlePicture record);

    int insertSelective(ArticlePicture record);

    List<ArticlePicture> selectByExample(ArticlePictureExample example);

    ArticlePicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticlePicture record);

    int updateByPrimaryKey(ArticlePicture record);
}