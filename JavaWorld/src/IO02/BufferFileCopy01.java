package IO02;

import java.io.*;

/**
 * 需求：使用缓冲流将java.txt文件复制到file文件夹里，并且重命名为good.txt
 */
public class BufferFileCopy01 {
    public static void main(String[] args){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream (new FileInputStream ("src" + File.separator + "IO" + File.separator + "java.txt"));
            bos = new BufferedOutputStream (new FileOutputStream ("src" + File.separator + "IO02" +File.separator + "good.txt"));
            int temp;
            while((temp = bis.read ()) != -1){
                bos.write (temp);
            }
            bos.flush ();
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                bis.close ();
                bos.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }
}
