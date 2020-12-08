package com.stuforum.demo.dao;

import com.stuforum.demo.entity.CategoryInfo;
import com.stuforum.demo.entity.CategoryInfoExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CategoryInfo record);

    int insertSelective(CategoryInfo record);

    List<CategoryInfo> selectByExample(CategoryInfoExample example);

    CategoryInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CategoryInfo record);

    int updateByPrimaryKey(CategoryInfo record);
}