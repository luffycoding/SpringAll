package com.designpattern;

/**
 * 懒汉式 ---双重锁模式
 * @author LiYang
 * @version 1.0
 * @date 2019/8/6 22:09
 */
public class Signle_02 {
    private  Signle_02(){

    }
    //加上  volatile 可以禁止重排序问题出现  不加可能出现重排序问题
    private static volatile   Signle_02 signle_02;

    public  static Signle_02 getSignle_02(){
        if(signle_02 == null){
            synchronized (Signle_02.class){
                if(signle_02 == null){
                    signle_02 = new Signle_02();
                }
            }
        }
        return  signle_02;
    }
}
