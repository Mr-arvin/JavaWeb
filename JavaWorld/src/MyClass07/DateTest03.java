package MyClass07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将String类型转换为Date类型
 */
public class DateTest03 {
    public static void main(String[] args) throws ParseException {
        String s = "2018年07月02日 10时48分58秒 860毫秒";
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 hh时mm分ss秒 SSS毫秒");
        Date d1 = sdf.parse (s);
        System.out.println (d1);
        d1.getDay ();


    }
}
