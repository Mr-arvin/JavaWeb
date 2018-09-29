package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream读取文件
 */
public class FileInputStreamTest01 {
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream ("//Users//xm//JavaWorld//src//IO//monkey.txt");
            /*System.out.println (fis.read ()); //打印的字母码值
            System.out.println (fis.read ()); //
            System.out.println (fis.read ()); //
            System.out.println (fis.read ()); //读取完毕之后返回-1*/

            //使用循环读取
            int temp;
            while ((temp = fis.read () )!= -1){ //fis.read ()读取字节影响效率
                char c = (char)temp; //强转
                System.out.print (c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }finally {
            try {
                fis.close ();//关闭通道
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }


    }
}
