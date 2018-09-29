package mxdx12;

public class Dog extends Animal {
    public String name = "旺财";
    public void eat(){
        System.out.println("吃狗粮");
    }

    public Dog(){
        super("土豪金","萨摩"); //如果不写，会默认有 super()
//        System.out.println("Dog中的无参构造方法");
    }

    public void m1(){
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
        super.eat();
        this.eat();
        eat();
    }
}
