package Collection05;

/**
 * 自定义泛型
 */
public class Generic03<E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    //在方法上面定义泛型，最好是方法不要自定义泛型，跟类保持一支即可
    public<M> void show(M m){
        System.out.println (m);
    }
}
