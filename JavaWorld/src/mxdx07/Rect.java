package mxdx07;

class Rect {

    private int width;
    private int height;

    public Rect(){

    }

    public Rect(int width, int height){
        this.width = width;
        this.height = height;

    }

    public  void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return this.width;
    }

    public  void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }

    public int getArea(){
        return this.width * this.height;
    }

    public int getLong(){
        return (this.width + this.height)*2;
    }



}

