package Arrays01;

/**
 * 动态初始化一维数组
 */

public class Test03 {
    public static void main(String[] args){
        //动态创建一个长度是4的数组
        int[] intArray = new int[4];
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]); //0000
        }

        intArray[0] = 1024;
        intArray[1] = 1025;
        intArray[2] = 1024;
        intArray[3] = 1044;

        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]); //0000
        }

        Object[] objArray = new Object[4];
        for(int i=0; i<objArray.length; i++){
            System.out.println(objArray[i]); //null
        }

        // 综上可知如果动态初始化某类型数组，该初始化值为该类型的初始值

    }
}
