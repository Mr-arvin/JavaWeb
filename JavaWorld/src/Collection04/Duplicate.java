package Collection04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 2.向List里面添加一些Person对象，其中Person中有name和age两个成员变量，请编写去除List中重复的对象的代码
 */

public class Duplicate {
    public static void main(String[] args){
        List list = new ArrayList (); //如果添加查询都多用这个
        list.add (new Person("张三",22));
        list.add (new Person("张四",23));
        list.add (new Person("张四",23));
        list.add (new Person("张五",24));
        list.add (new Person("张五",24));
        list.add (new Person("张六",25));

        //去重之后的newList
        List newList = new LinkedList (); //如果增删都多用这个
        Iterator iter = list.iterator ();
        while (iter.hasNext()){
            Person p = (Person)iter.next ();
            System.out.println (p);
            if(!newList.contains (p)){
                newList.add (p);
            }
        }

        System.out.println (newList);

    }
}
