package com.ym.javabase.designmode.singleton;

/**
 * @author YM
 * @date 2019/11/8 15:29
 * 枚举类单例模式
 * <p>
 * 枚举类型是线程安全的，并且只会装载一次，设计者充分的利用了枚举的这个特性来实现单例模式，
 * 枚举的写法非常简单，而且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式。
 */
public class SingletonObj {
    private SingletonObj() {
    }

    private enum Singleton {
        INSTANCE;

        private final SingletonObj instance;

        Singleton() {
            instance = new SingletonObj();
        }

        private SingletonObj getSingletonEnumInstance() {
            return instance;
        }

        public static SingletonObj getInstance() {
            return Singleton.INSTANCE.getSingletonEnumInstance();
        }
    }
}
