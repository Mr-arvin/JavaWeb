package MyClass07;

/**
 * 获取毫秒数
 */
public class DateTest01 {
    public static void main(String[] args){
        //从1970年1月1日00时00分00秒00毫秒到现在所过的毫秒数
        long now = System.currentTimeMillis ();
        System.out.println (now);

        //演示String和StringBuffer拼接1000次耗费的时间
        String s = "";
        StringBuffer sb = new StringBuffer (1000);
        long before = System.currentTimeMillis ();//获取拼接前的毫秒数
        for (int i=0; i<100000; i++){
            //s += i; //18777  所以一定不要使用String进行频繁拼接
            sb.append (i);//13
        }
        long after = System.currentTimeMillis ();//获取拼接后的毫秒数
        System.out.println (after - before);

    }
}
