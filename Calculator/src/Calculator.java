/*
 * Nicholas Saal
 * Calculator Project
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
	
	JFrame frame;
	JTextField textfield;
	//creating Array for number buttons
	JButton[] numberButtons = new JButton[10];
	//creating Array for the functional buttons
	JButton[] functionButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divButton, decButton, equButton, delButton, clrButton;
	//creating JPanel to hold the function buttons
	JPanel panel;
	
	Font myFont = new Font("Courier",Font.BOLD,30);
	
	double num1=0, num2=0, result=0;
	char operator;
	
	//creating constructor
	Calculator(){
		//initializing the frame
		frame = new JFrame("Calculator");
		//Allowing me to close the application 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		
		textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
		
		//Creating the function Buttons
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("x");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("del");
		clrButton = new JButton("clr");
		
		//adding function buttons to the functionButtons Array
		functionButtons[0]=addButton;
		functionButtons[1]=subButton;
		functionButtons[2]=mulButton;
		functionButtons[3]=divButton;
		functionButtons[4]=decButton;
		functionButtons[5]=equButton;
		functionButtons[6]=delButton;
		functionButtons[7]=clrButton;
		
		//creating a for loop to iterate through the function buttons giving them common attributes 
		for(int i = 0; i < 8; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			//getting rid of annoying outline on button when clicked on
			functionButtons[i].setFocusable(false);
		}
		
		//creating for loop to create numberButtons and giving them common attributes
		for(int i = 0; i < 10; i++) {
			numberButtons[i]= new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		//setting bounds for the delete and clear button
		delButton.setBounds(50, 430, 145, 50);
		clrButton.setBounds(205, 430, 145, 50);
		
		
		//Adding clear and delete button
		frame.add(delButton);
		frame.add(clrButton);
		//adding the text field to the frame
		frame.add(textfield);
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating instance 
		Calculator calc = new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
