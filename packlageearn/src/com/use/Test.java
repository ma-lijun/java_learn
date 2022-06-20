package com.use;
import com.xiangming.Dog;

public class Test {
    public static void main(String[] args){
        // 包内类的第一种方法
        Dog dog = new Dog();
        System.out.println(dog);

        // 包的第二种使用方式
        com.xiaoqiang.Dog dog2 = new com.xiaoqiang.Dog();
        System.out.println(dog2);

    }
}

/*
* 包名命名规范：
* 只能数字下划线小圆点，但是不能包含关键字和保留字
*
* 规范
* 小写字母  + 小圆点
*
* com.公司名称.项目名.业务模块名
*
* 比如： com.zzsoft.oa.model;   com.zzsfot.oa.controller;
*
* 常用包
* java.lang.*   // 基本包，默认引入， 不需要再引入。
* java.util.*  系统提供的工具包、工具类，使用Scanner
* java.net.*   网络包， 网络开发
* java.awt.*   java的界面开发，GUI
* */