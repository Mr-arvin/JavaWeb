package Thread03;

/**
 * 使用多线程运行Task类中的方法
 */
public class SynchronizedTest01 {
    public static void main(String[] args){
        Task01 task = new Task01 ();

        Thread t1 = new Thread (){
            @Override
            public void run() {
                super.run ();
                task.changeNum (true);
            }
        };
        Thread t2 = new Thread (){
            @Override
            public void run() {
                super.run ();
                task.changeNum (false);
            }
        };

        t1.start ();//线程安全出问题了，多个线程同时共享一个堆内存，并且同时修改同一个堆内存（同时运行changeNum方法修改num值）。
        t2.start (); //打印出两个66，因为堆内存共享，两个线程中num指向同一个堆内存，连续修改88、66切换，还没来得及打印就切换了，主线程的两个栈不共享。

    }
}
