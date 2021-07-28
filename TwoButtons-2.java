/*Sophia Fisher
  Chapter 12 - Two Buttons
  Adams - 7th period
  27 January 2019
 */

//this awesome program makes a window change different colors

//importing all the GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons implements ActionListener
{
//defining some member variables
JButton redButton;
JButton greenButton;
FlowLayout myLayout;
JFrame myFrame;

	public static void main(String[] args) 
	{
	//creating instance of our class
	new TwoButtons();
	}
	
	//constructor
	public TwoButtons ()
	{
		myFrame = new JFrame();

		myFrame.setTitle("Success is fresh");
		myFrame.setSize(550,150);
		myFrame.setLocation(200, 300);

	    // make sure program terminates when window is closed
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // assign a layout
	    myLayout = new FlowLayout();
	    myFrame.setLayout(myLayout);

	    // create and add buttons to the frame
	    redButton = new JButton("Red");
	    redButton.addActionListener(this);
	    greenButton = new JButton("Green");
	    greenButton.addActionListener(this);

	    myFrame.add(redButton);
	    myFrame.add(greenButton);

	    // make the frame visible
	    myFrame.setVisible(true);
		
	}

	@Override
	//interface's method
	public void actionPerformed(ActionEvent e) 
	{
	Object name = e.getSource();
	
		//if button clicked is the red button
		if(name == redButton)
		{
			//print out red button clicked and change color
		JOptionPane.showMessageDialog(null, "The red button has been clicked");
		myFrame.getContentPane().setBackground(Color.red);
		}
		
		if(name == greenButton)
		{
		JOptionPane.showMessageDialog(null, "The green button has been clicked");
		myFrame.getContentPane().setBackground(Color.green);
		}
		
	}

}