package MyClass07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date 转换为 String类型
 */
public class DateTest02 {
    public static void main(String[] args){
        Date d1 = new Date ();
        System.out.println (d1); //Mon Jul 02 22:44:18 CST 2018 当前时间
        Date d2 = new Date (0L);
        System.out.println (d2); //hu Jan 01 08:00:00 CST 1970

        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 hh时mm分ss秒 SSS毫秒");//yyyy-MM-dd hh:mm:ss SSS
        String d3 = sdf.format (d1);
        System.out.println (d3);


    }
}
