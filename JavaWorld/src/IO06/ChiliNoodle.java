package IO06;

public class ChiliNoodle implements NoodleDecorate {
    //普通拉面,没有这个拉面怎么给它加料？加辣椒
    private Noddle n;
    //传入要加辣椒的普通拉面对象
    public ChiliNoodle(Noddle n){
        this.n = n;
    }

    //对普通拉面进行升级
    @Override
    public void addThings() {
        n.addThings (); //原本加的料
        System.out.println ("加三勺辣椒酱");//后俩加的料辣椒
    }
}
