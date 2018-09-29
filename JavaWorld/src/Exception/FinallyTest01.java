package Exception;

public class FinallyTest01 {
    public static void main(String[] args){
        try {
            System.out.println(1024/0);
        }catch (ArithmeticException e){
            System.out.println("catch中的语句");

        }finally {
            System.out.println("finally中的语句");
        }
    }
}
