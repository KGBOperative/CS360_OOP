// File: Lab06a.java
// author: Dr. Watts
// Contents: This file contains the implementation of a small GUI application in Java

import java.awt.*;
import javax.swing.*;

public class Lab06a extends JPanel {
    private int hwX, hwY;
    private String helloWorld = null;

    public Lab06a() {
        hwX = 300;
        hwY = 300;
        helloWorld = "Hello World";
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(new Font("Arial", Font.PLAIN, 22));
        g2.drawString(helloWorld, hwX, hwY);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 6a");
        Lab06a lab = new Lab06a();
        frame.getContentPane().add(lab);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(100,100);
    }
}
