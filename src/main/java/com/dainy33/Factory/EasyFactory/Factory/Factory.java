package com.dainy33.Factory.EasyFactory.Factory;

import com.dainy33.Factory.EasyFactory.iService.iAIOperator;
import com.dainy33.Factory.EasyFactory.iService.implement.MySqlAIOperator;
import com.dainy33.Factory.EasyFactory.iService.implement.OracleAIOperator;

public class Factory {

    private static final String DB = "MySql";

    public iAIOperator createOperator() {
        iAIOperator operator = null;
        switch (DB) {
            case "MySql":
                operator = new MySqlAIOperator();
            case "Oracle":
                operator = new OracleAIOperator();
            default:
                break;
        }
        return operator;
    }
}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-06 14:53
 **/
