package com.ym.javabase.designmode.dynamicproxy.jdk;

import org.springframework.stereotype.Component;

/**
 * @author YM
 * @date 2020/12/2
 */
@Component
public class SubjectImplOne implements Subject {
    @Override
    public void hello(String param) {
        System.out.println("one");
    }
}
