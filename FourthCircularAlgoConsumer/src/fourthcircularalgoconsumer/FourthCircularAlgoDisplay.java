package fourthcircularalgoconsumer;

import java.awt.Color;
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


import fourthcircularalgoproducer.FourthCircularAlgoImpl;
import fourthcircularalgoproducer.IFourthCircularAlgo;

public class FourthCircularAlgoDisplay extends JFrame{
	


	private JPanel panel;
	private JLabel label;
	private JLabel label1;
	private JLabel label2;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JButton btn1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				FourthCircularAlgoDisplay fourthdisplay = new FourthCircularAlgoDisplay();
				fourthdisplay.setVisible(true);
			}
		});


	}
	
	public FourthCircularAlgoDisplay() throws HeadlessException {
		
		setResizable(false);
		setTitle("Fourth Circular algorithm");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 50, 600, 500);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(4,4,4,4));
		setContentPane(panel);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		label = new JLabel("w = 2*(pi)*f");
		label.setFont(new Font("Calibri", Font.BOLD, 50));
		label.setBounds(180, 70, 400, 60);
		panel.add(label);
		
		label4 = new JLabel("w = Angular Velocity");
		label4.setFont(new Font("Calibri", Font.PLAIN, 25));
		label4.setBounds(198, 125, 400, 60);
		panel.add(label4);
		
		label5 = new JLabel("f = Frequency ");
		label5.setFont(new Font("Calibri", Font.PLAIN, 25));
		label5.setBounds(230, 160, 400, 60);
		panel.add(label5);
		
		
		
	
		
		label1 = new JLabel("f");
		label1.setFont(new Font("Calibri", Font.PLAIN, 20));
		label1.setBounds(180, 220, 400, 60);
		panel.add(label1);
		
	
		
		
		
		JTextField in1 = new JTextField();
		in1.setHorizontalAlignment(SwingConstants.CENTER);
		in1.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in1.setBounds(90, 260, 180, 40);
		panel.add(in1);
		
		
		
	
		
		JTextField in4 = new JTextField();
		in4.setHorizontalAlignment(SwingConstants.CENTER);
		in4.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in4.setBounds(300, 260, 180, 40);
		in4.setEditable(isDisplayable());
		panel.add(in4);
		
		btn1 = new JButton("Angular Velocity");
		btn1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btn1.setBounds(205, 350, 190, 50);
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.black);
		//When linking the button add action listener
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				IFourthCircularAlgo algo4 = new FourthCircularAlgoImpl();
				double answer = 0;
				
				answer = algo4.intiCirVel2(Double.parseDouble(in1.getText()));
				
				in4.setText(String.valueOf(answer));
			}
		});
		
		panel.add(btn1);
	}
	

}
