// file: CircleDialog.java
// CS 360 - Fall 2006 - Watts
// Project 1
// September 2006
// Written by Dr. Watts
// http://www.cs.sonoma.edu/~tiawatts 
/*
   Dialog box for selecting a shape and its color and providing 
   a name for the shape
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleDialog extends JDialog implements ActionListener {
    private JPanel myPanel = null;
    private JButton OKButton = null, cancelButton = null;
    private JTextField radiusText;
    private JRadioButton redRButton = null, orangeRButton = null,
            yellowRButton = null, greenRButton = null,
            blueRButton = null, purpleRButton = null,
            whiteRButton = null, grayRButton = null,
            blackRButton = null;
    private ButtonGroup shapeGroup= null, colorGroup = null;
    private JPanel colorPanel = null, buttonPanel = null;    
    private Color currentColor = Color.red;
    private int oldRadius = 0;
    private int radius = 0;
    private boolean answer = false;
    public Color getColor() { return currentColor; }
    public int getRadius() { return radius; }
    public boolean getAnswer() { return answer; }

    public CircleDialog(JFrame frame, boolean modal, int x, int y, int R) {
        super(frame, modal);
        oldRadius = R;
        myPanel = new JPanel();
        getContentPane().add(myPanel);
        myPanel.setLayout (new GridLayout(5,1));
        addRadioButtons ();
        addTextAndButtons ();
        setTitle ("Modify Circle Dialog");
        setLocation (x, y);
        setSize (300,250);
        setVisible(true);
    }

    private void addRadioButtons () {
        myPanel.add(new JLabel("Select a color:"));
        colorPanel = new JPanel();
        colorPanel.setLayout (new GridLayout (3,3));
        redRButton = new JRadioButton ("Red",true);
        redRButton.addActionListener(this);
        redRButton.setForeground (Color.red);
        colorPanel.add (redRButton);
        orangeRButton = new JRadioButton ("Orange",false);
        orangeRButton.addActionListener(this);
        colorPanel.add (orangeRButton);
        yellowRButton = new JRadioButton ("Yellow",false);
        yellowRButton.addActionListener(this);
        colorPanel.add (yellowRButton);
        greenRButton = new JRadioButton ("Green",false);
        greenRButton.addActionListener(this);
        colorPanel.add (greenRButton);
        blueRButton = new JRadioButton ("Blue",false);
        blueRButton.addActionListener(this);
        colorPanel.add (blueRButton);
        purpleRButton = new JRadioButton ("Purple",false);
        purpleRButton.addActionListener(this);
        colorPanel.add (purpleRButton);
        whiteRButton = new JRadioButton ("White",false);
        whiteRButton.addActionListener(this);
        colorPanel.add (whiteRButton);
        grayRButton = new JRadioButton ("Gray",false);
        grayRButton.addActionListener(this);
        colorPanel.add (grayRButton);
        blackRButton = new JRadioButton ("Black",false);
        blackRButton.addActionListener(this);
        colorPanel.add (blackRButton);
        myPanel.add (colorPanel);
        colorGroup = new ButtonGroup ();
        colorGroup.add (redRButton);
        colorGroup.add (orangeRButton);
        colorGroup.add (yellowRButton);
        colorGroup.add (greenRButton);
        colorGroup.add (blueRButton);
        colorGroup.add (purpleRButton);
        colorGroup.add (whiteRButton);
        colorGroup.add (grayRButton);
        colorGroup.add (blackRButton);
    }

    private void addTextAndButtons () {
        myPanel.add(new JLabel("Enter the radius:"));
        radiusText = new JTextField(((Integer) oldRadius).toString(), 20);
        radiusText.addActionListener(this);
        myPanel.add (radiusText);
        buttonPanel = new JPanel();
        OKButton = new JButton("OK");
        OKButton.addActionListener(this);
        buttonPanel.add(OKButton); 
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        buttonPanel.add(cancelButton); 
        myPanel.add(buttonPanel); 
    }

    public void actionPerformed(ActionEvent e) {
        if (redRButton == e.getSource())
            currentColor = Color.red;
        else if (orangeRButton == e.getSource())
            currentColor = new Color (237, 155, 37);
        else if (yellowRButton == e.getSource())
            currentColor = Color.yellow;
        else if (greenRButton == e.getSource())
            currentColor = Color.green;
        else if (blueRButton == e.getSource())
            currentColor = Color.blue;
        else if (purpleRButton == e.getSource())
            currentColor = new Color(82, 8, 125);
        else if (whiteRButton == e.getSource())
            currentColor = Color.white;
        else if (grayRButton == e.getSource())
            currentColor = new Color (170, 170, 170);
        else if (blackRButton == e.getSource())
            currentColor = Color.black;
        else if(OKButton == e.getSource()) {
            answer = true;
            setVisible(false);
            getContentPane().remove(myPanel);
            try {
                radius = Integer.parseInt (radiusText.getText());
            }
            catch (NumberFormatException ex) {
                radius = oldRadius;
            }
        }
        else if(cancelButton == e.getSource()) {
            answer = false;
            setVisible(false);
            //		getContentPane().remove(myPanel);
        }
    }
} 

