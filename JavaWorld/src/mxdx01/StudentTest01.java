package mxdx01;

public class StudentTest01 {
    public static void main(String[] args){
        Student s = new Student();
        s.id = 1001;
        s.name = "邢淼";
        s.sex = true;
        s.age = 29;
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.sex?"男":"女");
        System.out.println(s.age);

        s.study();
        s.love("薇薇");
        s.takeExer("玩游戏");
    }
}
