package MyClass03;

/**
 * StringBuffer构造方法
 */

public class StringBufferTest01 {
    public static void main(String[] args){
        //如果没有明确指出，系统默认长度为16  value = new char[16]
        StringBuffer sb1 = new StringBuffer ();
        System.out.println (sb1.capacity ()); //16 capacity ()可以看到sb的容量

        //建议预估字符串的长度，并且声明StringBuffer的长度
        StringBuffer sb2 = new StringBuffer (100);
        System.out.println (sb2.capacity ());

        StringBuffer sb3 = new StringBuffer ("monkey"); //"monkey".length () + 16
        System.out.println (sb3.capacity ());
    }
}
