package MyClass03;

/**
 * 问题：统计一个字符串中大写字母出现的次数
 * 分析：每个大写字母都是一个字符，将字符串转换成字符数组
 * 遍历数组，判断字符是否是大写字母
 */
public class Tongji2 {
    public static void main(String[] args){
        String src = "monKEY";
        int count = 0;
        //将字符串转换为字符数组
        char[] c = src.toCharArray ();
        for(int i=0; i<c.length; i++){
            if(c[i] >='A' && c[i] <='Z'){
                count ++;
            }
        }
        System.out.println (count);
    }
}
