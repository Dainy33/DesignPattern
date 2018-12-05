package com.dainy33.Singletons;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    public synchronized static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
/**
 * @program: Homework8-9
 * @description:
 * @author: Dainy33
 * @create: 2018-12-03 09:29
 **/
