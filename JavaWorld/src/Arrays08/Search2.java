package Arrays08;
//二分法查找原理
public class Search2 {
    public static void main(String[] args){
        int[] a = {1,5,8,15,16,19,33,55};
        int desElelment = 33;
        int result = binarySearch (a, desElelment);
        System.out.println (result);
    }

    public static int binarySearch(int[] a, int desElelment) {

        //首位置和末位置的元素下标
        int begin = 0;
        int end = a.length - 1;

        while (begin <= end){
            int middle = (begin + end) / 2; //数组中间位置元素下标
            if(a[middle] == desElelment){
                return middle;
            }else if(a[middle] > desElelment){ //说明在数组的前半部分
                end = middle - 1;
            }else if(a[middle] < desElelment){ //说明在数组的后半部分
                begin = middle + 1;
            }
        }

        return -1;
    }
}
