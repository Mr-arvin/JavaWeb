package IO05;

import java.io.*;

/**
 * 使用缓冲流拷贝文件
 * 注意：字符流不能读取或拷贝非文本文件，比如图片
 */
public class BufferFileCopy {
    public static void main(String[] args){
        try (
                BufferedReader br = new BufferedReader (new FileReader ("src"+ File.separator+"IO05"+File.separator+"java.txt"));
                BufferedWriter bw = new BufferedWriter (new FileWriter ("src"+ File.separator+"IO05"+File.separator+"copyJava.txt"));
            ) {

            String msg;

            while ((msg = br.readLine ())!= null){
                bw.write (msg);;
                bw.newLine ();
            }

            bw.flush ();

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
