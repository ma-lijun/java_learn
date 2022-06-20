package com.mlj.pkg;

import java.util.Arrays;
//import java.util.Scanner;   // 只会引入 java.util.Scanner;
//import java.util.*;   // 会引入 java.util 下的所有类

// 尽量使用哪个类引入哪个类


class Import01 {
    public static void main(String[] args){
        int[] arr = {-1, 20,1 , 3, 99};


        Arrays.sort(arr);


        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}