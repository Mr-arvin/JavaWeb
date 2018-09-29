package Arrays04;

import java.util.Scanner;

/**
 * 如何获取用户输入的数据
 */
public class GetInput {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        String userInput = s.next(); //程序执行到这里的时候会等待用户的输入
        System.out.println ("您输入了："+userInput);
    }
}
