package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射创建类
 * @author LiYang
 * @version 1.0
 * @date 2019/8/6 21:15
 */
public class ReFlectCreateClass {

    public static void main(String[] args) throws Exception{

        Class<?>  forName = Class.forName("com.reflect.UserEntity");
        UserEntity user = (UserEntity) forName.newInstance();
        user.setUsername("反射创建对象");
        System.out.println(user.getUsername());

        //  jdbc   SpringIoc就是使用反射+DOM4J       mybaits、hibernate  使用场景

        //获取类的方法
        Method[] methods = forName.getMethods();
        for(Method m : methods){
            System.out.println("++++反射获取类方法+++"+m+"------------------------"+m.getName());
        }
        //获取属性
        Field[] fields = forName.getDeclaredFields();
        for(Field f : fields){
            System.out.println("+++++++反射获取属性+++++++"+ f.getName());
        }


        //获取有参构造函数
        Constructor<?> constructor = forName.getConstructor(String.class);

        UserEntity userEntity = (UserEntity) constructor.newInstance("我是单例模式........");
        System.out.println(userEntity.getUsername());
    }
}
