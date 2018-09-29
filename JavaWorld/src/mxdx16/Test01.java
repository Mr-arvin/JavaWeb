package mxdx16;

public class Test01 {
    public static void main(String[] args){
        //Car a = new Car(); 抽象类不能被实力化


        Car a = new Benz(); //多态形式来创建是可以的
        a.run();

        Car b = new BMW(); //多态形式来创建是可以的
        b.run();


        Person p = new Person();
        p.drive(new Benz());
        p.drive(new BMW());

    }
}
