/*Sophia Fisher
  Chapter 13 - Radio Buttons
  Adams - 7th period
  12 February 2019
 */

//using check boxes and radio buttons
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radioButtons implements ActionListener
{
	//member variables
	private JTextField textField;
	private JRadioButton radioPlain;
	private JRadioButton radioItalic;
    private JRadioButton radioBold;
    
	public static void main(String[] args) 
	{
	new radioButtons();
	}
	
	public radioButtons()
	{
	JFrame mainFrame = new JFrame();
	mainFrame.setLayout(new FlowLayout());
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel mainPanel = (JPanel) mainFrame.getContentPane();
	
	ButtonGroup radioGroup = new ButtonGroup();
	radioPlain = new JRadioButton("Plain");
	radioItalic = new JRadioButton("Italic");
	radioBold = new JRadioButton("Bold");
	
	radioPlain.setSelected(true);
	
	radioGroup.add(radioPlain);
	radioGroup.add(radioItalic);
	radioGroup.add(radioBold);
	
	mainPanel.add(radioPlain);
	mainPanel.add(radioItalic);
	mainPanel.add(radioBold);
	
	radioPlain.addActionListener(this);
	radioItalic.addActionListener(this);
	radioBold.addActionListener(this);
	
	textField = new JTextField("Example", 25);
	mainPanel.add(textField);
	mainFrame.pack();
	mainFrame.setVisible(true);
	
	}

	public void actionPerformed(ActionEvent e)
	{
	Object control = e.getSource();
	int style;
	
	if(control == radioPlain)
	{
		style = Font.PLAIN;
	}
	
	else if (control == radioItalic)
	{
		style = Font.ITALIC;
	}
	
	else 
	{
		style = Font.BOLD;
	}
		
	Font font = new Font("TimesRoman", style, 14);
	textField.setFont(font);
	
	}

}
