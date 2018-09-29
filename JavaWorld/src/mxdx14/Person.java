package mxdx14;

public class Person {

//    public void drive(Benz bc){
//        bc.run();
//    }
//
//    public void drive(BMW bm){
//        bm.run();
//    }


    public void drive(Car c){   //这就是多态 优点是提高了代码的扩展性  在开发中注意要面向抽象编程，不要面向具体编程 car比bmw更抽象
        c.run();
    }
}
