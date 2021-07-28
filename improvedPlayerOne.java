/*Sophia Fisher
  Chapter 13 - Player One
  Adams - 7th period
  10 February 2019
 */

import java.awt.*; 
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.util.List;

public class improvedPlayerOne implements ActionListener 
{
   // class-level variables
   JFrame myFrame;

   String playerName;
   JTextField teamTextField;
   JSpinner numLivesSpinner;

   JButton startButton;
   JTextArea outputTextArea;
   
   JList equipmentList;
   JComboBox vehicleCombo;

   public static void main(String[] args) 
   {
      // create a new PlayerOne object to do all the work
      new improvedPlayerOne();
   }

   public improvedPlayerOne()
   {
      // get player's name in pop-up dialog
      playerName = JOptionPane.showInputDialog("Enter player name: ");

      // create new JFrame
      myFrame = new JFrame();

      // set the frame title, size, location
      myFrame.setTitle("Player One");

      // make sure program terminates when window is closed
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // assign an overall layout
      JPanel mainPanel = (JPanel)myFrame.getContentPane(); 
      BoxLayout mainLayout = new BoxLayout(mainPanel,BoxLayout.Y_AXIS);
      mainPanel.setLayout(mainLayout);

      // add an overall border
      Border myBorder = BorderFactory.createEmptyBorder(10,10,10,10);
      mainPanel.setBorder(myBorder);

      // create team panel
      JPanel teamPanel = new JPanel();
      teamPanel.setLayout(new BoxLayout(teamPanel, BoxLayout.Y_AXIS));

      // add label and text field to team panel
      teamPanel.add(new JLabel("Welcome " + playerName + ". What is your team name?"));
      teamTextField = new JTextField(20);
      teamPanel.add(teamTextField);

      // add team panel to main panel, plus some spacing
      mainPanel.add(teamPanel);
      mainPanel.add(new JLabel(" "));

      // create number of lives panel
      JPanel livesPanel = new JPanel();
      livesPanel.setLayout(new FlowLayout());

      // add label and spinner to lives panel
      livesPanel.add(new JLabel("Select number of lives: "));
      numLivesSpinner = new JSpinner(new SpinnerNumberModel(3,1,5,1));
      livesPanel.add(numLivesSpinner);

      // add lives panel to main panel, plus some spacing
      mainPanel.add(livesPanel);
      mainPanel.add(new JLabel(" "));
      
      JPanel equipPanel = new JPanel();
      equipPanel.setLayout(new FlowLayout());
      
      equipPanel.add(new JLabel("Select starting equipment: "));
      String [] equipment = {"Rubber Ducky", "Lasso", "Bandana", "Banana"};
      
      equipmentList = new JList(equipment);
      equipmentList.setAlignmentX(Component.CENTER_ALIGNMENT);
      equipmentList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      equipPanel.add(equipmentList);
      
      mainPanel.add(equipPanel);
      mainPanel.add(new JLabel(""));
      
      JPanel vehiclePanel = new JPanel();
      vehiclePanel.setLayout(new FlowLayout());
      vehiclePanel.add(new JLabel("Select your strating vehicle: "));
      String [] vehicles = {"Banana Car", "Carrot Car", "Apple Kart", "Donut Mobile"};
      
      vehicleCombo = new JComboBox(vehicles);
      vehiclePanel.add(vehicleCombo);
      
      mainPanel.add(vehiclePanel);
      mainPanel.add(new JLabel(""));

      // create start panel
      JPanel startPanel = new JPanel();
      startPanel.setLayout(new BoxLayout(startPanel, BoxLayout.Y_AXIS));

      // add start button and output text area to start panel
      startButton = new JButton("Start");
      startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      startPanel.add(startButton);
      startPanel.add(new JLabel(" "));
      outputTextArea = new JTextArea(5,20);
      outputTextArea.setLineWrap(true); 
      startPanel.add(outputTextArea);

      // add start panel to main panel
      mainPanel.add(startPanel);

      // link buttons to our actionPerformed() function
      startButton.addActionListener(this);

      // pack and make the frame visible
      myFrame.pack();
      myFrame.setVisible(true);
   }

   public void actionPerformed(ActionEvent event)
   {
      Object control = event.getSource();

      // if startButton was clicked
      if (control == startButton)
      {
         // read team name
         String teamName = teamTextField.getText();

         // read number of lives
         int numLives = (Integer)numLivesSpinner.getValue();
         
         List equipment = equipmentList.getSelectedValuesList();
         String chosen = "";
         
         for (int i=0; i< equipment.size(); i++)
         {
        	 chosen = chosen + (String)equipment.get(i);
        	 if(i< equipment.size() -1)
        	 {
        		 chosen = chosen + ", ";
        	 }
        	 
         }
         
         String vehicle = (String) vehicleCombo.getSelectedItem();

         // form output statement
         String output = "Welcome " + playerName + " of team " + teamName + 
                         ".  You are starting with " + numLives + " lives.";
         output += " You have chosen the following starting equipment: " + chosen + ".";
         output += " You have selected the following starting vehicle: " + vehicle + ".";

         // update output text area
         outputTextArea.setText(output);
      }
   }
}  