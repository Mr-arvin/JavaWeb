package Thread02;

/**
 * 中断（唤醒）正在睡眠的线程
 */
public class ThreadInterrupt {
    public static void main(String[] args){
        Thread t1 = new Thread (){

            @Override
            public void run() {
                super.run ();
                try {
                    Thread.sleep (1000000000L);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
                for (int i=0; i<100; i++){
                    System.out.println ("sleep");
                }
            }
        };

        t1.start ();

        t1.interrupt ();//唤醒睡眠中 线程

    }
}
