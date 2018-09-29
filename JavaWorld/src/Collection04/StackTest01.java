package Collection04;

/**
 * 测试Stack
 */

public class StackTest01 {
    public static void main(String[] args){
        Stack s = new Stack ();
        s.push ('a');
        s.push ('b');
        s.push ('c');
        s.push ('d');
        System.out.println (s.show ());

        while (!s.isEmpty ()){
            System.out.println (s.pop ());
        }
    }
}
