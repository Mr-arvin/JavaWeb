package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream读取文件
 */
public class FileOutputStreamTest03 {
    public static void main(String[] args){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream ("src"+ File.separator+"IO"+ File.separator +"1024.txt",true); //如果没有该文件，则会自动创建 true是追加写入文字，false是覆盖文字,File.separator支持windows和linux文件分隔符
            String msg = "Hello World234234";
            fos.write(msg.getBytes ());//传byte类型数组，将String类型专程Byte类型
            fos.write("\n".getBytes ());
            fos.write ("java".getBytes ());
            fos.flush ();//刷新一下，保证内存中的内容全部写入到硬盘文件里面
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                fos.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }


    }
}
