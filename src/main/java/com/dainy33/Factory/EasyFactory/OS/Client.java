package com.dainy33.Factory.EasyFactory.OS;

import com.dainy33.Factory.EasyFactory.Factory.Factory;
import com.dainy33.Factory.EasyFactory.iService.iAIOperator;
import com.dainy33.Factory.FactoryMethod.entity.ArticleInfo;
import org.junit.Test;

public class Client {

    @Test
    public void factoryUsage() {
        ArticleInfo articleInfo = new ArticleInfo();
        Factory factory = new Factory();
        iAIOperator operator = factory.createOperator();
        operator.insert(articleInfo);
    }
}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-06 14:53
 **/
