package MyClass03;

/**
 * 传递的是基本数据类型，值不会改变
 * 传递时是引用数据类型，值会改变
 *
 * 分析：
 * 基本数据类型按值传递，相当于复制了一份过去，
 * 引用数据按地址传递，两个地方根据地址使用同一份数据，如被更改，
 * 则原有数据也会更改，例如数组，在传递数组时，如果接收到数组之后，
 * 对其修改，那么原来的数组也会同时修改，因为它们指向同一个地址！

 */

public class StringBufferTest03 {
    public static void main(String[] args){
        String s = "String";
        System.out.println (s); //String

        change (s);
        System.out.println (s); //String String比较特殊，它存的值存放在常量池里，不能修改，所以不是我们以为的 Stringjava

        StringBuffer sb = new StringBuffer (30);
        sb.append ("StringBuffer");
        System.out.println (sb); //StringBuffer
        change (sb);
        System.out.println (sb); //StringBufferjava
    }

    public static void change(String s){
        s += "java";
    }

    public static void change(StringBuffer sb){
        sb.append ("java");
    }
}
