package day2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String rightUsername = "admin";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);
        //有三次机会
        for (int i = 0; i < 3; i++) {
            System.out.println("登录系统");
            System.out.println("请输入用户名");

            String username = sc.nextLine();
            System.out.println("请输入密码");
            String password = sc.nextLine();
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2)//3次机会已用完
                {
                    System.out.println("账号" + username + "被锁定,请联系客服小姐姐小红");
                } else
                    System.out.println("登录失败，账号或密码错误,您还剩下" + (2 - i) + "次机会");

            }

        }

    }
}
