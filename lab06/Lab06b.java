// File: Lab06b.java
// author: Dr. Watts
// Contents: This file contains the implementation of a small GUI application in Java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab06b extends JPanel implements ActionListener, MouseMotionListener {
    private JButton theButton;
    private int hwX, hwY;
    private String helloWorld = null;
    private int red, green, blue;

    public Lab06b() {
        hwX = 300;
        hwY = 300;
        helloWorld = "Hello World";
        red = green = blue = 30;
        theButton = new JButton("Change Color");
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        hwX = e.getX();
        hwY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(new Color(red, green, blue));
        g2.setFont(new Font("Arial", Font.PLAIN, 22));
        g2.drawString(helloWorld, hwX, hwY);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == theButton) {
            red = (red * 29) % 254 + 2;
            green = (green * 31) % 254 + 2;
            blue = (blue * 53) % 254 + 2;
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 6b");
        Lab06b lab = new Lab06b();
        frame.getContentPane().add(lab);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(100,100);
    }
}
