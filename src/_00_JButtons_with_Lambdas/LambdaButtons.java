package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((e)->{int first = Integer.parseInt(JOptionPane.showInputDialog("1st number")); 
		int seccond = Integer.parseInt(JOptionPane.showInputDialog("2nd number"));
		JOptionPane.showMessageDialog(null, "These are your numbers: "+first+" and "+seccond);});
		randNumber.addActionListener((e)->{int randy = new Random().nextInt(10000);
		JOptionPane.showMessageDialog(null, "Your random number is: "+randy);});
		tellAJoke.addActionListener((e)->{JOptionPane.showMessageDialog(null, "The chicken crossed the road because he need to go to the bathroom");
		});
		window.setVisible(true);
		window.pack();
		
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

	
	
	
	
}
