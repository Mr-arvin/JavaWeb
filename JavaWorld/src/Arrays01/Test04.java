package Arrays01;

public class Test04 {
    public static void main(String[] args){
        int[] intArray = {10,4,3,2,3};
        Test04 test = new Test04();
        test.m2(intArray);
    }

    public void m1(int[] a){
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    public void m2(int[] a){
        this.m1(a);
    }
}
