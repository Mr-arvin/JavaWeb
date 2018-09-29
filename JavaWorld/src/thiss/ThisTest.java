package thiss;

public class ThisTest {
    public void eat(){
        System.out.println("fsdfds");
    }
    public void m1(){
        this.eat();
    }
}

class Test1{
    public static void main(String[] args){
        ThisTest t = new ThisTest();
        t.m1();
    }
}