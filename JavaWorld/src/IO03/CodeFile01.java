package IO03;

import java.io.*;

/**
 * 文件加密
 */

public class CodeFile01 {
    public static void main(String[] args){
        try (
                BufferedInputStream bif = new BufferedInputStream (new FileInputStream ("src"+ File.separator+"IO03"+File.separator+"img.png"));
                BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("src"+ File.separator+"IO03"+File.separator+"img2.png"));
        ){
        int temp;
        while ((temp = bif.read ()) != -1){
            bos.write (temp ^ 88);
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
