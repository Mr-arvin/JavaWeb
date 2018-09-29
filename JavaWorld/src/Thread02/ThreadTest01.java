package Thread02;

import java.util.concurrent.*;

/**
 * 匿名内部类
 */
public class ThreadTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Thread
        new Thread(){
            @Override
            public void run() {
                super.run ();
                for (int i=0; i<1000; i++){
                    System.out.println ("monkey");
                }
            }
        }.start ();

        //Runnable
        new Thread (new Runnable () {
            @Override
            public void run() {
                for (int i=0; i<1000; i++){
                    System.out.println ("1024");
                }
            }
        }).start ();

        //Callable
        ExecutorService es =Executors.newCachedThreadPool (); //1.创建线程池
        Future<Integer> result = es.submit (new Callable<Integer> () { //2.创建Callable类型对象，重写call方法   //3.将Callable类型对象放入到线程中
            @Override
            public Integer call() throws Exception { //4.获取线程返回的Future对象
                return 88;
            }
        });
        System.out.println (result.get ()); //5.获取线程计算的返回结果
        es.shutdown ();//6.关闭线程池
    }
}
