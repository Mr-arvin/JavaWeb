package MyClass04;

/**
 * Integer,int,String三者之间的类型转换
 */
public class IntegerTest02 {
    public static void main(String[] args){
        //int ---> Integer
        Integer i1 = Integer.valueOf (10);
        System.out.println (i1);
        //Integer ---> int
        int i2 = i1.intValue ();
        System.out.println (i2);
        //String ---> Integer
        Integer i3 = Integer.valueOf ("10");
        System.out.println (i3);
        //Integer ---> String
        String s1 = i3.toString ();
        System.out.println (s1);
        //int ---> String
        String s2 = 10 + "";
        System.out.println (s2);
        String s3 = String.valueOf (10);
        System.out.println (s3);
        //String --- int
        int i4 = Integer.parseInt ("10");
        System.out.println (i4);
    }
}
