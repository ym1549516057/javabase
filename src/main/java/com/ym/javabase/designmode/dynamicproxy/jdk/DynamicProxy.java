package com.ym.javabase.designmode.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author YM
 * @note 动态代理实现
 * @date 2020/4/3
 */
public class DynamicProxy implements InvocationHandler {
    //要代理的类
    private Subject subject;

    DynamicProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始");
        //利用反射调用代理类中的方法
        Object invoke = method.invoke(subject, args);
        System.out.println("结束");
        return invoke;
    }
}
