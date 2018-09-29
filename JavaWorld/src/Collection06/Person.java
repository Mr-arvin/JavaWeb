package Collection06;

/**
 * Person类
 */
public class Person {
    public String name;
    private int age;
    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override //重写toString方法   没有重写，Duplicate去重不会成功
    public String toString() {
        return "Person[name="+name+",age="+age+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person)obj;
//            System.out.println (this.name+"|||||"+p.getName ());
            if(this.name.equals (p.getName ()) && this.age == p.getAge ()){
                return true;
            }
        }

        return false;

    }
}
