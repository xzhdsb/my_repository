package chapter16_tankgame;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    public static void main(String[] args) {
        DrawCircle drawCircle = new DrawCircle();
    }

    private DrawCircle(){
        Panel panel = new Panel();
        this.add(panel);
        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Panel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10, 100, 100);
    }
}
