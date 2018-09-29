package mxdx18;

class Star2 {
    int id;
    String name;

    public Star2(int id,String name){
        this.id = id;
        this.name = name;
    }

    //重写equals方法，只要id和name同事相等，那两个对象就是相等的
    public boolean equals(Object obj){
        if(this == obj){ //两个对象内存地址相同
            return true;
        }

//        if(obj instanceof Star){ //如果没有这一行
            Star2 s = (Star2)obj; //如果不判断 instanceof 可能会出现classcastExteption 类转型错误
            if(this.id == s.id && this.name.equals(s.name)){  // String类型==比较的是内存地址
                return true;
            }
//        }

        return false;
    }
}

public class Test02 {
    public static void main(String[] args){
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;

        System.out.println(o1.equals((o2)));
        System.out.println(o3.equals((o2)));

        Star2 s1 = new Star2(1001,"成龙");
        Star2 s2 = new Star2(1001,"成龙");
        Star2 s3 = new Star2(1001,"成龙2");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("2343")); //"2343"是String类型  会报ClassCastException
    }
}
