package Exception;

public class RegisterTest {
    public static void main(String[] args) {
        UserService us = new UserService();
        try {
            us.register("admin");
        } catch (IllegalNameException e) {
            e.printStackTrace();
        }
    }

}
