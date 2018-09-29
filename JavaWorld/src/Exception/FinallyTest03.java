package Exception;

public class FinallyTest03 {
    public static void main(String[] args){
        int i = m1();
        System.out.println(i);
    }
    public static  int m1(){
        int i = 10; //int temp = i; return temp;
        try{
            return i;
        }finally {
            i++;
            System.out.println("finally中的i=" + i);
        }
    }
}

