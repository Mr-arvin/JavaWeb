package Arrays05;

public class Room {
    private String id;//房间编号
    private String type;//房间类型
    private boolean isUser;//是否空房

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUser() {
        return isUser;
    }

    public void setUser(boolean user) {
        isUser = user;
    }

    //创建的时候带参数的构造方法

    public Room(){

    }
    public Room(String id, String type, boolean isUser) {
        super();
        this.id = id;
        this.type = type;
        this.isUser = isUser;
    }

    @Override
    public String toString() {
        return "[" + id + "," + type + "," + (isUser?"占用":"空闲") + "]";
    }
}
