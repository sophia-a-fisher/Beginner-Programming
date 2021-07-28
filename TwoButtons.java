/*Sophia Fisher
  Chapter 12 - Two Buttons
  Adams - 7th period
  27 January 2019
 */

import javax.swing.*;
import java.awt.*;

public class TwoButtons
{

	public static void main(String[] args) 
	{
	JFrame myFrame = new JFrame();

	myFrame.setTitle("Success is fresh");
	myFrame.setSize(550,150);
	myFrame.setLocation(200, 300);

    // make sure program terminates when window is closed
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // assign a layout
    FlowLayout myLayout = new FlowLayout();
    myFrame.setLayout(myLayout);

    // create and add buttons to the frame
    JButton redButton = new JButton("Red");
    JButton greenButton = new JButton("Green");

    myFrame.add(redButton);
    myFrame.add(greenButton);

    // make the frame visible
    myFrame.setVisible(true);
	
	}

}
