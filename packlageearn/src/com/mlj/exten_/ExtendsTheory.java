package com.mlj.exten_;

public class ExtendsTheory {
    public static void main(String[] args){
        Son son = new Son();
        // 安装查找关系来返回信息
        // 看子类是否有此属性，没有就看父类，直到Object
        System.out.println(son.name);
        System.out.println(son.getAge());
        System.out.println(son.hobby);
    }
}


class GrandPa{
    String name = "大头爷爷";
    String hobby = "釣魚";
}

class Father extends GrandPa{
    String name = "大头爸爸";
    private int age = 35;

    public int getAge() {
        return age;
    }
}

class Son extends Father{
    String name = "大頭兒子";
}