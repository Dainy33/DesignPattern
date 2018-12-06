package com.dainy33.Factory.FactoryMethod.iFactory.implement;

import com.dainy33.Factory.FactoryMethod.iFactory.iFactory;
import com.dainy33.Factory.FactoryMethod.iService.iAIOperator;
import com.dainy33.Factory.FactoryMethod.iService.implement.MySqlAIOperator;

public class MySqlFactory implements iFactory {
    public iAIOperator createAIOperator() {
        return new MySqlAIOperator();
    }
}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-06 14:19
 **/
