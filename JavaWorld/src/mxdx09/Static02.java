package mxdx09;

public class Static02 {
    //静态语句块里面的内容只会执行依次，再类加载阶段进行执行，会比main先加载


    public Static02(){
        System.out.println("构造方法");
    }
    public static void main(String[] args){
        System.out.println("main方法1");
        System.out.println("main方法2");
        new Static02();
        new Static02();
    }
    static {
        System.out.println("静态语句块1");
    }
    static {
        System.out.println("静态语句块2");
    }
    static {
        System.out.println("静态语句块3");
    }


    //静态语句块至上而下执行
    static int i = 100;
    static {
        System.out.println(i);
    }




}
