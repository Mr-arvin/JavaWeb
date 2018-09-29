package Collection03;

import java.util.ArrayList;
import java.util.List;

/**
 * List
 */
@SuppressWarnings ({"rawtypes","unchecked"})
public class ListTest01 {
    public static void main(String[] args){
//        addTest ();

//        removeTest ();

//        setTest ();


        List l = new ArrayList (); // 多态
        System.out.println (l);
        l.add ("a");
        l.add ("b");
        l.add ("c");
        l.add ("d");
        l.add ("e");
        l.add ("f");
        l.add ("111");
        System.out.println (l.get (0));
        System.out.println (l.get (2));

        for (int i=0; i<l.size ();i++){ //通过List中的下标值遍历
            System.out.println (l.get (i));
        }
    }

    private static void setTest() {
        List l = new ArrayList (); // 多态
        System.out.println (l);
        l.add ("a");
        l.add ("b");
        l.add ("c");
        l.add ("d");
        l.add ("e");
        l.add ("f");
        l.add ("111");
        l.set (2,"u");
        System.out.println (l);
    }

    private static void removeTest() {
        List l = new ArrayList (); // 多态
        System.out.println (l);
        l.add ("a");
        l.add ("b");
        l.add ("c");
        l.add ("d");
        l.add ("e");
        l.add ("f");
        l.add ("111");
        l.remove (0);
        l.remove ("c");
        l.remove ("111");
//        l.remove (111);//不能这么写，111是索引，没有双引号
        l.add (3,"w");//在集合下标某个位置添加元素，索引值>=0并且要<集合.size()
        System.out.println (l);
        //l.add (13,"q");//IndexOutOfBoundsException 下标越界异常
    }

    private static void addTest() {
        List l = new ArrayList (); // 多态
        System.out.println (l);
        l.add ("a");
        l.add ("b");
        l.add ("c");
        l.add ("d");
        l.add ("e");
        l.add ("f");
        l.add ("111");

        l.add (3,"w");//在集合下标某个位置添加元素，索引值>=0并且要<集合.size()
        System.out.println (l);
        //l.add (13,"q");//IndexOutOfBoundsException 下标越界异常
    }
}
