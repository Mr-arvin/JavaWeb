package Thread05;

public class Ticket implements Runnable {
    private int count = 10000;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                if(count <= 0){
                    break;
                }else {
                    count --;
                    System.out.println (Thread.currentThread ().getName () + count + "张");
                };
            }
        }
    }
}
