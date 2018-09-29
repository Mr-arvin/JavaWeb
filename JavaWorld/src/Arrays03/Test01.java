package Arrays03;

/**
 * 静态初始化二位数组
 */
public class Test01 {
    public static void main(String[] args){
        int[][] a = {
                {1,2,3,4,5},
                {11,22,33,44},
                {1024,2048,4096}
        };

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print (a[i][j]+" ");
            }
            System.out.println ();
        }
    }
}
