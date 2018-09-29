package IO05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用FileWrite向文本中写中文
 */
public class WriterTest01 {
    public static void main(String[] args){
        try (FileWriter fw = new FileWriter ("src"+ File.separator+"IO05"+File.separator+"java2.txt")) {
            fw.write ("我喜欢的玩法儿 似懂非懂舒服java 发大发");
            fw.write (94);
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
