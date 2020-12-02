package com.ym.javabase.java8.lambda;

public class Test {
    public static void main(String[] args) {
        Consume c = (a,b) -> {
            System.out.println(a);
            System.out.println(b);
        };
        c.test("test","haha");
    }
}
