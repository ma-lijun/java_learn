package com.mlj.exten_;

public class Base {
    public String name;
    private int age;

    public Base(){
        System.out.println("Base 的无参数 构造器");
    };

    public Base(int age){
        System.out.println("Base(int age) 的构造器被调用 ");
    };
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
