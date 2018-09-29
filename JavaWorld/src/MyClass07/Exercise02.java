package MyClass07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 问题：算一下你来到这个世界多少天了
 * 分析：用当前日期毫秒数减去生日毫秒数，再将毫秒转换为天数即可。
 */
public class Exercise02 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date ();
        String birth = "1990-04-14";
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        Date birthday = sdf.parse (birth);
        long now = d.getTime();
        long b = birthday.getTime ();
        long day = now - b;
        System.out.println (day/(1000*60*60*24)+"天");//将毫秒换算成天数
    }
}
