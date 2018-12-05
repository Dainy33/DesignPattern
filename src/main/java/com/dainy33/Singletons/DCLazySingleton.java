package com.dainy33.Singletons;

public class DCLazySingleton {
    private static volatile DCLazySingleton dcLazySingleton;
    private DCLazySingleton(){

    }
    public static DCLazySingleton getInstance(){
        if(dcLazySingleton==null){
            synchronized (DCLazySingleton.class){
                if(dcLazySingleton==null){
                    dcLazySingleton = new DCLazySingleton();
                }
            }
        }
        return dcLazySingleton;
    }


}
/**
 * @program: Homework8-9
 * @description:
 * @author: Dainy33
 * @create: 2018-12-03 09:37
 **/
