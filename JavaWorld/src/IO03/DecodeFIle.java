package IO03;

import java.io.*;

/**
 * 解密文件
 */
public class DecodeFIle {
    public static void main(String[] args){
        try (
                BufferedInputStream bis = new BufferedInputStream (new FileInputStream ("src"+ File.separator+"IO03"+File.separator+"img2.png"));
                BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("src"+File.separator+"IO03"+File.separator+"img3.png"))
        ) {
            int temp;
            while ((temp = bis.read ()) != -1){
                bos.write (temp ^ 88); //^ 异或两次结果就是它本身（前面 CodeFile01中已经异或了一次了）
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
