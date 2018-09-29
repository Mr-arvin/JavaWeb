package mxdx04;
//因为两次压栈，虽然都叫做i，但两个方法里面的i属于不同的内存地址
//基本数据类型里面的值传递，记住
public class Param {
    static int i = 10;
    public void m1(int i){
        i = i + 1;
        System.out.println("m1方法中的i=" + i);
    }
    public static void m2(int i){
        i = i + 1;
        System.out.println("m2方法中的i=" + i);
    }
    public void m3(){
        int j = 5;
        j = j + 1;
        System.out.println("m3方法中的i=" + i);
    }
    public static void main(String[] args){
        Param p = new Param();
        p.m1(i);

        System.out.println(("main方法中的i=" + i));
        m2(i);
        System.out.println(("main方法中的i=" + i));

        p.m3();
    }

}
