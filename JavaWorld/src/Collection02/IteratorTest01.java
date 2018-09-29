package Collection02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator
 */
public class IteratorTest01 {
    public static void main(String[] args){
        iters1 ();
        iters2 ();



    }

    private static void iters1() {
        Collection c = new ArrayList ();//多态
        c.add (new Person ("张三1",21));
        c.add (new Person ("张三2",22));
        c.add (new Person ("张三3",23));
        c.add (new Person ("张三4",24));
        c.add (new Person ("张三5",25));

        //多态在ArrayList里面实现了Iterator方法
        Iterator iter = c.iterator ();//多态
//        System.out.println (iter.next ());
//        System.out.println (iter.next ());
//        System.out.println (iter.next ());
//        System.out.println (iter.next ());
//        System.out.println (iter.hasNext ());

        while (iter.hasNext ()){
            System.out.println (iter.next ());
        }
    }

    private static void iters2() {
        Collection c = new ArrayList ();//多态
        c.add (new Person ("张三1",21));
        c.add (new Person ("张三2",22));
        c.add (new Person ("张三3",23));
        c.add (new Person ("张三4",24));
        c.add (new Person ("张三5",25));

        //多态在ArrayList里面实现了Iterator方法
//        System.out.println (iter.next ());
//        System.out.println (iter.next ());
//        System.out.println (iter.next ());
//        System.out.println (iter.next ());
//        System.out.println (iter.hasNext ());

        for (Iterator iter = c.iterator (); iter.hasNext (); ){
            System.out.println (iter.next ());
        }
    }
}
