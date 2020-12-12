package com.stuforum.demo.interceptor;


import com.stuforum.demo.entity.SysLog;
import com.stuforum.demo.entity.SysView;
import com.stuforum.demo.service.SysService;
import com.stuforum.demo.util.BrowserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.sql.Date;

/**
 * 前台拦截器
 * 说明：用于对访问数量进行统计
 * @author wade
 * @creat 2020-11-14-2020/11/14
 */
public class ForeInterceptor implements HandlerInterceptor {
    @Autowired
    SysService sysService;

    private SysLog sysLog = new SysLog();
    private SysView sysView = new SysView();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 访问者的IP
        String ip = request.getRemoteAddr();
        // 访问地址
        String url = request.getRequestURL().toString();
        //得到用户的浏览器名
        String userbrowser = BrowserUtil.getOsAndBrowserInfo(request);

        // 给SysLog增加字段
        ip = ip==null ? "0.0.0.0" : ip;
        userbrowser = userbrowser==null ? "获取浏览器名失败" : userbrowser;
        url = url==null ? "获取URL失败" : url;
        sysLog.setIp(ip);
        sysLog.setOperate_by(userbrowser);
        sysLog.setOperate_url(url);
        sysView.setCreate_by(new Date(System.currentTimeMillis()));
        // 增加访问量
        sysView.setIp(ip==null? "0.0.0.0" : ip);
        sysService.addView(sysView);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            // 保存日志信息
            sysLog.setRemark(method.getName());
            sysService.addLog(sysLog);

        } else {
            String uri = request.getRequestURI();
//            sysLog.setRemark(uri);
//            sysService.addLog(sysLog);
        }

//        HandlerMethod handlerMethod = (HandlerMethod) handler;
//        Method method = handlerMethod.getMethod();

        // 保存日志信息
//        sysLog.setRemark(method.getName());
//        sysService.addLog(sysLog);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
