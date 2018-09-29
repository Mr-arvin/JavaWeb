package pakage06;

//StackOverflowError 堆栈溢出（堆栈 烙饼放桶里，先进后出）

class recu {
    public static void main(String[] args){
        int result = sum(5);
        System.out.println(result);
    }

    public static int sum(int num){
        if(num == 1){
            return num;
        }else {
            return num + sum(num - 1);
        }
    }
}
