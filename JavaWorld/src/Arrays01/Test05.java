package Arrays01;

public class Test05 {
    public static void main(String[] args){
        int[] intArray = {10,14,13,2};
        m1(intArray);
        for(int i = 0; i < intArray.length; i ++){
            System.out.println(intArray[i]);
        }
    }

    public static void m1(int[] a){ //数组是引用数据类型，a和intArray两个数组指向同一块堆内存空间
        a[1] = 55;
    } //数组指向一个地址
}
