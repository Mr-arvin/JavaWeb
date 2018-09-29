package Thread04;

public class SynchronizedTest01 {
    public static long begin1;
    public static long end1;
    public static long begin2;
    public static long end2;
    public static void main(String[] args){
        LongTask01 lt = new LongTask01 ();
        Thread t1 = new Thread (){
            @Override
            public void run() {
                super.run ();
                begin1 = System.currentTimeMillis ();
                lt.changeNum (true);
                end1 = System.currentTimeMillis ();

            }
        };

        Thread t2 = new Thread (){
            @Override
            public void run() {
                super.run ();
                begin2 = System.currentTimeMillis ();
                lt.changeNum (false);
                end2 = System.currentTimeMillis ();

            }
        };

        t1.start ();
        t2.start ();

        try {
            Thread.sleep (8000);//要让main主线程睡一会儿，保证t1和t2线程执行完成之后再计算时间
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        long begin = 0;
        long end = 0;

        if(begin1 > begin2){
            begin = begin2;
        }else {
            begin = begin1;
        }

        if(end1 > end2){
            end = end2;
        }else {
            end = end1;
        }

        System.out.println ((end - begin)/1000);
    }
}
