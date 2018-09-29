package Collection01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection
 *
 boolean add(E e)
 boolean remove(Object o)
 void clear()
 boolean contains(Object o)
 boolean isEmpty()
 int size()
 */
public class CollectionTest01 {
    @SuppressWarnings ({"rawtypes","unchecked"}) //注解
    public static void main(String[] args){
        Collection c = new ArrayList ();
        c.add ("a");
        c.add ("b");
        c.add ("c");
        c.add ("b");
        System.out.println (c.getClass().toString());
        System.out.println (c.size ());//获取集合大小
        System.out.println (c);//ArrayList爷爷类里面有toString方法
        c.remove ("b");//删除第一个b
        System.out.println (c);

        Object[] o = c.toArray ();//将集合 转换 数组
        for (int i=0;i<o.length;i++){
            System.out.println (o[i]);
        }

        c.clear ();//清空集合
        System.out.println (c);

        System.out.println (c.contains ("b"));//false

        System.out.println (c.isEmpty ());//true
    }
}
