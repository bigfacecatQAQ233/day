package com.gp.pojo;

public class User implements UserInterface{
    @Override
    public void playGame() {
        System.out.println("用户a打游戏");
    }
}
