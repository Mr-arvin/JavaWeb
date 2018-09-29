package mxdx03;

class Person {

    private String name;

    private int age;

    //对外提供公共的访问方式，需要便携set get方法
    public void setName(String _name){
        name = _name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int _age){
        if(_age > 0 && _age < 150){
            age = _age;
        }else {
            System.out.println("请输入有效年龄！");
        }

    }

    public int getAge(){
        return age;
    }

}
