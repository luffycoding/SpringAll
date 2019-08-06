package com.designpattern;

/**
 * 枚举--自身就是单例
 * @author LiYang
 * @version 1.0
 * @date 2019/8/6 22:13
 */
public class Signle_03 {

    private Signle_03(){}

    public static Signle_03 getSignle_03(){
        return  Signle_03Enum.INSTANCE.getSignle_03();
    }

    //枚举
    static enum Signle_03Enum{
        INSTANCE;
        private Signle_03 signle_03;
        private Signle_03Enum(){
            signle_03 = new Signle_03();
        }
        public Signle_03 getSignle_03(){
            return  signle_03;
        }
    }
}
