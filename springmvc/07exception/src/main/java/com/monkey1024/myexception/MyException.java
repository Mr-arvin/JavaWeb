package com.monkey1024.myexception;

/**
 * 自定义异常
 */
public class MyException extends Exception {
    public MyException(){
        super();
    }

    public MyException(String message){
        super(message);
    }
}
