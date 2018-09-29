package MyClass09;

import java.text.DecimalFormat;

/**
 * DecimalFormat
 */
public class DecimalFormatTest01 {
    public static void main(String[] args){
        //人民币格式
        String RMB = DecimalFormat.getCurrencyInstance ().format (1234567);
        System.out.println (RMB); //￥1,234,567.00

        //加入千分位
        DecimalFormat df1 = new DecimalFormat ("###,###");
        System.out.println (df1.format (1234567));//1,234,567

        //加入千分位，保留三位小数
        DecimalFormat df2 = new DecimalFormat ("###,###.###");
        System.out.println (df2.format (1234567.1234));//1,234,567.123

        //加入千分位，保留四位小数，如果不够后面补零
        DecimalFormat df3 = new DecimalFormat ("###,###.0000");
        System.out.println (df3.format (1234567.123));//1,234,567.1230
    }
}
