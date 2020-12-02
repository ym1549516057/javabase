package com.ym.javabase.java8.myinterface;

/**
 * @author YM
 * @date 2020/12/2
 */
public class MyInterfaceImpl implements MyInterface,MyInterfaceTwo {
    @Override
    public void methodThree() {
        System.out.println("overwrite default method three");
    }

    @Override
    public void needImpl(String value) {

    }

}
