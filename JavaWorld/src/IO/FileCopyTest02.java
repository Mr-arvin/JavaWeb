package IO;

import java.io.*;

public class FileCopyTest02 {
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream ("src"+ File.separator+"IO"+File.separator+"1024.txt");
            fos = new FileOutputStream ("src"+ File.separator+"IO"+File.separator+"java.txt");
            byte[] arr = new byte[6];
            int temp;
            while ((temp = fis.read (arr)) != -1){
                //fos.write (new String (arr, 0, temp).getBytes ());
                fos.write (arr,0, temp);
                fos.flush ();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                fis.close ();
                fos.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }
}
