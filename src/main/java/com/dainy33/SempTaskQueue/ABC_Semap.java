package com.dainy33.SempTaskQueue;

import org.junit.Test;

import java.util.concurrent.Semaphore;

public class ABC_Semap {
    private Semaphore a = new Semaphore(1);
    private Semaphore b = new Semaphore(0);
    private Semaphore c = new Semaphore(0);

    class ThreadA extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    a.acquire();
                    System.out.print("A");
                    b.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class ThreadB extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    b.acquire();
                    System.out.print("B");
                    c.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class ThreadC extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    c.acquire();
                    System.out.print("C");
                    a.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
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

    }

}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-10 15:48
 **/
