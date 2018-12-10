package com.dainy33.SempTaskQueue;

import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABC_SingleLock {
    private static int state = 0;
    private Lock lock = new ReentrantLock();

    //这个方法非常不好,必须在unlock()后用光时间片才行

    class ThreadA extends Thread{
        @Override
        public void run() {
            for(int i=0;i<10;){
                try {
                    lock.lock();
                    while (state%3==0){
                        System.out.print("A");
                        state++;
                        //i++的位置
                        i++;
                    }
                }finally {
                    lock.unlock();
                }
            }
        }
    }

    class ThreadB extends Thread{
        @Override
        public void run() {
            for(int i=0;i<10;){
                try {
                    lock.lock();
                    while (state%3==1){
                        System.out.print("B");
                        state++;
                        //i++的位置
                        i++;
                    }
                }finally {
                    lock.unlock();
                }
            }
        }
    }

    class ThreadC extends Thread{
        @Override
        public void run() {
            for(int i=0;i<10;){
                try {
                    lock.lock();
                    while (state%3==2){
                        System.out.print("C");
                        state++;
                        //i++的位置
                        i++;
                    }
                }finally {
                    lock.unlock();
                }
            }
        }
    }

    @Test
    public void OS() {
        Thread A = new ThreadA();
        Thread B = new ThreadB();
        Thread C = new ThreadC();

        A.start();
        B.start();
        C.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-10 16:07
 **/
