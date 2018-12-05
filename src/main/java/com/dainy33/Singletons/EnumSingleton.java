package com.dainy33.Singletons;

public enum EnumSingleton {
    SINGLETON;
    //Object 单例模式类的属性
    private Object object;
    private EnumSingleton(){
        object = new Object();
    }
    public Object instanceMethod() {
        return object;
    }
}
/**
 * @program: Homework8-9
 * @description:
 * @author: Dainy33
 * @create: 2018-12-03 10:06
 **/
