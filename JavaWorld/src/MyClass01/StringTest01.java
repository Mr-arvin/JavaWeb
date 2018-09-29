package MyClass01;

public class StringTest01 {
    public static void main(String[] args){
        String s1 = "monkey1024";
        String s2 = "monkey1024";

        s1 = "good";//系统会在常量池里面重新开辟一块内存 存放good。而String s2 = "monkey1024"中的"monkey1024"没有被改变。

        System.out.println (s1);
        System.out.println (s2);

        String s3 = "hello"; //系统会在常量池里面重新开辟一块内存 存放"hello"。
        String s4 = new String("monkey"); //系统会在常量池里面重新开辟一块内存 存放"monkey", 并且堆内存里面也开辟了一块内存 存放"monkey"。
    }
}
