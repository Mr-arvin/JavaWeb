package mxdx09;

//this是当前对象的引用，而静态方法根本没有在堆内存里面，存放在方法区里面，所以不能用this.的方式访问静态方法；

public class Static01 {
    int i;
    public void m1(){
        System.out.println(i);
        System.out.println("非静态m1方法");
    }

    public static void m2(){

        System.out.println("静态方法m2");
    }

    public static void main(String[] args){
        Static01 s = new Static01();
        s.m1();
        m2();  //静态方法可以直接调用静态方法
        Static01.m2();//开发中建议这么写
        s = null;
        s.m2(); //开发中不建议这么调用静态方法
    }
}
