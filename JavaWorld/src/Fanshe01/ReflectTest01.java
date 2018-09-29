package Fanshe01;

/**
 * 获取.class文件中的Class的对象
 */
public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1 = Class.forName ("Fanshe01.Person");

        Class clazz2 = Person.class;

        Person p = new Person ();
        Class clazz3 = p.getClass ();

        System.out.println (clazz1 == clazz2);
        System.out.println (clazz2 == clazz3);

        System.out.println (clazz1.toString ());


    }
}
