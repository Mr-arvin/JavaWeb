package MyClass07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 问题：编写代码获取2008年8月8号是星期几？
 * 分析：在Calendar里面有个DAY_OF_WEEK可以取得当前日期是这周的第几天；
 * 如果将Calendar里面的时间2008年8月8日，再调用DAY_OF_WEEK属性，就可以取得结果
 */
public class Exercise01 {
    public static void main(String[] args) throws ParseException {
        String s = "2008年8月8日";
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日");
        Date d = sdf.parse (s);
        Calendar c = Calendar.getInstance ();
        c.setTime (d); //设定时间，否则默认为今天
        System.out.println (c.get(Calendar.DAY_OF_WEEK));//6 就是星期五
    }
}
