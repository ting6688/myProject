package com.tingting.mydemo.practice;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 实现网图下载
 */
public class MyThread2 extends Thread {


    private String url;

    private String fileName;

    public MyThread2(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }


    /**
     * 线程的创建：1、继承Thread 2、重写run方法 3、调用start方法
     */

    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoader(url, fileName);
        System.out.println("下载了网图:" + fileName);
    }

    public static void main(String[] args) {

        MyThread2 myThread1 = new MyThread2("https://img2.baidu.com/it/u=2129190988,2983784795&fm=26&fmt=auto&gp=0.jpg", "1.jpg");
        MyThread2 myThread2 = new MyThread2("https://img0.baidu.com/it/u=2088882311,3174118781&fm=26&fmt=auto&gp=0.jpg", "2.jpg");

        MyThread2 myThread3 = new MyThread2("https://img1.baidu.com/it/u=1858974866,2509556658&fm=26&fmt=auto&gp=0.jpg", "3.jpg");

        myThread1.start();
        myThread2.start();
        myThread3.start();


    }


    // 下载器
    Class WebDownLoader
    {


        /**
         * 网络图片下载到本地
         *
         * @param url
         * @param fileName
         */
        public void downLoader (String url, String fileName){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("图片下载异常：" + fileName);
        }

    }
    }

}

