package pakage04;

public class sum {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;
        int d=40;

        sumVoid(a,b);
        System.out.println(sumInt(c,d));
    }
    public static void sumVoid(int a, int b){
        int sums = a + b;
        System.out.println(sums);
    }
    public static int sumInt(int a, int b){
        int sums = a + b;
        return sums;
    }
}
