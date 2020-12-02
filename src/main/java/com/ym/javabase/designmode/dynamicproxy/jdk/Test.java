package com.ym.javabase.designmode.dynamicproxy.jdk;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author YM
 * @note 测试类
 * @date 2020/4/3
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new SubjectImplOne();
        //代理类实例
        InvocationHandler subjectInvoke = new DynamicProxy(subject);
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(), subject.getClass().getInterfaces(), subjectInvoke);
        proxyInstance.hello("test");
    }
}

