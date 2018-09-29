package mxdx06;

public class UserTest01 {
    public static void main(String[] args){
        User u = new User("喵喵",12);
        System.out.println(u.getName());
        System.out.println(u.getAge());

        User u2 = new User();
    }
}
