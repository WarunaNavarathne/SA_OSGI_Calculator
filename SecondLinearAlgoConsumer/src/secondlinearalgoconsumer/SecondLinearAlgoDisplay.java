package secondlinearalgoconsumer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import secondlinearalgoproducer.ISecondLinearAlgo;
import secondlinearalgoproducer.SecondLinearAlgoImpl;

public class SecondLinearAlgoDisplay extends JFrame{

	private JPanel panel;
	private JLabel label;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JButton btn1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SecondLinearAlgoDisplay seconddisplay = new SecondLinearAlgoDisplay();
				seconddisplay.setVisible(true);
			}
		});
	}

	public SecondLinearAlgoDisplay() {
		setResizable(false);
		setTitle("Second linear algorithm");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 50, 600, 500);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(4,4,4,4));
		setContentPane(panel);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		label = new JLabel("v^2 = u^2 + 2as");
		label.setFont(new Font("Calibri", Font.BOLD, 50));
		label.setBounds(140, 30, 400, 60);
		panel.add(label);
		
		label4 = new JLabel("v^2 = Power of Ending Velocity");
		label4.setFont(new Font("Calibri", Font.PLAIN, 25));
		label4.setBounds(140, 80, 400, 60);
		panel.add(label4);
		
		label5 = new JLabel("u^2 = Power of Starting Velocity");
		label5.setFont(new Font("Calibri", Font.PLAIN, 25));
		label5.setBounds(140, 115, 400, 60);
		panel.add(label5);
		
		label6 = new JLabel("a = Accelaration");
		label6.setFont(new Font("Calibri", Font.PLAIN, 25));
		label6.setBounds(215, 150, 400, 60);
		panel.add(label6);
		
		label7 = new JLabel("The answer you recive is v");
		label7.setFont(new Font("Calibri", Font.PLAIN, 15));
		label7.setBounds(210, 350, 400, 60);
		panel.add(label7);
		
		label8 = new JLabel("s = Displacement");
		label8.setFont(new Font("Calibri", Font.PLAIN, 25));
		label8.setBounds(213, 185, 400, 60);
		panel.add(label8);
		
		label1 = new JLabel("u");
		label1.setFont(new Font("Calibri", Font.PLAIN, 20));
		label1.setBounds(95, 220, 400, 60);
		panel.add(label1);
		
		label2 = new JLabel("a");
		label2.setFont(new Font("Calibri", Font.PLAIN, 20));
		label2.setBounds(290, 220, 400, 60);
		panel.add(label2);
		
		label3 = new JLabel("s");
		label3.setFont(new Font("Calibri", Font.PLAIN, 20));
		label3.setBounds(480, 220, 400, 60);
		panel.add(label3);
		
		JTextField in1 = new JTextField();
		in1.setHorizontalAlignment(SwingConstants.CENTER);
		in1.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in1.setBounds(10, 265, 180, 40);
		panel.add(in1);
		
		JTextField in2 = new JTextField();
		in2.setHorizontalAlignment(SwingConstants.CENTER);
		in2.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in2.setBounds(203, 265, 180, 40);
		panel.add(in2);
		
		JTextField in3 = new JTextField();
		in3.setHorizontalAlignment(SwingConstants.CENTER);
		in3.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in3.setBounds(395, 265, 180, 40);
		panel.add(in3);
		
		JTextField in4 = new JTextField();
		in4.setHorizontalAlignment(SwingConstants.CENTER);
		in4.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in4.setBounds(203, 320, 180, 40);
		in4.setEditable(isDisplayable());
		panel.add(in4);
		
		btn1 = new JButton("Calculate Velocity");
		btn1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btn1.setBounds(217, 395, 150, 50);
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.black);
		//When linking the button add action listener
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ISecondLinearAlgo algo2 = new SecondLinearAlgoImpl();
				double answer = 0;
				
				answer = algo2.powVelocitycal(Double.parseDouble(in1.getText()), Double.parseDouble(in2.getText()), Double.parseDouble(in3.getText()));
				in4.setText(String.valueOf(answer));
			}
		});
		panel.add(btn1);
	}
	
	

}
