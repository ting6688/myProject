package com.tingting.mydemo.practice;

public class MyThread1 extends Thread{


    /**
     * 线程的创建：1、继承Thread 2、重写run方法 3、调用start方法
     */

    @Override
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("我爱学习----"+i);
        }
    }

    public static void main(String[] args) {

        MyThread1 myThread = new MyThread1();
        myThread.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("我爱多线程----"+i);

        }

    }
}
