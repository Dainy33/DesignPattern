package com.dainy33.Singletons;

public class InnerSingleton {
    private static class InnerSingletonHolder{
        public static InnerSingleton innerSingleton = new InnerSingleton();
    }

    public static InnerSingleton getInstance(){
        return InnerSingletonHolder.innerSingleton;
    }
}
/**
 * @program: Homework8-9
 * @description:
 * @author: Dainy33
 * @create: 2018-12-03 09:41
 **/
