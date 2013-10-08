// File: Lab06c.java
// author: Dr. Watts
// Contents: This file contains the implementation of a small GUI application in Java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab06c extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
    private JButton theButton;
    private int hwX, hwY;
    private int mX, mY;
    private String helloWorld = null;
    private int red, green, blue;
    private boolean onscreen;

    public Lab06c() {
        onscreen = true;
        hwX = 300;
        hwY = 300;
        mX = 0;
        mY = 0;
        helloWorld = "Hello World";
        red = green = blue = 30;
        theButton = new JButton("Change Color");
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
        addMouseListener(this);
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        if (onscreen) {
            mX = hwX = e.getX();
            mY = hwY = e.getY();
            repaint();
        }
    }

    public void mouseMoved(MouseEvent e) {
        mX = e.getX();
        mY = e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        onscreen = true;
    }

    public void mouseExited(MouseEvent e) {
        onscreen = false;
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(new Color(red, green, blue));
        g2.setFont(new Font("Arial", Font.PLAIN, 22));
        g2.drawString(helloWorld, hwX, hwY);
        g2.drawString("mouse X = " + mX + " mouse Y = " + mY, 5, 567);
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
        Lab06c lab = new Lab06c();
        frame.getContentPane().add(lab);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(100,100);
    }
}
