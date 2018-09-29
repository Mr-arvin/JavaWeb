package Thread03;

/**
 * 任务类，（方法同步）
 */
public class Task01 {
    private int num = 0;
    //同步和异，没有加synchronized之前可以理解为这个方法是异步的，synchronized锁住的是同一个对象
    public synchronized void changeNum(boolean flag){
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
    }

}


