package com.ym.javabase.java8.myinterface;

/**
 * @author YM
 * @date 2020/12/2
 */
public interface MyInterfaceTwo {
    //默认方法
    default String methodOne(String value){
        System.out.println(value);
        return value;
    }
    void needImpl(String v);
}
