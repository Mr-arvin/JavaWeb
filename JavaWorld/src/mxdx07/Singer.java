package mxdx07;

public class Singer {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void m1(){
        m2();
        this.m2();//这两种方式都可以调用到m2方法；
        System.out.println(this);
    }

    public void m2(){
        System.out.println("唱歌");
    }

}
