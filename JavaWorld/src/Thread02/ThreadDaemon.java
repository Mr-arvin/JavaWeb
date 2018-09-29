package Thread02;

/**
 * 守护线程，例如垃圾回收器就是守护线程
 * 守护线程就是老师，非守护线程就是幼儿园小朋友，只要还有一个小朋友在学校没回家，老师就不能走，小朋友走了，老师也要离开学校了
 */

public class ThreadDaemon {
    public static void main(String[] args){
        Thread t1 = new Thread (){
            @Override
            public void run() {
                super.run ();
                for (int i=0; i<100; i++){
                    try {
                        Thread.sleep (1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                    System.out.println ("守护线程");
                }
            }
        };

        Thread t2 = new Thread (){
            @Override
            public void run() {
                super.run ();
                for (int i=0; i<10; i++){
                    try {
                        Thread.sleep (1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                    System.out.println ("非守护线程");
                }
            }
        };

        t1.setDaemon (true);//把t1设置为守护线程

        t1.start ();
        t2.start ();
    }
}
