package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream读取文件
 */
public class FileInputStreamTest02 {
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
            //绝对路径
            fis = new FileInputStream ("//Users//xm//JavaWorld//src//IO//monkey.txt");

            byte[] arr = new byte[3];//一次性读取三个字节,减少内存和硬盘之间的通信，提高效率
            int temp;
            while ((temp = fis.read (arr))!= -1){
//                System.out.println (temp);
                System.out.println (new String (arr,0,temp)); //从0位置开始读，读几个；第一次temp = 3；第二次temp = 1；
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
