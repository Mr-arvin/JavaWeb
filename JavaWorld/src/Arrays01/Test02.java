package Arrays01;

/**
 * 以下是静态初始化初始数组
 */

public class Test02 {
    public static void main(String[] args){
        int[] intArray = {10,12,8};
        System.out.println(intArray[0]);
        System.out.println(intArray.length); //length没有括号，因为这个length是数组自身的属性，不是方法
        //System.out.println(intArray[3]); //ArrayIndexOutOfBoundsException: 3 数组越界

        for(int i=0; i<intArray.length; i++){ //遍历数组中的元素
            System.out.println(intArray[i]);
        }

        intArray[2] = 2000;

        System.out.println(intArray[2]);


    }
}
