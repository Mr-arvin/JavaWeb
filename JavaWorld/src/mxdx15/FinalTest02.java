package mxdx15;

public class FinalTest02 {
    public static void main(String[] args){
        final Customer c1 = new Customer("邢淼", 30);
        //c1 = new Customer("李四", 22);//final修饰引用数据类型它的指向对象（如今是张三）是不能改变的（不能指向李四）

        c1.name = "mm";
        c1.age = 24;
        System.out.println(c1.name+"---"+c1.age); //说明不能改变的原因是不能改变它指向堆的内存地址，但对象里面的值是可以改变
    }
}

class Customer {
    String name;
    int age;
    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }
}