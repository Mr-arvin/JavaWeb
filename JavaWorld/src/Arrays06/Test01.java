package Arrays06;

/**
 * 通过数组拷贝进行扩容,我的个人理解其实也就是覆盖吧
 */

public class Test01 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {8,9,10,11,12,13,14,15,16,17,18};
        System.arraycopy (a,0,b,1,6);
        for (int i=0; i<b.length; i++){
            System.out.println (b[i]);
        }
    }
}
