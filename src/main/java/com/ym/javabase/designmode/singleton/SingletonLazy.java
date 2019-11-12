package com.ym.javabase.designmode.singleton;

/**
 * @author YM
 * @date 2019/11/8 14:46
 *
 * 懒汉模式
 *
 * 优点: 实现了懒加载，节约了内存空间
 *
 * 缺点: 在不加锁的情况下，线程不安全，可能出现多份实例
 *      在加锁的情况下，会是程序串行化，使系统有严重的性能问题
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
