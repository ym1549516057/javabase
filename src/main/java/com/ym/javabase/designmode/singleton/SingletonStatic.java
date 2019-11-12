package com.ym.javabase.designmode.singleton;


/**
 * @author YM
 * @date 2019/11/8 15:14
 * <p>
 * 静态内部类单例模式也称单例持有者模式
 *
 * 静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。
 * 在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费
 */
public class SingletonStatic {

    private SingletonStatic() {
    }

    /**
     * 单例持有者
     */

    private static class InstanceHolder {
        private static final SingletonStatic instance = new SingletonStatic();
    }


    public SingletonStatic getInstance() {
        //调用内部类属性
        return InstanceHolder.instance;
    }
}
