/*Sophia fisher
  Chapter 13 - Pizza Place
  Adams - 7th period
  12 February 2019
 */

//Chapter 13 Activity

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.List;
public class PizzaPlace implements ActionListener
{
	JTextField textField;
	JRadioButton small;
	JRadioButton medium;
	JRadioButton large;
	JComboBox pizzaCrust;
	JList toppingsList;
	JCheckBox breadsticks;
	JCheckBox soda;
	JCheckBox salad;
	JTextArea comments;
	JButton placeButton;
	JButton cancelButton;
	
	
	public static void main(String[] args) 
	{
	new PizzaPlace();
	}
	
	public PizzaPlace()
	{
	JFrame mainFrame = new JFrame();
	mainFrame.setTitle("Pizza Place");
	mainFrame.setSize(200,250);
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel mainPanel = (JPanel) mainFrame.getContentPane();
	mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	Border emptyBorder = BorderFactory.createEmptyBorder(10,10,10,10);
	mainPanel.setBorder(emptyBorder);
	
	JPanel customerPanel = new JPanel();
	customerPanel.add(new JLabel("Customer Name: "));
	textField = new JTextField(20);
	customerPanel.add(textField);
	mainPanel.add(customerPanel);
	
	JPanel radioPanel = new JPanel();
	radioPanel.add(new JLabel("Pizza Size: "));
	small = new JRadioButton("small");
	small.addActionListener(this);
	medium = new JRadioButton("medium");
	medium.addActionListener(this);
	large = new JRadioButton("large");
	large.addActionListener(this);
	
	ButtonGroup group = new ButtonGroup();
	group.add(small);
	group.add(medium);
	group.add(large);
	
	radioPanel.add(small);
	radioPanel.add(medium);
	radioPanel.add(large);
	
	mainPanel.add(radioPanel);
	
	JPanel comboPanel = new JPanel();
	comboPanel.add(new JLabel("Crust Type: "));
	
	String [] crusts = {"Thin", "Thick", "Deep Dish"};
	pizzaCrust = new JComboBox(crusts);
	comboPanel.add(pizzaCrust);
	
	mainPanel.add(comboPanel);
	
	JPanel toppingsPanel = new JPanel();
	toppingsPanel.add(new JLabel("Toppings: "));
	String [] toppings = {"Pepperoni", "Sausage", "Green Peppers", "Onions", "Tomatoes", "Anchovies", "Bacon", "Chicken", "Beef", "Olives", "Mushrooms"};
	toppingsList = new JList(toppings);
	toppingsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	toppingsPanel.add(toppingsList);
	toppingsPanel.add(new JScrollPane(toppingsList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
	
	mainPanel.add(toppingsPanel);
	
	JPanel extraPanel = new JPanel();
	extraPanel.add(new JLabel ("Extras: "));
	breadsticks = new JCheckBox("Breadsticks");
	extraPanel.add(breadsticks);
	soda = new JCheckBox("Soda");
	extraPanel.add(soda);
	salad = new JCheckBox("Salad");
	extraPanel.add(salad);
	mainPanel.add(extraPanel);
	
	JPanel commentPanel = new JPanel();
	commentPanel.add(new JLabel("Order Comments: "));
	comments = new JTextArea(5,20);
	commentPanel.add(new JScrollPane(comments, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
	mainPanel.add(commentPanel);
	mainFrame.setVisible(true);
	
	JPanel orderPanel = new JPanel();
	
	placeButton = new JButton("Place Order");
	placeButton.addActionListener(this);
	cancelButton = new JButton("Reset Values");
	cancelButton.addActionListener(this);
	orderPanel.add(placeButton);
	orderPanel.add(cancelButton);
	
	mainPanel.add(orderPanel);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if (source == placeButton)
		{
			String summary = "";
			summary += "PIZZA ORDER FOR: " + textField.getText() + "\n";
			
			if (small.isSelected()) 
			{
				summary += "SIZE: " + "small" + "\n";
			}
			else if (medium.isSelected())
			{
				summary += "SIZE: " + "medium" + "\n";
			}
			else if (large.isSelected())
			{
				summary += "SIZE: " + "large" + "\n";
			}
			
			summary += "CRUST: " + pizzaCrust.getSelectedItem() + "\n";
		
			summary += "TOPPINGS: " + toppingsList.getSelectedValuesList() + "\n";
			
			if (breadsticks.isSelected()) 
			{
				summary += "EXTRA: " + "breadsticks" + "\n";
			}
			if (soda.isSelected())
			{
				summary += "EXTRA: " + "soda" + "\n";
			}
			if (salad.isSelected())
			{
				summary += "EXTRA: " + "salad" + "\n";
			}
			
			summary += "COMMENTS: " + comments.getText();
			
			JOptionPane.showMessageDialog(null, summary);
			
		}
		
		if (source == cancelButton)
		{
			textField.setText("");
			small.setSelected(true);
			medium.setSelected(false);
			large.setSelected(false);
			pizzaCrust.setSelectedIndex(0);
			toppingsList.clearSelection();
			breadsticks.setSelected(false);
			soda.setSelected(false);
			salad.setSelected(false);
			comments.setText("");
			
		}
			
	}
	

}