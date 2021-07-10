package com.gp.pojo;

public class UserTest {
    public static void main(String[] args) {
        UserInterface userInterface = new UserProxy(new User());

        userInterface.playGame();
    }
}
