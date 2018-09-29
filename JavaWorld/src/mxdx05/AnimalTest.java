package mxdx05;
//Animal a 指向是同一内存地址
//引用数据类型的参数传递，传递的是引用，即引用传递，记住
public class AnimalTest {
    public static void m1(Animal a){
        int age = a.getAge();
        a.setAge(++age);
        System.out.println("m1方法中的age=" + a.getAge());
    }
    public static void main(String[] args){
        Animal a = new Animal();
        System.out.println("main方法中的age=" + a.getAge());
        a.setAge(10);
        System.out.println("main方法中的age=" + a.getAge());
        m1(a); //传递的a是一个引用，而不是对象本身，
        System.out.println("main方法中的age=" + a.getAge());
    }
}
