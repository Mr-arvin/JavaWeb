package Arrays01;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {8,13,23,55,22,26};
        reverseArray1 (arr);


        int[] arr2 = {8,13,23,55,22,26};

        reverseArray2 (arr2);

    }

    private static void reverseArray1(int[] arr) {
        for(int i=0; i < arr.length/2; i++){ //arr.length/2 默认向下取整
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }

        for(int i=0; i < arr.length; i++){
            System.out.println (arr[i]);
        }
    }

    private static void reverseArray2(int[] arr2){
        for(int i=arr2.length; i>0; i--){
            System.out.println (arr2[i - 1]);
        }
    }
}
