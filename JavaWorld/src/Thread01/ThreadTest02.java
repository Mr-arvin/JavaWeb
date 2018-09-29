package Thread01;

public class ThreadTest02 {
    public static void main(String[] args){
        MyRunnable mr = new MyRunnable ();
        //5.创建Thread对象并将上面自定义类对象作为参数传递给Thread的构造方法；
        Thread tr = new Thread (mr);
        tr.start ();
        for (int i=0; i<500; i++){
            System.out.println ("1023");
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<500; i++){
            System.out.println ("monkey");
        }
    }
}
