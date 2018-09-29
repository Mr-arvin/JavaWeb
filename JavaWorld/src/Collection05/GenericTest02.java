package Collection05;

import Collection04.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 使用泛型
 * 优点：
 * 1：可以统一数据类型，提高安全性
 * 2：可以减少类型判断
 */
public class GenericTest02 {
    public static void main(String[] args){
        List<Person> list1 = new ArrayList<Person> ();
        List<Person> list2 = new ArrayList<> (); //jdk7加入的棱形泛型
        list2.add (new Person ("asf",33));//如果放入的不是Person类型的数据，编译就会报错。这种提前报错的好。、
        Iterator<Person> iter = list2.iterator ();

        while (iter.hasNext ()){
            Person p = (Person)iter.next ();
            System.out.println (p);
        }
    }
}
