package Thread08;

/**
 * 单例模式：保证软件在运行时，某个类在内存中只有一个对象
 */
public class SingletonTest02 {

    public static void main(String[] args){
        Singleton2 s1 = Singleton2.getInstance ();
        Singleton2 s2 = Singleton2.getInstance ();
        System.out.println (s1 == s2);//true,内存地址相同，同一个对象。
    }

}

//懒汉式，单例的延迟加载
class Singleton2 {
    //1.构造方法私有化
    private Singleton2(){

    }

    //2.创建当前类的引用
    private volatile static Singleton2 s = null;

    //3.  判断s是否为null，如果是空的话，则创建一个Singleton的对象，否则直接返回s
    public synchronized static Singleton2 getInstance() {
        if(s == null){
            s = new Singleton2 ();
        }

        return s;
    }
}