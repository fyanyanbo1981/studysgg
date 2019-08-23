package com.atsgg.java;

import java.util.Date;

public class SettingDemo {
    private final static String flag = "aaa";

    private String name;

    public static String getFlag() {
        return flag;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public SettingDemo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public SettingDemo(String name) {
        this.name = name;
    }

    public SettingDemo() {
    }

    private String age;
    public static void main(String []args){

        systemStr();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }


    }

    private static void systemStr() {
        System.out.println("aaaa");
        System.out.println("bbb");
        new Date();

        System.out.println("bbb");
        System.out.println("bbb");
    }
}
