package MyClass04;

/**
 byte             Byte
 short            Short
 int                Integer
 long            Long
 float            Float
 double            Double
 char            Character
 boolean            Boolean

 1、Integer是int的包装类，int则是java的一种基本数据类型
 2、Integer变量必须实例化后才能使用，而int变量不需要
 3、Integer实际是对象的引用，当new一个Integer时，实际上是生成一个指针指向此对象；而int则是直接存储数据值
 4、Integer的默认值是null，int的默认值是0

 *
 */
public class IntegerTest01 {
    public static void main(String[] args){
        System.out.println (Integer.MAX_VALUE); //int类型的最大值
        System.out.println (Integer.MIN_VALUE); //int类型的最小值

        Integer i1 = new Integer (100);
        System.out.println (i1);

        Integer i2 = new Integer ("1024"); //如果传"10a24"，不是数字的字符串，会报NumberFormatException
        System.out.println (i2);

        //将Integer转换成int类型
        int i3 = i2.intValue ();
        System.out.println (i3);

        //将String转换成int类型
        int i4 = Integer.parseInt ("323"); //如果传"10a24"，不是数字的字符串，会报NumberFormatException
        System.out.println (i4);

        //将int转换成Integer类型
        Integer i5 = Integer.valueOf (8);
        System.out.println (i5);

        //6的2进制
        String s1 = Integer.toBinaryString (10);
        System.out.println (s1);

        //20的8进制
        String s2 = Integer.toOctalString (10);
        System.out.println (s2);

        //88的16进制
        String s3 = Integer.toHexString (16);
        System.out.println (s3);

    }
}
