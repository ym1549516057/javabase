package com.ym.javabase.java8.myinterface;

import java.time.ZoneId;

/**
 * @author YM
 * @date 2020/12/2
 */
public class Test {
    public static void main(String[] args) {
        MyInterfaceImpl myInterfaceImpln = new MyInterfaceImpl();
        System.out.println(">>>>>>>>>>>接口默认方法");
        myInterfaceImpln.methodOne("mydefault");
        myInterfaceImpln.methodTwo();
        myInterfaceImpln.methodThree();
        System.out.println(">>>>>>>>>>>>接口静态方法");
        MyInterface.firstStatic("静态方法一");
        MyInterface.secondStatic("静态方法二");
        MyInterface.thirdStatic("静态方法三");
        System.out.println(">>>>>>>>>>>子类实现方法");
        myInterfaceImpln.needImpl("");
    }
}
