package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest01 {
    public static void main(String[] args) throws FileNotFoundException { //将异常抛出
        FileInputStream fis = new FileInputStream("/Users/xm/Desktop/index.txt");

    }
}
