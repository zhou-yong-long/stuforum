package com.stuforum.demo.dao;

import com.stuforum.demo.entity.SysLog;
import com.stuforum.demo.entity.SysLogExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    List<SysLog> selectByExample(SysLogExample example);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}