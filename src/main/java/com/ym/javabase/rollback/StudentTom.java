package com.ym.javabase.rollback;

/**
 * @author YM
 * @date 2019/11/7 11:23
 */
public class StudentTom implements Student {
    @Override
    public void resolveProblem(Teacher teacher) {
        try {
            Thread.sleep(3000);
            System.out.println("tom得到答案");
            teacher.tellAnswer(1111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
