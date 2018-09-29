package Arrays06;

public class Sort1 {
    public static void main(String[] args){
        Sort1 a = new Sort1 ();
        a.arr ();
    }
    public void arr(){
        //遍历数组长度-1即可完成排序
        int[] a = {1,2,4,5,6,8,3,3,7,77};
        //假设i位置上的元素是最小的
        for(int i=0; i<a.length-1;i++){
            int min = i;
            for(int j=i+1; j<a.length;j++){
                if(a[min] > a[j]){
                    //获取最小值所在数组下标位置
                    min = j;
                }
            }
            System.out.println ();
            if(min != i){ //如果min == i 那么就不用交换位置
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;

            }
        }

        for (int i=0; i<a.length;i++){
            System.out.println (a[i]);
        }

    }
}
