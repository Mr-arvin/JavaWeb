package MyClass03;

import java.util.Scanner;

/**
 * 问题：字符串反转，例如将"abc"变成"cba"
 * 分析：字符串是由多个字符构成，
 *      String类里面有个方法可以将字符串转换为字符数组
 *      遍历字符数组，倒序输出
 */

public class StringReverse {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        String input = s.next ();

        char[] c = input.toCharArray (); //将字符串转换为字符数组
        System.out.println (c);
        for(int i=c.length-1; i>=0; i--){
            System.out.print (c[i]);
        }
    }

}
