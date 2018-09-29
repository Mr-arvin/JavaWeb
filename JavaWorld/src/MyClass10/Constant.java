package MyClass10;

/**
 *  常量类 vs 枚举
 *  其实两者都可以
 */
public class Constant {
    public static final String SPRING = "Spring";
    public static final String SUMMER = "Summer";
    public static final String AUTUMN = "Autumn";
    public static final String WINTER = "Winter";

    public static void main(String[] args){
        System.out.println (EnumTest01.Season.Spring);
        System.out.println (EnumTest01.Season.Winter);
    }
}
