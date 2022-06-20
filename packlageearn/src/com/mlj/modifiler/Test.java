package com.mlj.modifiler;

public class Test {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
//        System.out.println(a.m1(););
        a.m1();
        b.say();
    }
}


// 只有默认和public可以修饰类

class Tiger{}

//public class Tiger2{}  // 一个类文件只能有一个public 方法

//protected class Tiger3{}
//private class Tiger4{}