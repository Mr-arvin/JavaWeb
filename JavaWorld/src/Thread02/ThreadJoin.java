package Thread02;

/**
 * 线程的加入
 */

public class ThreadJoin {
    public static void main(String[] args){
        Thread t1 = new Thread (){
            @Override
            public void run() {
                super.run ();
                for (int i=0; i<1000; i++){
                    System.out.println ("monkey");
                }
            }
        };

        Thread t2 = new Thread (){
            @Override
            public void run() {
                super.run ();
                for (int i=0; i<1000; i++){
                    if (i == 10){//当i==10的时候，执行第一线程
                        try {
                            t1.join();//加入t1线程,这两个线程就变成一个线程
                        } catch (InterruptedException e) {
                            e.printStackTrace ();
                        }
                    }
                    System.out.println ("1024");
                }
            }
        };

        t1.start ();
        t2.start ();
    }
}
