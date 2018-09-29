package Arrays07;

public class Sort2 {
    public static void main(String[] args){
        sorts ();
    }

    public static void sorts(){
        int[] a = {1,2,4,5,6,8,3,7,77};
        for (int i=a.length-1; i>0; i--){
            //j<i可以使排序次数减少，增加效率
            for (int j=0; j<i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i=0; i<a.length;i++){
            System.out.print (a[i] + " ");
        }
    }
}
