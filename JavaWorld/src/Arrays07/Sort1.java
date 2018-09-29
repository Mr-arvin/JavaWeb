package Arrays07;

public class Sort1 {
    public static void main(String[] args){
        sorts ();
    }

    public static void sorts(){
        int[] a = {98,4,7,5,6,8,3,16,7,77};
        for (int i=0; i<a.length-1; i++){
            for (int j=i; j<a.length-i-1; j++){
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
