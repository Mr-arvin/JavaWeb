package MyClass07;

import java.util.Calendar;

/**
 * Calendar
 */
public class DateTest04 {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance ();
        int i = c.get(Calendar.DAY_OF_WEEK);
        System.out.println (i); //2 这周第二天，美国人将周日当作一周的第一天，所以这里表示周一
        System.out.println (c.get(Calendar.DAY_OF_MONTH)); //今天是这个月的第二天
    }
}
