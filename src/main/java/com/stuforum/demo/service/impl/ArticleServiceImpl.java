package com.stuforum.demo.service.impl;


import com.stuforum.demo.dao.ArticleInfoMapper;
import com.stuforum.demo.entity.ArticleInfo;
import com.stuforum.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

/**
 * @author wade
 * @creat 2020-12-08-2020/12/8
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleInfoMapper articleInfoMapper;

    @Override
    public boolean addArticle() {
        ArticleInfo info = new ArticleInfo();
        info.setCreate_by(new Date(System.currentTimeMillis()));
        info.setIs_top(true);
        info.setTitle("hhh");
        info.setLikes(0);
        info.setTranffic(0);
        info.setUser_id(1L);
        articleInfoMapper.insert(info);
        return true;
    }
}
