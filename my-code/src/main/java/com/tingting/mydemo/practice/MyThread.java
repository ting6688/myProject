package com.tingting.mydemo.practice;

public class MyThread extends Thread{



    @Override
    public void run(){
        super.run();
    }

    public static void test(){
        for (int i = 0; i < 200; i++) {
            System.out.println("我爱学习----"+i);
        }
    }
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("我爱多线程----"+i);

        }
        test();

    }
}
