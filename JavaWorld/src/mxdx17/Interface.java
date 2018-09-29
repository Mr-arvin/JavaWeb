package mxdx17;

interface A {
    //public static final double PI = 3.14159262;
    double PI = 3.14159262; //public static final是可以省略的

    //public abstract void m1();
    void m1(); //public abstract 是可以省略的

}

interface B {
    void m2();
}

interface C extends A,B{
    void m3();
}

class MyClass implements C { //implements实现接口c
    public void m1(){

    }
    public void m2(){

    }
    public void m3(){

    }

    public static void main(String[] args){
        MyClass m = new MyClass ();
        m.m1 ();
    }
}

