package Collection08;

import java.util.HashSet;
import java.util.Set;

/**
 * Set的特点：元素不能重复，没有索引，存取顺序无序的
 */
public class HashSetTest01 {
    public static void main(String[] args){
        Set<String> set = new HashSet<> (); //集合
        boolean b1 = set.add ("a");
        boolean b2 = set.add ("a");
        set.add ("b");
        set.add ("f");
        set.add ("c");
        set.add ("d");
        System.out.println (b1);
        System.out.println (b2); //Set只能添加一个
        System.out.println (set); //读的数据和存放的数据是不一样的，所以无序的

        for(String s:set){ //ps：只要是能用迭代器遍历，就能使用增强for循环进行对它遍历
            System.out.println (s);
        }
    }
}
