package Thread04;

/**
 * 任务类，（方法同步）
 */

public class LongTask01 {
    private int num = 0;
    public void changeNum(boolean flag){
        try {
            Thread.sleep (3000);//演示一个耗时三秒的任务，并且这段任务不涉及到线程安全问题
            System.out.println ("执行一个耗时较长的任务");
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        //这个方法中，需要同步的代码块是这部分，而上面耗时操作的代码不涉及到线程安全问题，所以不需要同步

        //Object obj = new Object (); //这样就会使obj指向不同堆内存地址

        synchronized (this){ //不能传上面的obj
            if(flag){
                num = 88;
                System.out.println (Thread.currentThread ().getName () + "======begin");
                System.out.println (Thread.currentThread ().getName () + "======" + num);
                System.out.println (Thread.currentThread ().getName () + "======end");
            }else {
                num = 66;
                System.out.println (Thread.currentThread ().getName () + "======begin");
                System.out.println (Thread.currentThread ().getName () + "======" + num);
                System.out.println (Thread.currentThread ().getName () + "======end");
            }
        };

    }

}


