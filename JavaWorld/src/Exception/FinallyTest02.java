package Exception;

public class FinallyTest02 {
   public static void main(String[] args){
       int result = m1();
       System.out.println(result);
   }

   public static int m1(){
       try {
           int i = 1024;
           System.exit(0);
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           System.out.println("finally");
       }
       return 10;
   }
}



