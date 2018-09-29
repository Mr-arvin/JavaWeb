package pakage05;

public class MethodOverload01 {
    public static void main(String[] args){
        System.out.println(sum(10,20));
        System.out.println(sum(10000L,20000L));
        System.out.println(sum(1.0F,2.0F));
        System.out.println(sum(10.24,20.48));
    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static long sum(long a,long b){
        return a + b;
    }
    public static float sum(float a,float b){
        return a + b;
    }
    public static double sum(double a,double b){
        return a + b;
    }
}
