package thirdthermoalgoconsumer;

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

import thirdthermoalgoproducer.IThirdThermoAlgo;
import thirdthermoalgoproducer.ThirdThermoAlgoImpl;

public class ThirdThermoAlgoDisplay extends JFrame{
	
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
				ThirdThermoAlgoDisplay thirddisplay = new ThirdThermoAlgoDisplay();
				thirddisplay.setVisible(true);
			}
		});

	}

	public ThirdThermoAlgoDisplay() throws HeadlessException {
		setResizable(false);
		setTitle("Latent Heat");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 50, 600, 500);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(4,4,4,4));
		setContentPane(panel);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		label = new JLabel("L = Q/m");
		label.setFont(new Font("Calibri", Font.BOLD, 50));
		label.setBounds(210, 30, 400, 60);
		panel.add(label);
		
		label4 = new JLabel("L = Latency Heat");
		label4.setFont(new Font("Calibri", Font.PLAIN, 25));
		label4.setBounds(210, 80, 400, 60);
		panel.add(label4);
		
		label5 = new JLabel("Q = Energy");
		label5.setFont(new Font("Calibri", Font.PLAIN, 25));
		label5.setBounds(230, 115, 400, 60);
		panel.add(label5);
		
		label6 = new JLabel("m = Mass");
		label6.setFont(new Font("Calibri", Font.PLAIN, 25));
		label6.setBounds(240, 150, 400, 60);
		panel.add(label6);
		
		label1 = new JLabel("Q");
		label1.setFont(new Font("Calibri", Font.PLAIN, 20));
		label1.setBounds(190, 220, 400, 60);
		panel.add(label1);
		
		label2 = new JLabel("m");
		label2.setFont(new Font("Calibri", Font.PLAIN, 20));
		label2.setBounds(380, 220, 400, 60);
		panel.add(label2);
		
		JTextField in1 = new JTextField();
		in1.setHorizontalAlignment(SwingConstants.CENTER);
		in1.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in1.setBounds(100, 265, 180, 40);
		panel.add(in1);
		
		JTextField in2 = new JTextField();
		in2.setHorizontalAlignment(SwingConstants.CENTER);
		in2.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in2.setBounds(300, 265, 180, 40);
		panel.add(in2);
		
		JTextField in4 = new JTextField();
		in4.setHorizontalAlignment(SwingConstants.CENTER);
		in4.setFont(new Font("Arial Nova", Font.PLAIN, 15));
		in4.setBounds(203, 335, 180, 40);
		in4.setEditable(isDisplayable());
		panel.add(in4);
		
		btn1 = new JButton("Calculate Latency Heat");
		btn1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btn1.setBounds(193, 395, 200, 50);
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.black);
		//When linking the button add action listener
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				IThirdThermoAlgo algo3 = new ThirdThermoAlgoImpl();
				double answer = 0;
								
				answer = algo3.LatentHeat(Double.parseDouble(in1.getText()), Double.parseDouble(in2.getText()));
				in4.setText(String.valueOf(answer));
			}
		});
		panel.add(btn1);

	}

	
}
