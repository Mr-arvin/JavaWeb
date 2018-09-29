package Collection01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection类存取Person类
 */
public class PersionTest01 {
    public static void main(String[] args){
        Collection c = new ArrayList ();//多态
//        c.add (new Person("张三1",201));
//        c.add (new Person("张三2",202));
//        c.add (new Person("张三3",203));
//        c.add (new Person("张三4",204));
        c.add (new Person("张三5",205));
        c.add (new Person("张三6",206));

        System.out.println (c.size ());

        Object[] o = c.toArray ();
        for(int i=0; i<o.length;i++){
            System.out.println (o[i]); //要重写同 String方法，不然打印出来的你看不懂
        }
        System.out.println (c);

        Person p = new Person ("张三5",205);
        System.out.println (c.contains (p));//false,为啥呢，因为内存地址不同，且我们没有重写同 equals方法，需要重写equals方法

//        c.remove (p);
//        System.out.println (c);
//        c.clear ();
//        System.out.println (c);
    }
}
