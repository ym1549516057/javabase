package com.ym.javabase.designmode.dynamicproxy.jdk;

/**
 * @author YM
 * @note 接口实现
 * @date 2020/4/3
 */
public class SubjectIml implements Subject{
    @Override
    public void hello(String param) {
        System.out.println(param);
    }
}
