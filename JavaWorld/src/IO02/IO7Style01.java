package IO02;

import java.io.*;

/**
 * IO流 jdk7 新写法，加入了接口AutoCloseable
 */
public class IO7Style01 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream ("src"+File.separator+"IO02"+File.separator+"good.txt");
            FileOutputStream fos = new FileOutputStream ("src"+File.separator+"IO02"+File.separator+"bad.txt");
            CloseTest ct = new CloseTest();)
        {
            byte[] arr = new byte[8];
            int temp;
            while ((temp = fis.read (arr)) != -1){
                fos.write (arr,0,temp);
            }

            //这里并没有ct.method，说明Close方法是自动调用的
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}


class CloseTest implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println ("已关闭");
    }
}