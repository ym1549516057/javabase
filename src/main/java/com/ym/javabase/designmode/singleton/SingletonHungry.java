package com.ym.javabase.designmode.singleton;

/**
 * @author YM
 * @date 2019/11/8 13:56
 * 饿汉模式
 *
 * 优点:由于使用了static关键字，保证了在引用这个变量时，
 * 关于这个变量的所以写入操作都完成，所以保证了JVM层面的线程安全
 *
 * 缺点:不能实现懒加载，造成空间浪费，如果一个类比较大，我们在初始化的时就加载了这个类，
 * 但是我们长时间没有使用这个类，这就导致了内存空间的浪费。
 *
 */
public class SingletonHungry {

    /**
     * 静态变量存储唯一实例
     */
    private static final SingletonHungry instance = new SingletonHungry();

    /**
     * 静态构造方法
     */
    private SingletonHungry() {

    }

    public SingletonHungry getInstance() {
        return instance;
    }
}
