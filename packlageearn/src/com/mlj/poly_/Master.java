package com.mlj.poly_;

public class Master {
    private String name = "xiao wang";
    public Master(String name){};
    public void feed(Dog dog, Bone bone){
        System.out.println("主人 "+ name + "给 " + dog.getName()+ " 吃 " + bone.getName());
    }
}
