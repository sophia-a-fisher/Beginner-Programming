/*Sophia Fisher
  Chapter 14 - Activity
  Adams - 7th period
  1 March 2019
 */

//import statements
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class BaseballStats implements ActionListener
{
	//class variables
	JFrame myFrame;
	JTextField nameBox;
	JSpinner panel1;
	JSpinner panel2;
	JSpinner panel3;
	JSpinner panel4;
	JSpinner panel5;
	JTextArea playerText;
	JButton add;
	JButton reset;
	JButton show;
	
	ArrayList<Player> playerList = new ArrayList<Player>();
	DecimalFormat df = new DecimalFormat("0.000"); 
	
	public BaseballStats()
	{
		//setting up the JFrame 
		myFrame = new JFrame();
		myFrame.setTitle("Baseball Stats");
		myFrame.setSize(600,300);
		
		//setting up main JPanel
		JPanel mainPanel = (JPanel)myFrame.getContentPane();
		mainPanel.setLayout(new FlowLayout());
		
		//creating a panel for the players name
		JPanel namePanel = new JPanel();
		namePanel.add(new JLabel("Player Name: "));
		nameBox = new JTextField(30);
		namePanel.add(nameBox);
		mainPanel.add(namePanel);
		
		//creating a panel for the hits counters
		JPanel hitPanel = new JPanel();
		//hitPanel.setLayout(new BoxLayout(hitPanel, BoxLayout.Y_AXIS));  this failed
		hitPanel.add(new JLabel("Game 1 Hits: "));
		panel1 = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		hitPanel.add(panel1);
		hitPanel.add(new JLabel("Game 2 Hits: "));
		panel2 = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		hitPanel.add(panel2);
		hitPanel.add(new JLabel("Game 3 Hits: "));
		panel3 = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		hitPanel.add(panel3);
		hitPanel.add(new JLabel("Game 4 Hits: "));
		panel4 = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		hitPanel.add(panel4);
		hitPanel.add(new JLabel("Game 5 Hits: "));
		panel5 = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		hitPanel.add(panel5);
		mainPanel.add(hitPanel);
		
		//creating a panel for the current players text area 
		JPanel playersPanel = new JPanel();
		playersPanel.add(new JLabel("Current Players: "));
		playerText = new JTextArea(5,30);
		playerText.setLineWrap(true);
		playerText.setEditable(false);
		JScrollPane myScroller = new JScrollPane(playerText,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		playersPanel.add(myScroller);
		mainPanel.add(playersPanel);
		
		//creating a panel for the buttons
		JPanel buttonsPanel = new JPanel();
		add = new JButton("Add Player");
		add.addActionListener(this);
		reset = new JButton("Reset Values");
		reset.addActionListener(this);
		show = new JButton("Show Stats");
		show.addActionListener(this);
		buttonsPanel.add(add);
		buttonsPanel.add(reset);
		buttonsPanel.add(show);
		mainPanel.add(buttonsPanel);
		
		//setting default operations
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		
	}

	public static void main(String[] args) 
	{
		//creating new instance of our class
		new BaseballStats();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		
		//when the add button is clicked
		if(source == add)
		{
			//get the values in the controls
			String playerName = nameBox.getText();
			int[] gameHits = new int[5];
			gameHits[0] = (Integer)panel1.getValue();
			gameHits[1] = (Integer)panel2.getValue();
			gameHits[2] = (Integer)panel3.getValue();
			gameHits[3] = (Integer)panel4.getValue();
			gameHits[4] = (Integer)panel5.getValue();
			
			//create a new Player with info
			Player player1 = new Player();
			player1.name = playerName;
			player1.gameHits = gameHits;
			playerList.add(player1);
			
			//clearing all data in the controls
			nameBox.setText("");
			panel1.setValue(0);
			panel2.setValue(0);
			panel3.setValue(0);
			panel4.setValue(0);
			panel5.setValue(0);
			
			//iterate through the Player objects in the array list
			String PlayerNames = "";
			for (Player p : playerList)  
			{	
				PlayerNames = PlayerNames + p.name + "\n";
			}
			
			playerText.setText(PlayerNames);

			
		}
		
		//if the reset button is clicked
		if(source == reset)
		{
			//clearing all the controls
			nameBox.setText("");
			panel1.setValue(0);
			panel2.setValue(0);
			panel3.setValue(0);
			panel4.setValue(0);
			panel5.setValue(0);
			playerText.setText("");
			playerList.clear();
			
		}
		
		//if the show stats button is clicked
		if(source == show)
		{
			String message = "";
			int totalHits = 0;
			
			//for all players in the list
			for (Player p : playerList)  
			{	
				//for all the games
				for(int i = 0; i < p.gameHits.length; i++)
				{
					//add all the scores from each game
					totalHits += p.gameHits[i];
				}
				
			//get average accuracy and add to string
			double battingAverage = (double)totalHits/25.0;
			String result = df.format(battingAverage);
			message += p.name + ": Batting Average: " + result + "\n"; 
			totalHits = 0;
			}
			
			//print the message into a window
			JOptionPane.showMessageDialog(null, message);
			
		}
		
	}

}