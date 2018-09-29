
package Collection06;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型通配符

 ? extends E
 向下限定，E及其子类，可以存储当前类型的子类
 ? super E
 向上限定，E及其父类，可以存储当前类型的父类

 */
public class GenericTest01 {
    public static void main(String[] args){
        //等号右边调用一个方法，这个方法返回一个list类型的数据，但是不确定list里面存放的是什么类型的数据
        List<Person> p = new ArrayList<> ();//声明Person类型List泛型数组集合，

        p.add (new Person ("张三",21));
        p.add (new Person ("张四",22));
        p.add (new Person ("张五",23));

        List<Student> s = new ArrayList<> ();//声明Student类型List泛型数组集合，
        s.add (new Student ("等待",12));

        p.addAll (s);
        System.out.println (p);

    }
}
