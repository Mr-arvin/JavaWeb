package MyClass02;

public class Regex {
    public static void main(String[] args){
        //将下列字符串中的数字修改为中
        String s1 = "monkey1024study1j2a3v4a";
        String s2 = s1.replaceAll ("\\d","中"); // "\d表示匹配数字，前面的\用来转义 为转义字符"
        System.out.println (s2);

        String s3 = "mm";
        String s4 = "mmm";
        System.out.println (s3.matches ("^m{2}$")); //true "^m{2}$"就表示"mm",用matches匹配一下
        System.out.println (s4.matches ("^m{2}$")); //false

        String email = "admin@monkey1024.com";
        System.out.println (email.matches ("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+.)+[A-Za-z]{2,14}"));//匹配邮箱格式

        String phone = "13255553333";
        System.out.println (phone.matches ("0?(13|14|15|18)[0-9]{9}"));//匹配手机号格式
    }
}
