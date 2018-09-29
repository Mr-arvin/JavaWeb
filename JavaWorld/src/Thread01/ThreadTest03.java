package Thread01;

import java.util.concurrent.*;

public class ThreadTest03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //4.创建ExecutionException线程池
        ExecutorService es = Executors.newFixedThreadPool (2);
        //5.将自定义类的对象放入线程池里面
        Future<Integer> f1 = es.submit (new MyCallable (5));
        Future<Integer> f2 = es.submit (new MyCallable (3));
        //6.获取线程的返回结果
//        System.out.println (f1.get ());
//        System.out.println (f2.get ());

        //判断线程中国呢的任务是否执行完毕
        if(f1.isDone ()){
            System.out.println (f1.get ());
        }else {
            System.out.println ("f1线程中的任务还未执行完毕");
        }

        if(f2.isDone ()){
            System.out.println (f2.get ());
        }else {
            System.out.println ("f1线程中的任务还未执行完毕");
        }

        //7.关闭线程池，不再接手新的线程，未执行完的线程不会被关闭
        es.shutdown ();

        System.out.println ("main方法结束");
    }
}

class MyCallable implements Callable<Integer> {
    public void setCount(int count) {
        this.count = count;
    }

    private int count;

    public MyCallable(int count) {
        this.count = count;
    }

    public MyCallable() {

    }

    @Override
    public Integer call() throws Exception {
        int sum = 1;
        if(count != 0){
            for(int i=1; i<=count; i++){
                sum *= i;
            }
        }else {
            sum = 0;
        }
        return sum;
    }
}
