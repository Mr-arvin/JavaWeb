package mxdx07;

public class MyDate {
    private String year;
    private String month;
    private String day;

    public MyDate(){
        this("1990","12","12");
        //MyDate("1990","12","12"); 构造方法不能这么调用，要用this
    }

    public MyDate(String year,String month,String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(String year){
        this.year = year;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public void setDay(String day){
        this.day = day;
    }

    public String getYear(){
        return this.year;
    }

    public String getMonth(){
        return this.month;
    }

    public String getDay(){
        return this.day;
    }
}


