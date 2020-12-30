package com.ym.javabase.reflect;

import lombok.Data;
import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;

/**
 * @author YM
 * @date 2020/12/23
 */
public class ReflectTest{
    public static void main(String[] args) throws ClassNotFoundException {
        //获取元数据对象
        //1.类名.class
        Class<User> userClass = User.class;
        //2.class.forName("类完整路径")
        Class<?> userClass1 = Class.forName("com.ym.javabase.reflect.User");
        //3.对象.getClass()
        User user = new User();
        Class<? extends User> userClass2 = user.getClass();
        try {
            User user1 = userClass.getDeclaredConstructor().newInstance();
            System.out.println(user1);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

