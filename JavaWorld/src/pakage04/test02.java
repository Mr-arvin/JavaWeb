package pakage04;

public class test02 {
    public static void main(String[] args){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                if(i == j){
                    System.out.println(j+"*"+i+"="+i*j+"\t");
                }else {
                    System.out.print(j+"*"+i+"="+i*j+"\t");
                }
            }
        }
    }
}
