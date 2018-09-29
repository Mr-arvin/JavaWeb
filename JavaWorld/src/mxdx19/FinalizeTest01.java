package mxdx19;

public class FinalizeTest01 {
    public static void main(String[] args){
        Person p = new Person();
        p = null;
        System.gc();//建议垃圾回收器回收。只是建议，不是命令
    }
}

class Person{
    //重写finalize方法，这个方法不是给程序员调用的，系统垃圾回收器在回收之前会自动调用
    protected void finalize() throws Throwable{
        System.out.println("开始回收");
    }
}
