package day2;

import java.util.Scanner;

public class Login {
   public static void main(String[] args) {
       String rightUsername="admin";
       String rightPassword="123456";
        Scanner sc = new Scanner(System.in);
      //有三次机会
         for(int i=0;i<3;i++){
              System.out.println("登录系统");
        System.out.println("请输入用户名");
      
        String username=sc.nextLine();
        System.out.println("请输入密码");
        String password=sc.nextLine();
        if(username.equals(rightUsername)&&password.equals(rightPassword)){
            System.out.println("登录成功");
           break;
        }else{
            System.out.println("登录失败");
        }

}

