package com.mlj.override_;

// 重写
public class Annimal {
    // 1 返回类型、方法名、参数均相同
    // 2 返回类型可以死是浮力的子类型，或者一样
    // 3 子类不能缩小父类方法的访问权限
    public void cry(){
        System.out.println("动物叫****");
    }
}
