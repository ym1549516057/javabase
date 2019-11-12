package com.ym.javabase.rollback;

/**
 * @author YM
 * @date 2019/11/7 11:19
 */
public class Teacher implements Rollback {
    private Student student;

    Teacher(Student student) {
        this.student = student;
    }

    void askProblem(Student student, Teacher teacher) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                student.resolveProblem(teacher);
            }
        }).start();

        for (int i = 0; i < 4; i++) {
            System.out.println("老师玩了" + i + "秒手机");
        }
    }

    @Override
    public void tellAnswer(int res) {
        System.out.println("anwser is " + res);
    }
}
