package com.yl.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data /*省略了get和set方法*/
@AllArgsConstructor/*全参*/
@NoArgsConstructor/*无参*/
@Builder  /*设立对象*/
public class Article {

    private Long id;
    private String author;
    private String title;
    private String content;
    private String createTime;
    private List<Reader> reader;

}