package MyClass10;

/**
 *  常量类 vs 枚举
 *  其实两者都可以
 */

public class EnumTest01 {
    public enum Season{ //枚举jdk5之后
        Spring,Summer,Autumn,Winter
    }
    public static void main(String[] args){
        System.out.println (Season.Spring);
    }
}
