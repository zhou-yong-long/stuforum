package com.stuforum.demo.test;

import com.stuforum.demo.service.ArticleService;
import com.stuforum.demo.service.impl.ArticleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * @author wade
 * @creat 2020-12-08-2020/12/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ArticleServiceImplTest {
    ArticleService articleService = new ArticleServiceImpl();
    @Test
    public void addArticle() {
        System.out.println(articleService.addArticle());
    }
}