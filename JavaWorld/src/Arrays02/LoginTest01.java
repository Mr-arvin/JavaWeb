package Arrays02;

public class LoginTest01 {
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println ("请输入用户名和密码，中间以空格隔开");
            return;
        }
        String name = args[0];
        String password = args[1];

        if("admin".equals (name) && "asdasdasd".equals (password)){
            System.out.println ("登陆成功，欢迎"+name+"回来");
        }else {
            System.out.println ("登陆失败，用户名"+name+"不存在或者密码错误");
        }
    }
}
