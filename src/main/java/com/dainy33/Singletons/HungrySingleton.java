package com.dainy33.Singletons;

public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
/**
 * @program: Homework8-9
 * @description:
 * @author: Dainy33
 * @create: 2018-12-03 09:12
 **/
