package mxdx15;

public class FinalTest01 {
    //public final int k; //final修饰的成员变量必须初始化值

    public static final Double PI = 3.14;  //开发中一般是这么写，这就是不可改变的常量，ps：常量的标识符通常要大写（规范）

    public static void main(String[] args){
    //final int i = 10;
    //int i = 20; //final修饰的局部变量一旦赋值，不可再改变
    }
}

//final class A{
//
//}
//
//class B extends A{   //final修饰的类不能被继承的，没有子女
//
//}



//class c{
//    public final void m1(){
//
//    }
//}
//
//class b extends c {
//    public final void m1(){ //final修饰的方法不能被重写
//
//    }
//}