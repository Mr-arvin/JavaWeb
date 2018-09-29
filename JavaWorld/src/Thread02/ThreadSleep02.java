package Thread02;

/**
 * 让线程交替执行的效果
 * 这里案例倒计时
 */
public class ThreadSleep02 {
    public static void main(String[] args) throws InterruptedException {

        new Thread (){
            @Override
            public void run() {
                super.run ();
                for (int i=0; i<10; i++){
                    try {
                        Thread.sleep (1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                    System.out.println ("monkey");
                }
            }
        }.start ();

        new Thread (){
            @Override
            public void run() {
                super.run ();
                for (int i=0; i<10; i++){
                    try {
                        Thread.sleep (1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                    System.out.println ("1024");
                }
            }
        }.start ();
    }
}
