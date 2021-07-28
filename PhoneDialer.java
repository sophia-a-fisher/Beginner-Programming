/*Sophia Fisher
  Chapter 12 - Activity
  Adams - 7th period
  8 January 2019
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;
public class PhoneDialer implements ActionListener
{
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button0;
	JButton dash;
	JButton dialNumber;
	String answer = "";

	public static void main(String[] args)
	{
	new PhoneDialer();
	}
	
	public PhoneDialer()
	{
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Dialer");
		myFrame.setSize(200,250);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel myPanel = (JPanel)myFrame.getContentPane();
		//problem here below
		BoxLayout myLayout = new BoxLayout(myPanel, BoxLayout.Y_AXIS);
		myFrame.setLayout(myLayout);
		
		Border myBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		myPanel.setBorder(myBorder);
		
		JPanel topPanel = new JPanel();
		FlowLayout flowLayout = new FlowLayout();
		topPanel.setLayout(flowLayout);
		
		JLabel topLabel = new JLabel("Enter the label to dial: ");
		topPanel.add(topLabel);
		
		JPanel numberPanel = new JPanel();
		GridLayout numberLayout = new GridLayout(4,3,5,5);
		Border otherBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		dash = new JButton("-");
		
		numberPanel.add(button1);
		numberPanel.add(button2);
		numberPanel.add(button3);
		numberPanel.add(button4);
		numberPanel.add(button5);
		numberPanel.add(button6);
		numberPanel.add(button7);
		numberPanel.add(button8);
		numberPanel.add(button9);
		numberPanel.add(dash);
		numberPanel.add(button0);
		
		myPanel.add(topPanel);
		myPanel.add(numberPanel);
		
		dialNumber = new JButton("Dial Number");
		dialNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
		myPanel.add(dialNumber);
		myFrame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		dash.addActionListener(this);
		dialNumber.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) 
	{
		Object name = e.getSource();
		if (name == dialNumber)
		{
			JOptionPane.showMessageDialog(null, "Dialing: " + answer);
			answer = "";
		}
		else if(name == button0)
		{
			answer += "0";
		}
		else if(name == button1)
		{
			answer += "1";
		}
		else if(name == button2)
		{
			answer += "2";
		}
		else if(name == button3)
		{
			answer += "3";
		}
		else if(name == button4)
		{
			answer += "4";
		}
		else if(name == button5)
		{
			answer += "5";
		}
		else if(name == button6)
		{
			answer += "6";
		}
		else if(name == button7)
		{
			answer += "7";
		}
		else if(name == button8)
		{
			answer += "8";
		}
		else if(name == button9)
		{
			answer += "9";
		}
		else if(name == dash)
		{
			answer += "-";
		}
		
	}

}
