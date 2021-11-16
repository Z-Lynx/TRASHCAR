/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hacking
 */
public class canvas extends JFrame implements ActionListener {

    public int allTrash[] = {1765, 2808, 952, 4206, 3102, 3902, 1292, 3985, 8324, 1928, 4426, 397, 3277,0};
    bg bg = new bg();
    car car = new car();
    trash trash = new trash(allTrash);

    Timer timer;
    Image icon = new ImageIcon("trash_icon.png").getImage();

    public canvas() {

        setLayout(new BorderLayout());
        setSize(1400, 800);
        setTitle("GET TRASH BY TRASH CAR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(icon);
        setLocationRelativeTo(null);
        setVisible(true);
        timer = new Timer(30, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        g2D.setFont(new Font("time new roman", Font.ITALIC, 30));
        g2D.drawImage(bg.getImage(), bg.getX_run(), bg.getY(), this);
        g2D.drawImage(bg.getImage(), bg.getX_run() + bg.getWidth(), bg.getY(), this);
        g2D.drawImage(car.getImage(), car.getX(), car.getY(), this);

        if (trash.getI() < trash.getLengthTrash()) {

            g2D.drawImage(trash.getImage(), trash.getX_run(), trash.getY(), this);
            g2D.drawImage(trash.getImage(), trash.getX() + 1500, trash.getX(), this);
            g2D.drawString("SỐ RÁC ĐANG THU LÀ : " + (trash.getI()), 400, 70);

            g2D.drawString("TỔNG SỐ TIỀN HIỆN TẠI : " + trash.getAllMoney(), 850, 70);

        } else {

            g2D.drawImage(trash.getImage(), 1500, trash.getX(), this);

            bg.setX_run(0);
            trash.setX_run(0);
            g2D.drawString("ĐÃ THU ALL RÁC", 850, 150);

            g2D.drawString("TỔNG SỐ TIỀN HIỆN TẠI : " + trash.getAllMoney(), 850, 90);

        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        bg.move();
        trash.move();
        repaint();
    }

}
