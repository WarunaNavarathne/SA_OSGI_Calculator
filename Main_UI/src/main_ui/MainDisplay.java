package main_ui;

import circularmotionmain_ui.CircularMotionDisplay;
import fe_main_ui.FEMain_UI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import linearmotionmain_ui.LinearMotionDisplay;
import thermomain_ui.ThermoDisply;

@SuppressWarnings("serial") //if something went wrong delete this line 
public class MainDisplay extends JFrame {
	private JPanel panel;
	private JLabel label;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private static boolean nextUI = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				MainDisplay display = new MainDisplay();
				display.setVisible(true);
			}
		}); 
	}

	//Constructor
	public MainDisplay() throws HeadlessException {
		//This is the loading window
		setResizable(false);
		setTitle("Physics Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 50 , 600, 500);
		
		//The panel which reside inside the window
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(4,4,4,4));
		setContentPane(panel);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		//The heading
		label = new JLabel("PHYSICS CALCULATOR");
		label.setFont(new Font("Calibri", Font.BOLD, 40));
		label.setBounds(105, 50, 400, 60);
		panel.add(label);
		
		//Creating buttons for each category
		btn1 = new JButton("Linear Motion");
		btn1.setFont(new Font("Calibri", Font.PLAIN, 20));
		btn1.setBounds(60, 130, 200, 50);
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.black);
		//When linking the button add action listener
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nextUI = Activator.linearClick();
				if(nextUI == true) {
					LinearMotionDisplay linMotDisplay = new LinearMotionDisplay();
					linMotDisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(btn1);
		
		btn2 = new JButton("Circular Motion");
		btn2.setFont(new Font("Calibri", Font.PLAIN, 20));
		btn2.setBounds(320, 130, 200, 50);
		btn2.setBackground(Color.CYAN);
		btn2.setForeground(Color.black);
		//When linking the button add action listener
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nextUI = Activator.linearClick();
				if(nextUI == true) {
					CircularMotionDisplay CirMotDisplay = new CircularMotionDisplay();
					CirMotDisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(btn2);
		
		btn3 = new JButton("Force & Energy");
		btn3.setFont(new Font("Calibri", Font.PLAIN, 20));
		btn3.setBounds(60, 215, 200, 50);
		btn3.setBackground(Color.CYAN);
		btn3.setForeground(Color.black);
		//When linking the button add action listener
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nextUI = Activator.linearClick();
				if(nextUI == true) {
				FEMain_UI CirMotDisplay = new FEMain_UI();
					CirMotDisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(btn3);
		
		btn4 = new JButton("Thermodinamics");
		btn4.setFont(new Font("Calibri", Font.PLAIN, 20));
		btn4.setBounds(320, 215, 200, 50);
		btn4.setBackground(Color.CYAN);
		btn4.setForeground(Color.black);
		//When linking the button add action listener
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nextUI = Activator.linearClick();
				if(nextUI == true) {
					ThermoDisply thermoDisplay = new ThermoDisply();
					thermoDisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(btn4);
		
	}
	
	
	

}
