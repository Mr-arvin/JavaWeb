package Thread02;

/**
 * 设置和获取线程名字
 */

public class ThreadName {
    public static void main(String[] args){
        method1 ();

        method2 ();

        method3 ();
    }

    private static void method3() {
        Thread t1 = new Thread (){
            public void run(){
                System.out.println ("我是"+getName ()+"tent 讯一直等着你");
            }
        };
        t1.setName ("马化腾");
        t1.start ();

        Thread t2 = new Thread (){
            public void run(){
                System.out.println ("我是"+getName ()+"tent 讯一直等着你");
            }
        };
        t2.start ();
    }

    private static void method2() {
        new Thread (){
            @Override
            public void run() {
                super.run ();
                this.setName ("我叫小胖胖");
                System.out.println (getName ());
            }
        }.start ();
    }

    private static void method1() {
        new Thread ("马化腾"){
            @Override
            public void run() {
                super.run ();
                System.out.println ("我是"+getName ()+",欢迎你来腾讯！");
            }
        }.start ();

        new Thread ("马云"){
            @Override
            public void run() {
                super.run ();
                System.out.println ("我是"+getName ()+",阿里巴巴欢迎你！");
            }
        }.start ();
    }
}
