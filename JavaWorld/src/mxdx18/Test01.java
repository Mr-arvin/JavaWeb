package mxdx18;

class Star {
    int id;
    String name;

    public Star(int id,String name){
        this.id = id;
        this.name = name;
    }

    //重写equals方法，只要id和name同事相等，那两个对象就是相等的
    public boolean equals(Object obj){
        if(this == obj){ //两个对象内存地址相同
            return true;
        }

        if(obj instanceof Star){ //如果不判断 instanceof 可能会出现classcastExteption 类转型错误
            Star s = (Star)obj; //obj转Star类型
            if(this.id == s.id && this.name == s.name){  // String类型==比较的是内存地址  String类型中的equals方法已经对对父类equals方法进行重写了
                return true;
            }
        }

        return false;
    }
}

public class Test01 {
    public static void main(String[] args){

        Star s1 = new Star(1001,"成龙");
        Star s2 = new Star(1001,"成龙");

        System.out.println(s1.equals(s2));
    }
}
