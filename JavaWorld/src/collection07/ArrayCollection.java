package collection07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组和集合的相互转换
 */

public class ArrayCollection {
    public static void main(String[] args){
        //集合转换为数组
        List<String> list = new ArrayList<> (); //泛型数组集合
        list.add ("a");
        list.add ("b");
        list.add ("c");
        list.add ("d");
        //如果定义的数组长度小于等于list的size时，系统会默认的将数组长度修改为跟list的size一致,如果大于时候，系统不会修改
        String[] s  = list.toArray (new String[5]);//转换成一个5位长度的String类型数组 s
        System.out.println(s);
        for(int i=0;i<s.length;i++){
            System.out.println (s[i]);
        }

        //将数组转换为集合
        String[] arr = {"a","b","c"};
        List<String> arrayList = Arrays.asList (arr);
//        arrayList.add ("d"); //UnsupportedOperationException 因为数组的长度是不可变的 arrayList非之前我们学的那个ArrayList
        System.out.println (arrayList);

    }
}
