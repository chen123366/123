package day2;

import java.util.Scanner;

public class Login {
   public static void main(String[] args) {
       String rightUsername="admin";
       String rightPassword="123456";
        System.out.println("登录系统");
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String username=sc.nextLine();
        System.out.println("请输入密码");
        String password=sc.nextLine();
        if(username.equals(rightUsername)&&password.equals(rightPassword)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
