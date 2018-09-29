package Exception;

public class IllegalNameException extends Exception {
    static final long serialVersionUID = 121232312345234234L;
    public IllegalNameException(){
     super();
    }
    public IllegalNameException(String msg){
        super(msg);
    }

}
