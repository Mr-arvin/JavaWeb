package MyClass05;

/**
 * 自动拆箱和自动装箱
 * jdk5之后加入
 */
public class BoxTest01 {
    public static void main(String[] args){
        //自动装箱，就是将基本数据类型自动转换成其相应的包装类
        Integer i1 = 10;

        //自动拆箱
        Integer i2 = new Integer (20);
        int i3 = i2;

        Integer i4 = 888; //new Integer(888);
        Integer i5 = 888; //new Integer(888);

        System.out.println (i4 == i5);//false 内存地址不同
        System.out.println (i4.equals (i5));//true 判断两个Integer类型是否相等要使用equals方法

        Integer i6 = 127;
        Integer i7 = 127;
        System.out.println (i6 == i7);;//true 在java里面有一个整型常量池，如果定义的Integer的值在-128～127之间，会在整型常量池里面直接获取。内存地址就都是整型常量值中的地址

        Integer i8 = 128;
        Integer i9 = 128;
        System.out.println (i8 == i9);//false
    }
}
