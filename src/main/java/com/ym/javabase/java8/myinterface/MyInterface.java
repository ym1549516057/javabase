package com.ym.javabase.java8.myinterface;

/**
 * 1.java8 之后,接口新增默认方法和静态方法
 * 2.默认方法和静态方法个数不受限制
 * 3.默认方法可以被实现类重写
 * 4.新增默认方法是因为当多个实现类需要同一个具体的方法,如果没有默认方法,
 *   就需要挨个实现类去修改,有默认方法之后就只用修改默认实现
 * 5.接口默认方法和静态方法的区别:  默认方法,需要实例化实现类,通过实例调用
 *                              静态方法通过接口类直接调用
 *
 * @author YM
 * @date 2020/12/2
 */
public interface MyInterface {

    //默认方法
    default String methodOne(String value){
        System.out.println(value);
        return value;
    }

    default String methodTwo(){
        System.out.println("2222");
        return null;
    }

    default void methodThree(){
        System.out.println("33333");
    }


    static String firstStatic(String value){
        System.out.println(value);
        return value;
    }

    static String secondStatic(String value){
        System.out.println(value);
        return value;
    }

    static String thirdStatic(String value){
        System.out.println(value);
        return value;
    }

    void needImpl(String value);


}
