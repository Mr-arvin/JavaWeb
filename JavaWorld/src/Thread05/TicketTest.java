package Thread05;

public class TicketTest {
    public static void main(String[] args){
        Ticket t = new Ticket ();
        Thread t1 = new Thread (t);
        Thread t2 = new Thread (t);
        Thread t3 = new Thread (t);
        t1.setName ("天猫卖出电影票");
        t2.setName ("万达卖出电影票");
        t3.setName ("淘宝卖出电影票");
        t1.start ();
        t2.start ();
        t3.start ();

    }
}
