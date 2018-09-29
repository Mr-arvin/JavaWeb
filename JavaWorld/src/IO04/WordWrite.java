package IO04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 向文本中写出中文，会有乱码，所以要使用字符流
 */
public class WordWrite {
    public static void main(String[] args){
        try(
                FileOutputStream fos = new FileOutputStream ("src"+ File.separator+"IO04"+File.separator+"java.txt", true);
        ) {
            String msg = "好好学习 ";
            //一个汉子占2个字节，向里面一次传入3个字节会导致乱码
            fos.write (msg.getBytes (),0,3);
            fos.write ("\n".getBytes ());
            fos.write ("\n".getBytes ());
            fos.write ("天天向上".getBytes ());
            fos.close ();
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
