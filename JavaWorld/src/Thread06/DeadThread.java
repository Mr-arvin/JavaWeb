package Thread06;

/**
 * 死锁
 */

public class DeadThread {
    private static Object obj1 = new Object ();
    private static Object obj2 = new Object ();

    public static void main(String[] args){
        Thread t1 = new Thread (){
            @Override
            public void run() {
                super.run ();
                synchronized (obj1){
                    System.out.println (this.getName () + "锁obj1");
                    synchronized (obj2){
                        System.out.println (this.getName () + "锁obj2");
                    }
                }
            }
        };
        t1.start ();

        Thread t2 = new Thread (){
            @Override
            public void run() {
                super.run ();
                synchronized (obj2){
                    System.out.println (this.getName () + "锁obj2");
                    synchronized (obj1){
                        System.out.println (this.getName () + "锁obj1");
                    }
                }
            }
        };
        t2.start ();
    }
}
