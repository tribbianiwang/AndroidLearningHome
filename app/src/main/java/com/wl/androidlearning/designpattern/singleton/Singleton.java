package com.wl.androidlearning.designpattern.singleton;

import android.util.Log;

public class Singleton {
    //懒汉式,线程不安全
    //是否Lazy初始化:是
    //是否多线程安全:否
    //实现难度:易
//    描述:这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁
//    synchronized,所以严格意义上它并不算是单例模式.
//    这种方式lazyloading很明显，不要求线程安全，在多线程不能正常工作
//    private static Singleton instance;
//    private Singleton() {
//    }
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//    public void showMessage() {
//        Log.d("singleton", "懒汉式,非线程安全");
//    }

    //懒汉式，线程安全
    //是否lazy初始化，是
    //是否线程安全:是
    //实现难度:易
    //描述:这种方式具备很好的lazy loading，能够在多线程中很好的工作，但是效率很低，99%情况下不需要同步
//    优点:第一次调用才初始化，避免内存浪费
//    缺点:必须加锁synchronized才能保证单例，但加锁会影响效率.
//    getInstance()的性能对应用程序不是很关键(该方法使用不太频繁)。

    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

        public void showMessage() {
        Log.d("singleton", "懒汉式,线程安全");
    }

}
