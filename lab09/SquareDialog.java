// File: SquareDialog.java
// Author: Amandeep Gill
// Contents: This file contains the implementation of the dialog box for the
//  squares

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SquareDialog extends JDialog implements ActionListener {
    private JPanel myPanel = null;
    private JButton OKButton = null, cancelButton = null;
    private JTextField sideText;
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
    private boolean answer = false;
    public Color getColor() { return currentColor; }
    public int getSide() { return side; }
    public boolean getAnswer() { return answer; }

    public SquareDialog(JFrame frame, boolean modal, int x, int y, int R) {
        super(frame, modal);
        oldSide = R;
        myPanel = new JPanel();
        getContentPane().add(myPanel);
        myPanel.setLayout (new GridLayout(5,1));
        addRadioButtons ();
        addTextAndButtons ();
        setTitle ("Modify Square Dialog");
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
        myPanel.add(new JLabel("Enter the side length:"));
        sideText = new JTextField(((Integer) oldSide).toString(), 20);
        sideText.addActionListener(this);
        myPanel.add (sideText);
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
                side = Integer.parseInt (sideText.getText());
            }
            catch (NumberFormatException ex) {
                side = oldSide;
            }
        }
        else if(cancelButton == e.getSource()) {
            answer = false;
            setVisible(false);
            //		getContentPane().remove(myPanel);
        }
    }
} 


