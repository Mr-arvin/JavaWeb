package MyClass01;

public class StringTest03 {
    public static void main(String[] args){
        String s1 = "monkey1024";
        System.out.println (s1);
        System.out.println (s1.charAt (5)); //y 所在的位置5字符串
        System.out.println (s1.contains ("key")); //true 是否包含某个字符串
        System.out.println (s1.endsWith ("1024")); //true 是否以某个字符串结尾
        System.out.println (s1.equalsIgnoreCase ("Monkey1024"));//true  忽略大小写去比较两个字符串是否相等

        String s2 = "abc";
        byte[] b1 = s2.getBytes (); //转换成byte数组
        for(int i=0; i<b1.length; i++){
            System.out.println (b1[i]);
        }

        System.out.println (s1.indexOf ("y"));//5 字符串所在的位置

        String s3 = "monkey1024monkey";
        System.out.println (s3.indexOf ("y"));//5 但是里面有2个y，所以答案不对
        System.out.println (s3.indexOf ("y",8));// 从第6个位置开始招
        System.out.println (s3.lastIndexOf ("y"));//15 从后面开始找，第15个
        System.out.println (s3.lastIndexOf ("y",14));//5 也就是找不到

        System.out.println (s3.length ());//17 字符串长度

        System.out.println (s3.replaceAll ("monkey","dog"));//dog1024dog 替换

        String s5 = "a,b,c,d";
        String[] array1 = s5.split (",");
        for(int i=0; i<array1.length; i++){
            System.out.print (array1[i]+" ");
        }

        System.out.println ();

        System.out.println (s3.startsWith ("mo"));//true 是否以某个字符串开始

        System.out.println (s3.substring (5));//把字符串第五个位置后面的截出来 注意是截出来不是截掉
        System.out.println (s3.substring (6,10));//其实结束之间的截出来

        char[] array2 = s5.toCharArray (); // 会把字符串转换成chart类型数组
        for(int i=0; i<array2.length; i++){
            System.out.print (array2[i]+" ");
        }

        System.out.println ();

        System.out.println (s5.toUpperCase ());//转换成大写
        System.out.println (s5.toLowerCase ());//转换成小写

        String s6 = "  java good ok  ";
        System.out.println (s6);
        System.out.println (s6.trim ()); //去除首尾空格

        Object o = new Object ();
        System.out.println (String.valueOf (o)); //将其它类型转成String类型字符串 建议使用
        System.out.println (o.toString ()); //将其它类型转成String类型字符串 但是：看下面

        o = null;
        System.out.println (String.valueOf (o)); //将其它类型转成String类型字符串 建议使用
        System.out.println (o.toString ()); //o=null 报空指针错误


    }

}
