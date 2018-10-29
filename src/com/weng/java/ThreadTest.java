package com.weng.java;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程"+this.getName()+"在执行");
        }
    }
}
