package Thread02;

/**
 * 让线程睡眠
 * 这里案例倒计时
 */
public class ThreadSleep01 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=10; i>0; i--){
            Thread.sleep (1000);//让当前线程（main主线程）睡眠1000毫秒
            System.out.println ("倒计时："+i);
        }

    }
}
