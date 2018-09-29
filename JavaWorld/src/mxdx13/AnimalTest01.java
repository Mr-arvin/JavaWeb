package mxdx13;

public class AnimalTest01 {
    public static void main(String[] args){
        Cat c1 = new Cat();
        c1.eat();

        Animal a1 = new Cat(); //父类引用指向子类对象 ，自动类型转换，向上转型
        a1.eat(); //动态绑定和静态绑定(eat方法被重写)

        (new Cat()).eat();

        Animal a2 = new Animal();
        a2.eat();

        System.out.println(a1.num); //说明成员变量不存在重写，重写只存在方法里面
        System.out.println(c1.num); //说明成员变量不存在重写，重写只存在方法里面

        c1.move();

        a1 = (Cat)a1;
        ((Cat) a1).move();
        //((Cat) a2).move();这样是不行的

        //Animal a3 = (Cat)a1;这样是不行的
        Cat a3 = (Cat)a1; //强制类型转换，也叫做向下转型
        a3.move();

        Animal a5 = new Dog();
        //Cat c5 = (Cat)a5; 狗是不可能变成猫的   ClassCastException类型转换错误
        //所以出现了instanceof 判断一个引用类型是否属于某一个类
        if(a2 instanceof Cat){
            Cat c4 = (Cat)a2;
        }else {
            System.out.println("a2不是Cat类型");
        }




    }
}
