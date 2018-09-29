package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//使用throws关键字并不是真正的处理异常，而是交给其调用者处理
//并不是说使用throws不好，而是使用throws将问题暴露出来，如何处理，由其调用者处理

public class ExceptionTest02 {
    public static void main(String[] args) throws FileNotFoundException {
        m1();
    }
    public static void m1() throws FileNotFoundException {
        m2();
    }
    public static void m2() throws FileNotFoundException {
        m3();
    }
    public static void m3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/xm/Desktop/index.txt");
    }
}
