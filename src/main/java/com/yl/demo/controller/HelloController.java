package com.yl.demo.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.yl.demo.model.Article;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j   /*自动帮我们引入Logger日志常量，我们在代码中就直接使用log.info或log.debug打印日志即可
代替private static final Logger log = */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public Article hello() {
//        Article article = new Article(1L, "yangyang");
//        Article.setAuthor("yangyang");
        Article article1=Article.builder().id(2L).author("莫言").build();
        log.info("测试"+article1);

        return article1;


    }

}