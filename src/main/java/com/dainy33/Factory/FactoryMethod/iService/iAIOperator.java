package com.dainy33.Factory.FactoryMethod.iService;

import com.dainy33.Factory.FactoryMethod.entity.ArticleInfo;

import java.util.UUID;

public interface iAIOperator {
    public void insert(ArticleInfo articleInfo);
    public void get(UUID uuid);
}
