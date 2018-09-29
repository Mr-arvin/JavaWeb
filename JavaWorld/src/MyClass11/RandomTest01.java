package MyClass11;

import java.util.Random;

/**
 * Random随机数
 */
public class RandomTest01 {
    public static void main(String[] args){
        Random r = new Random ();
        System.out.println (r.nextInt (101));//生产0～100之间的数字

        for(int i=0; i<10; i++){
            System.out.println (r.nextInt (101));
        }
    }
}
