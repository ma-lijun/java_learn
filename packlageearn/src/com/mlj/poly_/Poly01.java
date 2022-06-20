package com.mlj.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("T");
        Dog dog = new Dog("xiao gou");
        Bone bone = new Bone("xiao gou");

        tom.feed(dog, bone);
    }
}
