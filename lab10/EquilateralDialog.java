// File: EquilateralDialog.java
// Author: Amandeep Gill
// Contents: This file contains the implementation of the dialog box for the
//  equilateral triangles

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EquilateralDialog extends JDialog implements ActionListener {
    private JPanel sidePanel = null;
    private JButton OKButton = null, cancelButton = null;
    private JTextField sideText;
    private JTextField angleText;
    private JRadioButton redRButton = null, orangeRButton = null,
            yellowRButton = null, greenRButton = null,
            blueRButton = null, purpleRButton = null,
            whiteRButton = null, grayRButton = null,
            blackRButton = null;
    private ButtonGroup shapeGroup= null, colorGroup = null;
    private JPanel colorPanel = null, buttonPanel = null;    
    private Color currentColor = Color.red;
    private int oldSide = 0;
    private int side = 0;
    private int oldAngle = 0;
    private int angle = 0;
    private boolean answer = false;
    public Color getColor() { return currentColor; }
    public int getSide() { return side; }
    public int getAngle() { return angle; }
    public boolean getAnswer() { return answer; }

    public EquilateralDialog(JFrame frame, boolean modal, int x, int y, int R, int A) {
        super(frame, modal);
        oldSide = R;
        oldAngle = A;
        sidePanel = new JPanel();
        getContentPane().add(sidePanel);
        sidePanel.setLayout (new GridLayout(5,1));
        addRadioButtons ();
        addTextAndButtons ();
        setTitle ("Modify Equilateral Dialog");
        setLocation (x, y);
        setSize (500,350);
        setVisible(true);
    }

    private void addRadioButtons () {
        sidePanel.add(new JLabel("Select a color:"));
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
        sidePanel.add (colorPanel);
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
        sidePanel.add(new JLabel("Enter the side length folowed by the rotation:"));
        sideText = new JTextField(((Integer) oldSide).toString() + " " + ((Integer) oldAngle).toString(), 20);
        sideText.addActionListener(this);
        sidePanel.add (sideText);
        buttonPanel = new JPanel();
        OKButton = new JButton("OK");
        OKButton.addActionListener(this);
        buttonPanel.add(OKButton); 
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        buttonPanel.add(cancelButton); 
        sidePanel.add(buttonPanel); 
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
            getContentPane().remove(sidePanel);
            String [] parts = sideText.getText().split(" |,");
            try {
                side = Integer.parseInt (parts[0]);
                angle = Integer.parseInt (parts[1]);
            }
            catch (NumberFormatException ex) {
                side = oldSide;
            }
        }
        else if(cancelButton == e.getSource()) {
            answer = false;
            setVisible(false);
            //		getContentPane().remove(sidePanel);
        }
    }
} 
