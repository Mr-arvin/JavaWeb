package Exception;

public class UserService {
    public void register(String userName) throws IllegalNameException {
        if(userName.length() < 6){
            //抛一个非法用户名的异常
            //throw 而非 throws
            //通过throw在方法体里面抛出异常
            throw new IllegalNameException("用户名长度不能小于6");
        }
        System.out.println("注册成功！");
    }
}
