package Thread02;

/**
 * Thread类中的setPriority方法设置线程的优先级
 * 取值范围是整数1~10,优先级随着数字的增大而增强
 */

public class ThreadPriority {

    public static void main(String[] args){
        Thread t1 = new Thread (){
            @Override
            public void run() {
                super.run ();
                for(int i=0; i<100; i++){
                    System.out.println ("monkey");
                }
            }
        };

        Thread t2 = new Thread (){
            @Override
            public void run() {
                super.run ();
                for(int i=0; i<100; i++){
                    System.out.println ("1024");
                }
            }
        };

        //设置线程优先级
        //t1.setPriority (2);
        //t2.setPriority (8);

        t1.setPriority (Thread.MAX_PRIORITY);
        t2.setPriority (Thread.MIN_PRIORITY);

        t1.start ();
        t2.start ();
    }

}
