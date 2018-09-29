package Arrays01;

public class MaxArray {
    public static void main(String[] args){
        int[] arr={8,2,1,5,43,2};
        int max = getMax (arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
