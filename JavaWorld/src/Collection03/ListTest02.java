package Collection03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings ({"rawtypes","unchecked"})
public class ListTest02 {
    public static void main(String[] args){
        List list = new ArrayList ();
        list.add ("a");
        list.add ("b");
        list.add ("monkey");
        list.add ("d");
        list.add ("e");

        Iterator iter = list.iterator ();//多态在ArrayList里面实现了Iterator方法

        while (iter.hasNext ()){
            list.add ("1024");//添加元素后会导致list中的元素个数发生变化，因此modCount会不等于expectedModCount; 会抛出ConcurrentModificationException
            System.out.println (iter.next ());
        }

    }
}

//如何解决请看ListTest03
