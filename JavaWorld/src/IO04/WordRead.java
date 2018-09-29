package IO04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 从文本文件中读取中文,会有乱码，所以要使用字符流
 */
public class WordRead {
    public static void main(String[] args){
        try (FileInputStream fis = new FileInputStream ("src"+ File.separator+"IO04"+File.separator+"java2.txt");){
            byte[] arr = new byte[3];
            int temp;
            while ((temp = fis.read (arr)) != -1){
                System.out.println (new String (arr, 0, temp));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
