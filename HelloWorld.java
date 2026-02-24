package day1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        int []array1=new int []{1,2,3,4,5};
        for (int j : array1) {
            System.out.println(j);
        }
        System.out.println("-----------------------------------------------------------");
        playGame();
        System.out.println("******************************************************************");
        fn(2,3);
        fn(3,4,5);

        System.out.println("================================");
        //输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a=sc.nextInt();
        System.out.println("您输入的整数是："+a);
    }
    //方法定义

    public static void playGame(){
        System.out.println("选英雄");
        System.out.println("准备开始");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }

    //方法重载

    public static void fn(int a, int b){
        System.out.println(a+b);
    }
    public static void fn(int a, int b, int c){
        System.out.println(a+b+c);
    }















}
