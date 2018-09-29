package MyClass09;

import java.math.BigDecimal;

/**
 * BigDecimal简介
 */
public class BigDecimalTest01 {
    public static void main(String[] args){

        //开发中这两种都不要写，不够精确

        System.out.println (2.0 - 1.1); //0.8999999999999999 所以要加工
        BigDecimal bd1 = new BigDecimal (2.0);
        BigDecimal bd2 = new BigDecimal (1.1);
        System.out.println (bd1.subtract (bd2)); //0.899999999999999911182158029987476766109466552734375 更加精确了

        //正确方式一（开发中建议使用这中方式）
        BigDecimal bd3 = new BigDecimal ("2.0");//new一个方法
        BigDecimal bd4 = new BigDecimal ("1.1");
        System.out.println (bd3.subtract (bd4)); //0.9 正确

        //正确方式二
        BigDecimal bd5 = BigDecimal.valueOf (2.0);//不用new 直接点
        BigDecimal bd6 = BigDecimal.valueOf (1.1);
        System.out.println (bd5.subtract (bd6));
    }
}
