// file: ShapeDialog.java
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


public class ShapeDialog extends JDialog implements ActionListener 
{
 	private JPanel myPanel = null;
 	private JButton OKButton = null, cancelButton = null;
	private JCheckBox circleCBox = null, equilateralCBox = null, 
			squareCBox = null, scaleneCBox = null,
			rightCBox = null, rectangleCBox = null;
	private JRadioButton redRButton = null, orangeRButton = null,
			yellowRButton = null, greenRButton = null,
			blueRButton = null, purpleRButton = null,
			whiteRButton = null, grayRButton = null,
			blackRButton = null;
	private ButtonGroup shapeGroup= null, colorGroup = null;
	private JPanel shapePanel = null, colorPanel = null, buttonPanel = null;    
	private Color currentColor = Color.red;
	private Shape.ShapeType currentShape = Shape.ShapeType.CIRCLE;
	private Shape newShape = null;
	public Shape getMyShape () {return newShape; }
 	private boolean answer = false;
 	public boolean getAnswer() { return answer; }

	public ShapeDialog(JFrame frame, boolean modal, int x, int y)
	{
 		super(frame, modal);
 		myPanel = new JPanel();
		getContentPane().add(myPanel);
		myPanel.setLayout (new GridLayout(5,1));
		addCheckBoxes ();
		addRadioButtons ();
		addTextAndButtons ();
		setTitle ("New Shape Dialog");
		setLocation (x, y);
		setSize (400,250);
 		setVisible(true);
	}
	
	private void addCheckBoxes ()
	{
	 	myPanel.add(new JLabel("Select a shape:"));
		shapePanel = new JPanel();
		shapePanel.setLayout (new GridLayout (2,3));
		circleCBox = new JCheckBox ("Circle",true);
		circleCBox.addActionListener(this);
		shapePanel.add (circleCBox);
		squareCBox = new JCheckBox ("Square",false);
		squareCBox.addActionListener(this);
		shapePanel.add (squareCBox);
		rectangleCBox = new JCheckBox ("Rectangle",false);
		rectangleCBox.addActionListener(this);
		shapePanel.add (rectangleCBox);
		equilateralCBox = new JCheckBox ("Eqilateral",false);
		equilateralCBox.addActionListener(this);
		shapePanel.add (equilateralCBox);
		rightCBox = new JCheckBox ("Right",false);
		rightCBox.addActionListener(this);
		shapePanel.add (rightCBox);
		scaleneCBox = new JCheckBox ("Scalene",false);
		scaleneCBox.addActionListener(this);
		shapePanel.add (scaleneCBox);
		myPanel.add (shapePanel);
		shapeGroup = new ButtonGroup ();
		shapeGroup.add (circleCBox);
		shapeGroup.add (squareCBox);
		shapeGroup.add (equilateralCBox);
		shapeGroup.add (rectangleCBox);
		shapeGroup.add (rightCBox);
		shapeGroup.add (scaleneCBox);
	}

	private void addRadioButtons ()
	{
	 	myPanel.add(new JLabel("Select a color:"));
		colorPanel = new JPanel();
		colorPanel.setLayout (new GridLayout (3,4));
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
		grayRButton = new JRadioButton ("Light Gray",false);
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

	private void addTextAndButtons ()
	{
		buttonPanel = new JPanel();
		OKButton = new JButton("OK");
		OKButton.addActionListener(this);
		buttonPanel.add(OKButton); 
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		buttonPanel.add(cancelButton); 
		myPanel.add(buttonPanel); 
	}

	public void actionPerformed(ActionEvent e) 
	{
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
		else if (circleCBox == e.getSource())
			currentShape = Shape.ShapeType.CIRCLE;
		else if (squareCBox == e.getSource())
			currentShape = Shape.ShapeType.SQUARE;
		else if (rectangleCBox == e.getSource())
			currentShape = Shape.ShapeType.RECTANGLE;
		else if (equilateralCBox == e.getSource())
			currentShape = Shape.ShapeType.EQUILATERAL;
		else if (equilateralCBox == e.getSource())
			currentShape = Shape.ShapeType.EQUILATERAL;
		else if (rightCBox == e.getSource())
			currentShape = Shape.ShapeType.RIGHT;
		else if (scaleneCBox == e.getSource())
			currentShape = Shape.ShapeType.SCALENE;
		else if(OKButton == e.getSource()) 
		{
			switch (currentShape)
			{
				case CIRCLE:
					newShape = new Circle (); break;
				case SQUARE:
					newShape = new Square (); break;
				case RECTANGLE:
					newShape = new Rectangle (); break;
				case EQUILATERAL:
					newShape = new Equilateral (); break;
				case RIGHT:
					newShape = new Right (); break;
				case SCALENE:
					newShape = new Scalene (); break;
				default:
					newShape = new Circle (); break;
			}
			answer = true;
			setVisible(false);
			getContentPane().remove(myPanel);
        	}
 		else if(cancelButton == e.getSource()) 
		{
 			answer = false;
			setVisible(false);
		}
       }
} 

