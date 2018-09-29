package mxdx18;

public class TestEquals {
    public static void main(String[] args){
        String s1 = new String("成龙");
        String s2 = new String("成龙");
        System.out.println(s1.equals(s2)); //String类型中的equals方法已经对对父类equals方法进行重写了
        System.out.println(s1 == s2); //内存地址不一样
    }
}
