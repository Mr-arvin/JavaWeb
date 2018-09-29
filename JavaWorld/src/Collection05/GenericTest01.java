package Collection05;

import Collection04.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 不使用泛型的缺点
 */
public class GenericTest01 {

    public static void main(String[] args){
        List list = new ArrayList ();
        list.add ("monkey");;
        list.add (1024);
        list.add(new Person ("刘德华",51));
        Iterator iter = list.iterator ();
        //因为在list存放这么多种类型的数据，所以在迭代时候要进行多次类型判断
        while (iter.hasNext ()){
            Object o = iter.next ();
            if(o instanceof String){
                String s = (String)o;
            }
            if(o instanceof Integer){
                Integer s = (Integer) o;
            }
            if(o instanceof Person){
                Person s = (Person) o;
            }

        }
        System.out.println (list);
    }
}
