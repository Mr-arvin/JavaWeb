package pakage05;

class Method {
    public static void main(String[] args){
        m1();
        Method.m1();
        Method02.m1();
        Method02.m2();
    }
    public static void m1(){
        System.out.println("Method里面的m1方法");
    }
}

class Method02 {
    public static void m1() {
        System.out.println("Method02里面的m1方法");
    }

    public static void m2() {
        System.out.println("Method02里面的m2方法");
        m3();
    }

    public static void m3() {
        System.out.println("Method02里面的m3方法");
    }
}


