package Arrays01;

public class Test01 {
    public static void main(String[] args){
        //使用静态初始化的方式创建一纬数组
        int[] i = {1024,2048,256};

        String[] str = {"java","python","c++","php"};

        //创建Object类型的数组 自己理解是不是就是曹鹏飞的json对象？
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] obj = {o1,o2,o3};

        System.out.println(obj.length);
    }
}
