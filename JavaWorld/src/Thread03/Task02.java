package Thread03;

/**
 * 任务类，（方法同步）
 */
public class Task02 {
    private int num = 0;
    public void changeNum(boolean flag){
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


