package mxdx10;

class Student {
    static {
        System.out.println("只会执行依次静态代码块");
    }
    public Student(){
        System.out.println("构造方法");
    }
    //构造代码块
    {
        System.out.println("构造代码块");
    }
}

public class block01 {
    public static void main(String[] args){
        //局部代码块
        {
            int x = 10;
            System.out.println(x);
        }

        Student s1 = new Student();
        System.out.println("--------------");
        Student s2 = new Student();
        System.out.println(s2);
    }

    static {
        System.out.println("Block01中的静态代码块");
    }
}

