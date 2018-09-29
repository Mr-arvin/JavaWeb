package Thread02;

public class ThreadObject {
    public static void main(String[] args){
        new Thread (new Runnable () {
            @Override
            public void run() {
                System.out.println (Thread.currentThread ().getName ());// 获取当前线程的对象
            }
        }).start ();

        //主线程的名字
        System.out.println (Thread.currentThread ().getName ()); //main
    }
}
