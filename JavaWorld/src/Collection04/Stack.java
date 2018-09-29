package Collection04;

import java.util.LinkedList;

/**
 * 1.栈数据结构的特点是先进后出，请使用LinkedList来实现一个栈的数据结构。
 */
public class Stack {
    private LinkedList list = new LinkedList ();
    //压栈
    public void push(Object o){
        list.addLast (o);
    }

    //弹栈
    public Object pop(){
        return list.removeLast ();
    }

    //判断Stack是否为空
    public boolean isEmpty(){
        return list.isEmpty ();
    }

    public LinkedList show(){
        return list;
    }

}
