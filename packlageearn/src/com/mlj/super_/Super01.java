package com.mlj.super_;

public class Super01 {
}

class A{
    //    四个属性
    public int n1=100;
    protected int n2=200;
    int n3 = 300;
    private int n4 = 400;

    public void m1(){
        // 该方法可以访问四个属性
        System.out.println("n1="+n1+", n2="+n2+", n3="+n3+" , n4="+n4);
    }

    protected void m2(){};

    void m3(){};

    private void m4(){};

    public void hi(){
        // 同一个类中
        m1();
        m2();
        m3();
        m4();
    }
}

class B extends A{
     // 访问父类的属性， 但是不能访问父类的 private 属性
    public  void hi2(){
        System.out.println(super.n1+super.n2+ super.n3);
    }
}