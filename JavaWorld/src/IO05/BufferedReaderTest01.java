package IO05;

import java.io.*;

/**
 * 使用BufferedReader读取文本文件
 */

public class BufferedReaderTest01 {
    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader (new FileReader ("src"+ File.separator+"IO05"+File.separator+"java2.txt"));) {
            String msg;
            while ((msg = br.readLine ()) != null){ //一次可以读取一行
                System.out.print(msg);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
