package com.stuforum.demo.service;

import com.stuforum.demo.entity.SysLog;
import com.stuforum.demo.entity.SysView;

import java.util.List;

/**
 * 后台数据统计实现接口
 * @author wade
 * @creat 2020-12-04-2020/12/4
 */
public interface SysService {
    /**
     * 添加日志
     * @param sysLog
     */
    void addLog(SysLog sysLog);

    /**
     * 添加访问量
     * @param sysView
     */
    void addView(SysView sysView);

    /**
     * 获取日志总数量
     * @return
     */
    int getLogCount();

    /**
     * 获取当前网站的访问量
     * @return
     */
    int getViewCount();

    /**
     * 返回所有日志信息
     * @return
     */
    List<SysLog> listAllLog();

    /**
     * 返回所有访问信息
     * @return
     */
    List<SysView> listAllView();
}
