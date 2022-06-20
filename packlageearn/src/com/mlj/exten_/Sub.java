package com.mlj.exten_;

public class Sub extends Base{
    public Sub(){
        System.out.println("子类的 Sub() 的无参数构造器 被调用： ");
    };

    public Sub(String name){
        System.out.println("子类的 Sub(String name) 构造器 被调用： ");
    };

    public Sub(String name, int age){
        super(age);
//        this(age);
        System.out.println("子类的 Sub(String name, int age) 构造器 被调用： ");
    };

}
