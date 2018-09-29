package collection07;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 增强for循环，不能删除
 */

public class ForTest01 {
    public static void main(String[] args){
        List<String> list = new ArrayList<> ();
        list.add ("a");
        list.add ("b");
        list.add ("c");
        list.add ("d");
        //增强for循环遍历集合，好处就是可以简化遍历
        for (String s : list){
            System.out.println (s);
        }

        //删除测试
        for (int i=0; i<list.size ();i++){
            if("b".equals (list.get (i))){
                list.remove (i);
                i--; //防止索引越界，注意！因为经常会忘记自减运算，所以不建议使用
            }
        }
        System.out.println (list);

        //迭代器
        for (ListIterator<String> iter = list.listIterator (); iter.hasNext ();){
            if("d".equals (iter.next ())){
                iter.remove ();
            }
        }
        System.out.println (list);

        //增强for循环 不行
        for (String s : list){
            if("c".equals (s)){
                list.remove (s);
            }
        }
        System.out.println (list);

    }
}
