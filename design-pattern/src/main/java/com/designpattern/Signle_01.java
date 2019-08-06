package com.designpattern;

/**
 * 饿汉式
 * @author LiYang
 * @version 1.0
 * @date 2019/8/6 22:05
 */
public class Signle_01 {
    private  Signle_01(){

    }
    private static final  Signle_01 signle_01 = new Signle_01();

    public  static Signle_01 getSignle_01(){
        return  signle_01;
    }
}
