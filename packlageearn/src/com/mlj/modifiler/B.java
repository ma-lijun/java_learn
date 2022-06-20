package com.mlj.modifiler;

public class B {
    public void say(){
        // 同一个包下不需要导入
        A a = new A();
        // 同一包下可以方法 public、protected 和 默认， 不能访问private
        System.out.println("n1="+a.n1+", n2="+a.n2+", n3="+a.n3);

        a.m1();
        a.m2();
        a.m3();
//        a.m4();

    }
}
