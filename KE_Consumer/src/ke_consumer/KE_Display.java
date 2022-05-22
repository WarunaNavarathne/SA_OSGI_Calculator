package ke_consumer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ke_producer.IKE;
import ke_producer.KEImpl;


public class KE_Display extends JFrame{

	private JPanel panel;
	private JLabel label;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JButton btn1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				KE_Display display = new KE_Display();
				display.setVisible(true);
				
			}
		});

	}

	
	//constructor
	public KE_Display() throws HeadlessException {
		
		setResizable(false);
		setTitle("Kinetic Energy Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 50, 600, 500);
	
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(4,4,4,4));
		setContentPane(panel);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		label = new JLabel("Ek = 1/2mV^2");
		label.setFont(new Font("Calibri", Font.BOLD, 60));
		label.setBounds(150, 30, 400, 70);
		panel.add(label);
		
		
		label2 = new JLabel("Ek = Kinetic Energy");
		label2.setFont(new Font("Calibri", Font.PLAIN, 25));
		label2.setBounds(230, 80, 400, 60);
		panel.add(label2);
		
		label3 = new JLabel("m = Mass");
		label3.setFont(new Font("Calibri", Font.PLAIN, 25));
		label3.setBounds(230, 115, 400, 60);
		panel.add(label3);
		
		label4 = new JLabel("v = Velocity");
		label4.setFont(new Font("Calibri", Font.PLAIN, 25));
		label4.setBounds(230, 150, 400, 60);
		panel.add(label4);
		
		
		label5 = new JLabel("m");
		label5.setFont(new Font("Calibri", Font.PLAIN, 20));
		label5.setBounds(185, 210, 400, 60);
		panel.add(label5);
		
		label6 = new JLabel("v");
		label6.setFont(new Font("Calibri", Font.PLAIN, 20));
		label6.setBounds(440, 210, 400, 60);
		panel.add(label6);
		
		
		
		//textfields 
		JTextField in1 = new JTextField();
		in1.setHorizontalAlignment(SwingConstants.CENTER);
		in1.setFont(new Font("Arial Nova", Font.PLAIN, 25));
		in1.setBounds(100, 250, 180, 40);
		panel.add(in1);
		
		JTextField in2 = new JTextField();
		in2.setHorizontalAlignment(SwingConstants.CENTER);
		in2.setFont(new Font("Arial Nova", Font.PLAIN, 25));
		in2.setBounds(350, 250, 180, 40);
		panel.add(in2);
		
		JTextField in3 = new JTextField();
		in3.setHorizontalAlignment(SwingConstants.CENTER);
		in3.setFont(new Font("Arial Nova", Font.BOLD, 35));
		in3.setBounds(350, 350, 180, 50);
		in3.setEditable(isDisplayable());
		panel.add(in3);
		
		btn1 = new JButton("Calculate");
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btn1.setBounds(100, 350, 200, 50);
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.black);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				IKE ike = new KEImpl();
				double ans = 0;
				ans = ike.KEcal(Double.parseDouble(in1.getText()), Double.parseDouble(in2.getText()));
				
				in3.setText(String.valueOf(ans));
			}
		});
		panel.add(btn1);
	}
		

}
