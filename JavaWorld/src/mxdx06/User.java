package mxdx06;

import mxdx05.Animal;

public class User {

    private String name;
    private int age;

    //无参构造方法
    public User(){

        System.out.println("无参构造方法！");
    }

    //有参构造方法 两个User()构成重载
    public User(String _name, int _age){
        name = _name;
        age = _age;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


}
