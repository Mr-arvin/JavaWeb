package MyClass03;

/**
 * 问题：统计一个字符串里面另一个字符串出现的次数
 * 例如统计"monkey"在
 * "I am monkey1024.monkey like banana.little monkey is smart."
 * 中出现的次数
 *
 * 分析：通过indexOf判断小字符串在大字符串中出现的索引位置，如果返回-1则说明小字符串在大字符串中不存在。
 * 取得索引位置之后，将小字符串进行截取
 *
 */
public class Tongji1 {
    public static void main(String[] args){
        String src = "I am monkey1024.monkey like banana.little monkey is smart";
        String dest = "monkey";
        int count = 0;
        int index = 0;
        while((index = src.indexOf (dest)) != -1){
           src = src.substring (index + dest.length ());
           count ++;
           System.out.println (src);

        }
        System.out.println (count);
    }

    public static class Tongji2 {
    }
}
