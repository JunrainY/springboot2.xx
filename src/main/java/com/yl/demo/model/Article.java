package com.yl.demo.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data /*省略了get和set方法*/
@AllArgsConstructor/*全参*/
@NoArgsConstructor/*无参*/
@Builder  /*设立对象*/

@JsonPropertyOrder(value={"content","title"})
public class Article {

    @JsonIgnore
    private Long id;

    //@JsonProperty("auther")
    private String author;
    private String title;
    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private List<Reader> reader;


}
