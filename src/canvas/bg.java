/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas;

import java.awt.*;
import java.awt.image.BufferedImage;
import javafx.scene.layout.Background;

import javax.swing.*;

/**
 *
 * @author Hacking
 */
public class bg extends JFrame {

    private Image background;
    private int veleocity = 15;
    private int x_run = 0;
    private int x = 0;
    private int y = 0;
    private int width;

    public bg() {
        background = new ImageIcon("bg.jpg").getImage();
        width = background.getWidth(this);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void move() {
        x_run = x_run - veleocity;
        if (x_run < -width) {
            x_run = 0;
        }
    }

    public int getX_run() {
        return x_run;
    }

    public void setX_run(int x_run) {
        this.x_run = x_run;
    }

    public int getVeleocity() {
        return veleocity;
    }

    public void setVeleocity(int veleocity) {
        this.veleocity = veleocity;
    }

    public Image getImage() {
        return background;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
