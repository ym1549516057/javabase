package com.ym.javabase.designmode.singleton;

/**
 * @author YM
 * @date 2019/11/8 14:53
 *
 * 双重检查锁模式
 */
public class SingletonDoubleLock {

    /**
     * 在多线程的情况下，可能会出现空指针问题，出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作
     * <p>
     * volatile关键字严格遵循 happens-before原则，即在读操作前，写操作必须全部完成,避免指令重排带来的空指针异常
     */
    private volatile static SingletonDoubleLock instance;

    private SingletonDoubleLock() {
    }

    public SingletonDoubleLock getInstance() {
        // 第一次判断，如果这里为空，不进入抢锁阶段，直接返回实例
        if (instance == null) {
            synchronized (SingletonDoubleLock.class) {
                // 抢到锁之后再次判断是否为空
                if (instance == null) {
                    instance = new SingletonDoubleLock();
                }
            }
        }
        return instance;
    }
}
