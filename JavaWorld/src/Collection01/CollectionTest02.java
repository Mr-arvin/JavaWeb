package Collection01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {
    @SuppressWarnings ({"rawtypes","unchecked"})
    public static void main(String[] args){
        retainAll ();

    }

    public static void retainAll() {
        Collection c1 = new ArrayList ();
        c1.add ("a");
        c1.add ("b");
        c1.add ("c");
        c1.add ("d");
        c1.add ("d");
        c1.add ("d");
        c1.add ("e");

        Collection c2 = new ArrayList ();
        c2.add ("a");
        c2.add ("b");
        c2.add ("c");
        c2.add ("d");
        c2.add ("e");
        c2.add ("f");

        boolean flag1 = c2.retainAll (c1);
        boolean flag2 = c1.retainAll (c2);
        System.out.println (flag1);//true
        System.out.println (flag2);//false
        System.out.println (c1); //取交集
    }
}
