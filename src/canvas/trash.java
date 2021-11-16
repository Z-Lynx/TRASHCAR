/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas;

import java.awt.Image;
import java.util.Arrays;
import java.awt.image.BufferedImage;
import javafx.scene.layout.Background;
import javax.swing.*;

/**
 *
 * @author Hacking
 */
public class trash {

    private Image trashimg;
    private int[] sotrash;
    private int veleocity = 15;
    private int x_run = 1500;
    private int x = 1500;
    private int y = 600;
    private int width = 140;
    private int i = 0;
    private int timeGetTrash = 8;
    private int timeRemoveTrash = 30;
    private int moneyInMinute = 2000;
    private int moneyInOneTrash = 57000;
    private int maxTrash = 10000;
    private int moneyTrash = 0;
    private int allMoney = 0;
    private int trashInCar = 0;
    private int allTime = 0;

    public trash() {

    }

    public trash(int[] sotrash) {
        trashimg = new ImageIcon("trash.png").getImage();
        this.sotrash = Arrays.copyOf(sotrash, sotrash.length);
    }

    public int getLengthTrash() {
        return sotrash.length - 1;
    }

    public Image getImage() {
        return trashimg;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getTrash() {
        if (sotrash[i] + trashInCar < maxTrash) {
            allTime += timeGetTrash;
            trashInCar += sotrash[i];
            moneyTrash += moneyInOneTrash;
        } else {
            allTime += timeRemoveTrash;
            trashInCar = 0;
        }
    }

    public void sumAllMoney() {
        allMoney += allTime * moneyInMinute + moneyTrash;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void move() {
        car car = new car();
        x_run = x_run - veleocity;
        if (x_run < (car.getWidth() + car.getX()) && i < getLengthTrash()) {
            x_run = 1500;
            i++;
            getTrash();
            sumAllMoney();
            allTime = 0;
            moneyTrash = 0;
        }

    }

    public int getX_run() {
        return x_run;
    }

    public void setX_run(int x_run) {
        this.x_run = x_run;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}
