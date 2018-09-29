package mxdx08;

public class StaticTest {
    public static void main(String[] args){
        Employee e = new Employee();
        System.out.println(e.company); //开发中不建议这样使用
        e = null;
        System.out.println(e.company); //不报错空指针异常，static修饰的变量跟对象没有关系,他会和类一并加载到方法去里面，一直都在方法区那里
        System.out.println(Employee.company); //开发中建议这样写，使用 类名.静态变量名 的方式访问静态变量,static修饰的变量跟类有关系
    }
}

class Employee{
    private String name;
    static  String company = "阿里爸爸";
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
