package com.weng.java;

public class SecondeDemo {
    public static void main(String[] args) {
        //创建一个线程
        ThreadTest t1=new ThreadTest();
        //创建二个线程
        ThreadTest t2=new ThreadTest();

        t1.start();
        t2.start();
    }
}
