package collection07;

/**
 * 可变参数
 */

public class ArgsTest01 {
    public static void main(String[] args){
        print (1,2,3,4); //int类型
        print2 ("sfd",false,1,2,3);
    }

    public static void print(int ... arr){ //可变参数，可以看作一个数组
        //增强for循环
        for (int i: arr){
            System.out.println (i);
        }

    }

    //如果方法有多个参数，并且有可变参数，那么可变参数应该在最后

    public static void print2(String s,boolean b,int...arr){
        for (int i:arr){
            System.out.println (s+b+i);
        }
    }
}
