package com.ym.javabase.rollback;

/**
 * @author YM
 * @date 2019/11/7 11:43
 */
public class Test {

    public static void main(String[] args) {
        Student tom = new StudentTom();
        Teacher lee = new Teacher(tom);
        lee.askProblem(tom,lee);
    }
}
