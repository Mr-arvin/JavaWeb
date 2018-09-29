package mxdx14;

public class Test01 {
    public static void main(String[] args){
        Person james = new Person();
        Benz bc = new Benz();
        james.drive(bc);

        BMW bm = new BMW();
        james.drive(new BMW());

        james.drive(new BMW());


    }
}
