package com.dainy33.Factory.FactoryMethod.entity;

import java.util.UUID;

public class ArticleInfo {
    private UUID uuid;
    private String title;
    private String author;

    public ArticleInfo() {
        uuid = UUID.randomUUID();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
/**
 * @program: designpattern
 * @description:实体表
 * @author: Dainy33
 * @create: 2018-12-06 14:08
 **/
