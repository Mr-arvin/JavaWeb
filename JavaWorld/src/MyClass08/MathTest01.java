package MyClass08;
/**
 * Math
 */
public class MathTest01 {
    public static void main(String[] args){
        //圆周率
        System.out.println (Math.PI);

        //取绝对值
        System.out.println (Math.abs (-1));

        //天花板 向上取整
        System.out.println (Math.ceil (12.3));
        System.out.println (Math.ceil (12.9));

        //向下取整
        System.out.println (Math.floor (12.3));

        //取两者较大值
        System.out.println (Math.max (20,22));
        System.out.println (Math.min (20,22));

        System.out.println (Math.pow(2,4));

        //0.0~1.0之间的一个随机小数，包括0.0，不包括1.0
        System.out.println (Math.random ());

        //四舍五入
        System.out.println (Math.round (12.4));

        //开平方根
        System.out.println (Math.sqrt (16));
    }
}
