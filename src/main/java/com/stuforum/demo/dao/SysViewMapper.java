package com.stuforum.demo.dao;

import com.stuforum.demo.entity.SysView;
import com.stuforum.demo.entity.SysViewExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysViewMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysView record);

    int insertSelective(SysView record);

    List<SysView> selectByExample(SysViewExample example);

    SysView selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysView record);

    int updateByPrimaryKey(SysView record);
}