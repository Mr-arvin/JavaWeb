package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) { //将异常抛出
        try{ //尝试
            FileInputStream fis = new FileInputStream("/2Users/xm/Desktop/index.txt");
            fis.read();
//            可以catch多个Exception，顺序是从小到大，先catch子类，后catch父类
        }catch (FileNotFoundException | NullPointerException e){ //捕捉 FileNotFoundException e是e指向新创建FileNotFoundException对象内存之地
            // FileNotFoundException e = new FileNotFoundException();
//            e.printStackTrace();
            String msg = e.getMessage();
            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("sdfds");
        }
        System.out.println("catch语句后面");

    }
}
