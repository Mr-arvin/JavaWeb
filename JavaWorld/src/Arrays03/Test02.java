package Arrays03;

/**
 * 动态初始化二维数组
 */
public class Test02 {
    public static void main(String[] args){
        int[][] a = new int[3][8];
        showArray2 (a);

        a[2][1] = 23;

        showArray2 (a);
    }

    private static void showArray2(int[][] a) {
        for(int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length;j++){
                System.out.print (a[i][j]+" ");
            }
            System.out.println ();
        }
    }
}
