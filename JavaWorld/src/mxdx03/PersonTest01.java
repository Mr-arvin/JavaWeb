package mxdx03;

class PersonTest01 {
    public static void main(String[] args){
        Person p = new Person();
        p.setAge(-10); //错误年龄

        p.setAge(10); //正确年龄
        p.setName("喵喵");
        System.out.println(p.getAge());
        System.out.println(p.getName());

    }
}
