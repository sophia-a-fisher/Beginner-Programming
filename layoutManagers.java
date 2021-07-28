/*Sophia Fisher
  Chapter 12 - Layout Managers
  Adams - 7th period
  7 January 2019
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

//experimenting with layout managers
public class layoutManagers implements ActionListener
{
	//defining some member variables
	JButton redButton;
	JButton greenButton;
	JPanel myPanel;
	//FlowLayout myLayout;
	//GridLayout myLayout;
	//BoxLayout myLayout;
	BorderLayout myLayout;
	JFrame myFrame;
	Border myBorder;

		public static void main(String[] args) 
		{
		//creating instance of our class
		new layoutManagers();
		}
		
		//constructor
		public layoutManagers()
		{
			myFrame = new JFrame();

			myFrame.setTitle("This Window");
			myFrame.setSize(500,150);
			myFrame.setLocation(200, 300);
			myPanel = new JPanel();
			myPanel = (JPanel)myFrame.getContentPane();
			myPanel.setBorder(myBorder);
			myBorder = BorderFactory.createLineBorder(Color.YELLOW, 5);

		    // make sure program terminates when window is closed
		    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    // assign a layout
		    myLayout = new BorderLayout();
		    myFrame.setLayout(myLayout);
		    

		    // create and add buttons to the frame
		    redButton = new JButton("Red");
		    redButton.addActionListener(this);
		    greenButton = new JButton("Green");
		    greenButton.addActionListener(this);

		    myFrame.add(redButton,BorderLayout.LINE_START);
		   // myFrame.add(new JLabel(""));
		   // myFrame.add(new JLabel(""));
		   // myFrame.add(new JLabel(""));
		    //myFrame.add(new JLabel(""));
		    //myFrame.add(new JLabel(""));
		    myFrame.add(greenButton,BorderLayout.LINE_END);

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

