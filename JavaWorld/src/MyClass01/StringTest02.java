package MyClass01;

public class StringTest02 {
    public static void main(String[] args){
        String s1 = "monkey1024";
        String s2 = "monkey1024";

        s1 = "good";//系统会在常量池里面重新开辟一块内存 存放good。而String s2 = "monkey1024"中的"monkey1024"没有被改变。

        String s3 = "hello"; //系统会在常量池里面重新开辟一块内存 存放"hello"。
        String s4 = "hello"; //系统会在常量池里面重新开辟一块内存 存放"hello"。 s3、s4是指向同一个hello
        String s5 = new String("monkey"); //系统会在常量池里面重新开辟一块内存 存放"monkey", 并且堆内存里面也开辟了一块内存 存放"monkey"。
        String s6 = new String("monkey"); //系统会在常量池里面重新开辟一块内存 存放"monkey", 并且堆内存里面也开辟了一块内存 存放"monkey"。

        System.out.println (s3 == s4);
        System.out.println (s3.equals (s4)); //string已经帮重写了equals

        System.out.println (s5 == s6);
        System.out.println (s5.equals (s6));

        String s7 = "a";
        String s8 = "b";
        String s9 = "ab";
        String s10 = s7 + s8; //"ab" 拼接字符串时候，系统会开辟新的内存空间来存放"ab"
        System.out.println (s9 == s10);

        //所以尽量避免对String对象进行拼接操作，影响性能，尤其是for循环,建议使用StringBuffer或者是StringBuilder
        String s11 = ""; //双引号+基本数据类型会自动转换成字符串类型
        for (int i=0; i<100; i++){
            s11 += i;
        }
        System.out.println (s11);

    }
}
