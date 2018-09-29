package IO05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader 去读中文文本解决乱码问题
 */
public class ReaderTest01 {
    public static void main(String[] args){
        try (FileReader fr = new FileReader ("src"+File.separator+"IO05"+File.separator+"java.txt");) {
            int temp;
            while ((temp = fr.read ())!=-1){
                System.out.println ((char)temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
