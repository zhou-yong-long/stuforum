package dao;

import entity.CategoryInfo;
import entity.CategoryInfoExample;
import java.util.List;

public interface CategoryInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CategoryInfo record);

    int insertSelective(CategoryInfo record);

    List<CategoryInfo> selectByExample(CategoryInfoExample example);

    CategoryInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CategoryInfo record);

    int updateByPrimaryKey(CategoryInfo record);
}