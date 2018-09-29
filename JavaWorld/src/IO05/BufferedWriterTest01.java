package IO05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用BufferedWriter向文本文件中写文字
 */
public class BufferedWriterTest01 {
    public static void main(String[] args){
        try (BufferedWriter bw = new BufferedWriter (new FileWriter ("src"+ File.separator+"IO05"+File.separator+"newJava.txt"));) {
            bw.write ("s撒发水淀粉撒发水淀粉");
            bw.newLine ();
            bw.write ("ssdfa 撒发水淀粉撒发水淀粉");
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
