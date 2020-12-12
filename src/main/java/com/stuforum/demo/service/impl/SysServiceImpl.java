package com.stuforum.demo.service.impl;

import com.stuforum.demo.dao.SysLogMapper;
import com.stuforum.demo.dao.SysViewMapper;
import com.stuforum.demo.entity.SysLog;
import com.stuforum.demo.entity.SysLogExample;
import com.stuforum.demo.entity.SysView;
import com.stuforum.demo.entity.SysViewExample;
import com.stuforum.demo.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wade
 * @creat 2020-12-12-2020/12/12
 */
public class SysServiceImpl implements SysService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Autowired
    private SysViewMapper sysViewMapper;

    /**
     * 添加日志信息
     * @param sysLog
     */
    @Override
    public void addLog(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }

    /**
     * 添加访问量
     * @param sysView
     */
    @Override
    public void addView(SysView sysView) {
        sysViewMapper.insertSelective(sysView);
    }

    /**
     * 获取日志总数量
     * @return
     */
    @Override
    public int getLogCount() {
        SysLogExample example = new SysLogExample();
        return sysLogMapper.selectByExample(example).size();
    }

    /**
     * 获取总访问量
     * @return
     */
    @Override
    public int getViewCount() {
        SysViewExample example = new SysViewExample();
        return sysViewMapper.selectByExample(example).size();
    }

    /**
     * 获取所有日志
     * @return
     */
    @Override
    public List<SysLog> listAllLog() {
        SysLogExample example = new SysLogExample();
        return sysLogMapper.selectByExample(example);
    }

    @Override
    public List<SysView> listAllView() {
        SysViewExample example = new SysViewExample();
        return sysViewMapper.selectByExample(example);
    }
}
