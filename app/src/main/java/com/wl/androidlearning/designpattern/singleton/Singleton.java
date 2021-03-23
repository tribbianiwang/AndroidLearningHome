package com.wl.androidlearning.designpattern.singleton;

import android.util.Log;

public class Singleton {
    //1懒汉式,线程不安全
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

    //2懒汉式，线程安全
    //是否lazy初始化，是
    //是否线程安全:是
    //实现难度:易
    //描述:这种方式具备很好的lazy loading，能够在多线程中很好的工作，但是效率很低，99%情况下不需要同步
//    优点:第一次调用才初始化，避免内存浪费
//    缺点:必须加锁synchronized才能保证单例，但加锁会影响效率.
//    getInstance()的性能对应用程序不是很关键(该方法使用不太频繁)。

//    private static Singleton instance;
//
//    private Singleton(){}
//
//    public static synchronized Singleton getInstance(){
//        if(instance==null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//
//        public void showMessage() {
//        Log.d("singleton", "懒汉式,线程安全");
//    }

    //3.饿汉式
    //是否Lazy初始化:否
    //是否多线程安全:是
    //实现难度:易
    //描述:这种方式比较常用，但容易产生垃圾对象
    //优点:没有加锁，执行效率会提高
    //缺点:类加载时就初始化，浪费内存。
    //它基于classloader机制避免了多线程的同步问题，不过，instance在类加载时就实例化，虽然导致类装载
//    的原因有很多种，在单例模式中大多数都是调用getInstance方法，但是也不能确定有其他方式(或者其他的静态方法)
//        导致类装载，这时候初始化instance显然没有达到lazyloading的效果
//
//    private static Singleton instance = new Singleton();
//
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//
//    public void showMessage() {
//        Log.d("singleton", "饿汉式");
//    }

    //4双检锁/双重校验锁（DCL，即 double-checked locking）
    //jdk版本:1.5及以上
    //是否lazy初始化:是
    //是否多线程安全:是
    //实现难度:较复杂
    //描述:这种方式采用双锁机制，安全且在多线程情况下保持高性能
//    getInstance()的性能对应用程序很关键
//    private static volatile Singleton instance;
//
//    private Singleton(){
//    }
//
//    public static Singleton getInstance(){
//        if(instance==null){
//            synchronized (Singleton.class){
//                if(instance==null){
//                    instance = new  Singleton();
//                }
//            }
//        }
//
//        return instance;
//    }
//
//        public void showMessage() {
//        Log.d("singleton", "双检锁/双重校验锁");
//    }


    //5.登记式，静态内部类
    //是否Lazy初始化:是
    //是否多线程安全:是
    //实现难度:一般
    //描述:这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，
//    应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁
//    方式可在实例域需要延迟初始化时使用。
//    这种方式同样利用了classloader机制来保证初始化instance时只有一个线程，它跟第
//    3种方式不同的是，第三种方式只要Singleton类被装载了，那么instance就会
//    被实例化(没有达到lazyloading效果)，而这种方式是Singleton类被装载了，instance
//    不一定被初始化。因为SingletonHolder类没有被主动使用，只有通过显式调用
//    getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance，想象一下，
//    如果实例化instance很消耗资源，所以想让它延迟加载，另一方面，又不希望
//    在Singleton类加载时就被实例化，因为不能确保Singleton类还可能在其他地方
//    被主动使用从而被加载，那么这个时候实例化instance显然是不合适的。这个时候
//    这种方式相比第三种方式就显得很合理
//
    private static class SingletonHolder{
        private static Singleton INSTANCE = new Singleton();
    }

    private Singleton(){

    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

            public void showMessage() {
        Log.d("singleton", "登记式，静态内部类");
    }


    /*
    经验之
    谈:一般情况下，不建议使用第一种和第二种懒汉方式，建议使用第三种饿汉方式。只有
    在要明确实现lazyloading效果时，才会使用第五种等级方式。如果涉及到反序列化
    创建对象时，可以尝试使用第六种枚举方式。如果有其他特殊的需求，可以考虑第
    4中双检锁方式。
     */









}
