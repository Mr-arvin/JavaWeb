package Collection04;

import java.util.LinkedList;

/**
 public void addFirst(E e)及addLast(E e)
 public E getFirst()及getLast()
 public E removeFirst()及public E removeLast()
 public E get(int index);
 */
public class LinkedListTest01 {
    public static void main(String[] args){
        LinkedList list = new LinkedList ();
        list.addFirst ("a");
        list.addFirst ("b");
        list.addFirst ("c");
        list.addFirst ("d"); //倒序的

        list.addLast ("a");
        list.addLast ("b");
        list.addLast ("c");
        list.addLast ("d"); //正序的

        list.add (2,"ooo"); //插入某个下标位置,效率低

        System.out.println (list);
        System.out.println (list.getFirst ());
        System.out.println (list.getLast ());

        list.removeFirst ();
        list.removeLast ();
        System.out.println (list);
        System.out.println (list.get (2));//查找效率低

    }

}
