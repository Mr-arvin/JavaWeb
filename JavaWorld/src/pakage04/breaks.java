package pakage04;

public class breaks {
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            System.out.print(i);
            if(i == 5){
                break; //结束离他最近的循环
//                return; //结束的是方法
            }
        }

        for(int i=0; i<10; i++){
            for(int j=0; j<i; j++){
                System.out.print(j+":j\t");
                if(j == 5){
                    break; //只结束了里面这个循环
                }
            }
            System.out.println(i+":i\t");
        }

        outFor:for(int i=0; i<10; i++){
            innerFor:for(int j=0; j<i; j++){
                System.out.print(j+":j\t");
                if(j == 2){
                    break outFor; //只结束了里面这个循环
                }
            }
            System.out.println(i+":i\t");
        }
    }
}
