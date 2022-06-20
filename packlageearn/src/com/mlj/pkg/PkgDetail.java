// package 必须在一个类或者文件的第一行
// 一个类只能在一个包中
package com.mlj.pkg;
// import 放在package 和类定义之间
import java.util.Scanner;
import java.util.Arrays;
import com.mlj.modifiler.A;


public class PkgDetail {

    public static void main(String[] args){
        int[] arr = {1,57,58,6,3,98};
        Arrays.sort(arr);
        // 此处打印不出来
        // System.out.println(arr);
        //  不同包只能访问 public
        A a = new A();
        int a1 = a.n1;

        System.out.println(a.n1);
        a.m1();
//        a.m3();
    }

 }
