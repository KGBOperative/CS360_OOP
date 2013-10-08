// File: Lab07b.java
// author: Dr. Watts
// Contents: This file contains the implementation of a small GUI application in Java

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab07b extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
    private JButton theButton;
    private int hwX, hwY;
    private String helloWorld = null;
    private int red, green, blue;
    private boolean inFrame = true;
    private ArrayList<Shape> S = new ArrayList<Shape> ();

    public Lab07b() {
        hwX = 300;
        hwY = 300;
        helloWorld = "Hello World";
        red = green = blue = 30;
        theButton = new JButton("Change Color");
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
        addMouseListener(this);

        S.add(new Circle(20, 100, 150));
        S.add(new Circle(30, 200, 150));
        S.add(new Circle(40, 300, 150));
        S.add(new Square(20, 100, 200));
        S.add(new Square(30, 200, 200));
        S.add(new Square(40, 300, 200));
        S.add(new Rectangle(20, 40, 100, 250));
        S.add(new Rectangle(30, 30, 200, 250));
        S.add(new Rectangle(40, 20, 300, 250));
        S.add(new Equilateral(20, 100, 300));
        S.add(new Equilateral(30, 200, 300));
        S.add(new Equilateral(40, 300, 300));
        /*
        S.add(new Right(20, 40, 100, 350));
        S.add(new Right(30, 30, 200, 350));
        S.add(new Right(40, 20, 300, 350));
        S.add(new Scalene(20, 40, 30, 100, 400));
        S.add(new Scalene(30, 20, 40, 200, 400));
        S.add(new Scalene(40, 30, 20, 300, 400));
        S.add(new Circle(50, 500, 500));
        S.add(new Square(60, 500, 500));
        S.add(new Equilateral(70, 500, 500));
        */
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        hwX = e.getX();
        hwY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(new Color(red, green, blue));
        Font textFont = new Font("Arial", Font.PLAIN, 22);
        g2.setFont(textFont);
        FontMetrics textMetrics = g2.getFontMetrics(textFont);
        int hwWidth = textMetrics.stringWidth(helloWorld);
        int hwHeight = textMetrics.getHeight();
        int lowerLeftX = hwX - hwWidth/2;
        int lowerLeftY = hwY + hwHeight/2;
        g2.drawString(helloWorld, lowerLeftX, lowerLeftY);
        for (int i = 0; i < S.size(); i++)
            S.get(i).paintComponent(g2);
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
        Lab07b lab = new Lab07b();
        frame.getContentPane().add(lab);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(100,100);
    }
}
