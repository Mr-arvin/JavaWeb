package mxdx01;
//成员变量可以不进行初始化，而局部变量不行
public class Student {
    int id;
    String name;
    boolean sex;
    int age;

    public void study(){
        System.out.println("好好学习天天向上！");
    }

    public void love(String name){
        System.out.println("我在跟" + name + "谈念爱！");
    }

    public void takeExer(String sport){
        System.out.println("我在做" + sport + "运动！");
    }

}


