package mxdx02;

public class Variable {
    //成员变量
    //基本数据类型
    byte b;
    short s;
    int i;
    char c;
    long l;
    float f;
    double d;
    boolean boo;

    //引用数据类型
    String str;
    public static void main(String[] args){

        Variable var = new Variable();
        System.out.println(var.b);
        System.out.println(var.s);
        System.out.println(var.i);
        System.out.println(var.boo);
        System.out.println(var.l);
        System.out.println(var.f);
        System.out.println(var.d);
        System.out.println(var.str);
        System.out.println(var.c);

    }
}
