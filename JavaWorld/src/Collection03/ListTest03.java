package Collection03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings ({"rawtypes","unchecked"})
public class ListTest03 {
    public static void main(String[] args){
        List list = new ArrayList ();
        list.add ("a");
        list.add ("b");
        list.add ("monkey");
        list.add ("d");
        list.add ("e");

        ListIterator listIter = list.listIterator ();

        while(listIter.hasNext ()){
            String s = (String)listIter.next ();
            if("monkey".equals (s)){
                listIter.add ("1024"); //不能list.add向集合中添加元素
            }

        }

        System.out.println (list);

    }
}

