package collection07;

import static java.util.Arrays.sort;

/**
 * 静态导入
 */

public class StaticImport01 {
    public static void main(String[] args){
        int[] arr = {2,1,3,2};
        sort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println (arr[i]);
        }
    }
}
