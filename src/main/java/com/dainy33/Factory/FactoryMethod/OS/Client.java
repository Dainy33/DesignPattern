package com.dainy33.Factory.FactoryMethod.OS;

import com.dainy33.Factory.FactoryMethod.entity.ArticleInfo;
import com.dainy33.Factory.FactoryMethod.iFactory.iFactory;
import com.dainy33.Factory.FactoryMethod.iFactory.implement.MySqlFactory;
import com.dainy33.Factory.FactoryMethod.iService.iAIOperator;
import com.dainy33.Factory.FactoryMethod.iService.implement.MySqlAIOperator;
import org.junit.Test;

public class Client {

    @Test
    public void previousUsage(){
        ArticleInfo articleInfo = new ArticleInfo();
        iAIOperator operator = new MySqlAIOperator();
        operator.insert(articleInfo);
    }

    @Test
    public void factoryUsage(){
        ArticleInfo articleInfo = new ArticleInfo();
        iFactory factory = new MySqlFactory();
        iAIOperator operator = factory.createAIOperator();
        operator.insert(articleInfo);
    }
}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-06 14:23
 **/
