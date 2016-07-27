package com.yy.test;

/**
 * MyThread
 *
 * @author yangyang
 * @create 16/7/27 18:09
 * @function
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("My thread running!");
    }
}
