package Thread01;

public class ThreadTest01 {
    public static void main(String[] args){
        //4.创建自定义类的对象
        MyThread mt1 = new MyThread ();
        //4.使用start方法启动线程
        mt1.start ();

        MyThread mt2 = new MyThread ();
        mt2.start ();

        for (int i=0; i<5; i++){
            System.out.println ("1024");
        }
    }
}

//1.继承一个java.lang包下的thread类
class MyThread extends Thread {
    //重写run方法

    @Override
    public void run() {
        super.run ();
        //3.将要在线程执行的代码编写在run方法中
        for(int i=0; i<5; i++){
            System.out.println ("monkey");
        }
    }
}
