package Thread08;

/**
 * 单例模式：保证软件在运行时，某个类在内存中只有一个对象
 */
public class SingletonTest01 {

    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance ();
        Singleton s2 = Singleton.getInstance ();
        System.out.println (s1 == s2);//true,内存地址相同，同一个对象。
    }

}

//饿汉式（无论外部有没有调用它，都会new对象）
class Singleton {
    //1.构造方法私有化
    private Singleton(){

    }

    //2.创建当前类的对象
    private static Singleton s = new Singleton ();

    //3.创建公共方法，将对象暴露给外部
    public static Singleton getInstance() {
        return s;
    }
}