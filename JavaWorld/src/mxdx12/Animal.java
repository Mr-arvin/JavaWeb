package mxdx12;

public class Animal {
    public String name = "动物";

    String color;
    String category;


    public Animal(){
        System.out.println("animal中的无参数构造方法");
    }

    public Animal(String color,String category){
        this.color = color;
        this.category = category;
    }

    public void eat(){
        System.out.println("动物吃饭");
    }
}
