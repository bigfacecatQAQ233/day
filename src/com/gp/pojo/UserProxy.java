package com.gp.pojo;

public class UserProxy implements UserInterface{
    private UserInterface userInterface;

    public UserProxy(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public void playGame() {
        userInterface.playGame();
    }
}
