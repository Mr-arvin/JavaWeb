package Arrays05;

import java.util.Scanner;

/**
 * 酒店管理系统
 */

public class Test {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println ("欢迎使用酒店管理系统");
        Hotel h = new Hotel ();
        h.print ();

        //要一个死循环让用户一直等待输入，如果没有while扩起来，
        while (true){
            System.out.println ("请输入'预定'还是'退房'");
            String order = s.next(); //程序执行到这里的时候会等待用户的输入
            if(order.equals ("预定")){
                System.out.println ("请输入房间编号");
                String id = s.next ();
                h.order (id);
            }else if(order.equals ("退房")){
                System.out.println ("请输入房间编号");
                String id = s.next ();
                h.checkOut (id);
            }else {
                System.out.println ("请正确输入'预定'还是'退房'");
            }

            h.print ();
        }


    }
}
