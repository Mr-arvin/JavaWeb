package MyClass03;

/**
 * 使用StringBuffer进行字符串的拼接
 */

public class StringBufferTest02 {

    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer (30);
        sb1.append ("www");
        sb1.append (".");
        sb1.append ("monkey1024");
        sb1.append (".");
        sb1.append ("com");
        System.out.println (sb1);//会自动调用toString()
        System.out.println (sb1.toString ());

        sb1.insert (4,"xm");//插入
        System.out.println (sb1);

        sb1.delete (4,6);
        System.out.println (sb1);//删除
    }

}
