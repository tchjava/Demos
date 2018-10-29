package com.weng.java;


import java.util.Date;

public class FirstDemo {
    public static void main(String[] args) {


        try {
            sysoHello("nihao");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Student stu=new Student();
        stu.setId(1L);

        //引入引用包
        Date date=new Date();
        long time = date.getTime();

    }

    public static void sysoHello(String name)throws Exception{
        System.out.println(name);
    }
}
