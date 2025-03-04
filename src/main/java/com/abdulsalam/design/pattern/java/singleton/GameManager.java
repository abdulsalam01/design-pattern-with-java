/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abdulsalam.design.pattern.java.singleton;

/**
 *
 * @author abdulsalam
 */
public class GameManager {
    private static GameManager instance;

    private GameManager() {}

    public static synchronized GameManager getInstance() {
        if (GameManager.instance == null) {
            GameManager.instance = new GameManager();
        }
        return GameManager.instance;
    }

    public void showMessage() {
        System.out.println("Game Manager is running! 🎮");
    }
}
