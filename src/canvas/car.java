/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Hacking
 */
public class car extends JFrame{

    private Image bgcar;
    private int x = 100;
    private int y = 500;
    private int width;

    public car() {
        bgcar = new ImageIcon("car2.png").getImage();
        width = bgcar.getWidth(this);
    }

    public Image getImage() {
        return bgcar;
    }

    public int getWidth() {
        return width;
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

}
