package Collection03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings ({"rawtypes","unchecked"})
public class ListTest04 {
    public static void main(String[] args){
        List list = new ArrayList ();
        list.add ("a");
        list.add ("b");
        list.add ("monkey");
        list.add ("d");
        list.add ("e");

        ListIterator listIter = list.listIterator ();

        while (listIter.hasNext ()){ //正序
            System.out.print (listIter.next () + " ");

        }

        System.out.println ();

        while (listIter.hasPrevious ()){ //倒序，先正序输出完一次，才能倒序
            System.out.print (listIter.previous () + " ");
        }

    }
}

