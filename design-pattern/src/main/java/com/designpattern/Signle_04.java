package com.designpattern;

/**
 * 静态内部类 + 双重锁 实现单例模式
 * @author LiYang
 * @version 1.0
 * @date 2019/8/6 22:30
 */
public class Signle_04 {
    private  static volatile Signle_04  signle_04 = null;
    private Signle_04(){
    }

    private static class StaticSignle04{
        private final static Signle_04  SIGNLE_04 = new Signle_04();
    }

    public  static Signle_04 getSignle_04(){
        if(signle_04 == null){
            synchronized (Signle_04.class){
                if(signle_04 == null){
                    signle_04 = StaticSignle04.SIGNLE_04;
                }
            }
        }

        return signle_04;
    }
}
