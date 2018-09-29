package mxdx07;

public class Actor {

    private String name; //成员变量

    public void act1(){
        String name = "周润发";
        System.out.println(name); //就近原则，没有this指向，就近指向
        System.out.println(this.name); //this是当前对象的引用，所以this.name指的是当前的成员变量
    }

    public void act2(){
        System.out.println(name); //就近原则，没有this指向，就近指向，act2无法访问act1里面的局部变量
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
