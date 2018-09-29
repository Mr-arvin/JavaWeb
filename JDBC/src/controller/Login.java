package controller;

import jdbc.bean.User;
import service.LoginService;

import java.util.Scanner;

/**
 * 实现用户登陆功能
 */

public class Login {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("请输入用户名：");
        String name = input.nextLine ();
        System.out.println ("请输入密码：");
        String password = input.nextLine ();

        LoginService ls = new LoginService ();
        User u = ls.findUserByNameAndPassword (name,password);

        if(u == null){
            System.out.println ("用户名或密码错误！");
        }else {
            System.out.println ("登陆成功！");
        }

    }
}
