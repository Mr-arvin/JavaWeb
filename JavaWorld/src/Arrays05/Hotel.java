package Arrays05;

public class Hotel {
    //Room引用类型二维数组
    Room[][] room;
    //初始化房间 编号、类型
    public Hotel(){
        room = new Room[5][10]; //一共是五层，每层10间
        //1,2标准间
        //3,4双人间
        //5豪华间
        for (int i=0; i<room.length; i++){
            for (int j=0; j<room[i].length; j++){
                if(i == 0 || i == 1){ //1层、2层
                    room[i][j] = new Room ((i+1)*100+j+1+"","标准间",false); //+""后java会自动把int类型转成String类型
                }
                if(i == 2 || i == 3){ //3层、4层
                    room[i][j] = new Room ((i+1)*100+j+1+"","双人间",false);
                }
                if(i == 4){ //5层
                    room[i][j] = new Room ((i+1)*100+j+1+"","豪华间",false);
                }
            }
        }
    }

    //预定房间 (这里就涉及到输入了)
    public void order(String id){
        for (int i=0; i<room.length; i++){
            for(int j=0; j<room[i].length; j++){
                //将该房间的预定状态和传进来的id比对
                if(room[i][j].getId ().equals (id)){
                    //将房间状态改成true，已占用
                    room[i][j].setUser (true);
                }
            }
        }
    }
    //退房 (这里就涉及到输入了)
    public void checkOut(String id){
        for (int i=0; i<room.length; i++){
            for(int j=0; j<room[i].length; j++){
                //将该房间的预定状态和传进来的id比对
                if(room[i][j].getId ().equals (id)){
                    //将房间状态改成false，空房
                    room[i][j].setUser (false);
                }
            }
        }
    }
    //查房
    public void print(){
        for(int i=0; i<room.length; i++){
            for (int j=0; j<room[i].length;j++){
                System.out.print (room[i][j]);
            }
            System.out.println ();
        }
    }
}
