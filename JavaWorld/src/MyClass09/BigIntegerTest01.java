package MyClass09;

import java.math.BigInteger;

/**
 * BigInteger简介 在long和int满足不了开发的时候
 */
public class BigIntegerTest01 {
    public static void main(String[] args){
        BigInteger b1 = new BigInteger ("100");
        BigInteger b2 = new BigInteger ("2");

        System.out.println (b1.add(b2));//+ 102
        System.out.println (b1.subtract (b2));//- 98
        System.out.println (b1.multiply (b2));//* 200
        System.out.println (b1.divide (b2));//  / 50

        System.out.println ("----------------------");

        BigInteger[] array = b1.divideAndRemainder (b2); //数组
        for(int i=0; i<array.length;i++){
            System.out.println (array[i]);
        }
    }
}
