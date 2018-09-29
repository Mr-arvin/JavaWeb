package pakage06;

public class fact {
    public static void main(String[] args){
        long result = mult(5);
        System.out.println(result);
    }
    public static long mult(long num){
        if(num == 1){
            return num;
        }else {
            return num*mult(num - 1);
        }
    }
}
