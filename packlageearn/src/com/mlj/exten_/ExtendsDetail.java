package com.mlj.exten_;

public class ExtendsDetail {
    public static void main(String[] args){
        System.out.println("==== 第一个对象 ====");
        Sub sub1 = new Sub();
        System.out.println("==== 第 2 个对象 ====");
        Sub sub2 = new Sub("mlj");
        System.out.println("==== 第 3个对象 ====");
        Sub sub3 = new Sub("mlj", 35);
    }
}
