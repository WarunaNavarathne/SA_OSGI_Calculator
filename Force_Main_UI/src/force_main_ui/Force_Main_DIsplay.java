package force_main_ui;

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
import preasure_consumer.Preasure_Display;
import force_consumer.Force_Display;



public class Force_Main_DIsplay extends JFrame{

	private JPanel panel;
	private JLabel label;
	private JLabel labe2;
	private JLabel labe3;
	private JLabel labe4;
	private JButton btn1;
	private JButton btn2;
	
	private static boolean boo = false;
	private static boolean boo1 = false;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Force_Main_DIsplay display = new Force_Main_DIsplay();
				display.setVisible(true);
				
			}
		});

		
	}

	//Constrctor
	public Force_Main_DIsplay() throws HeadlessException {
		
		setResizable(false);
		setTitle("Force Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 50, 600, 500);
	
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(4,4,4,4));
		setContentPane(panel);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		
		label = new JLabel("Force");
		label.setFont(new Font("Calibri", Font.BOLD, 36));
		label.setBounds(255, 30, 800, 60);
		panel.add(label);
		
		labe2 = new JLabel("&");
		labe2.setFont(new Font("Calibri", Font.BOLD, 36));
		labe2.setBounds(280, 70, 800, 60);
		panel.add(labe2);
			
		labe3 = new JLabel("Preasure");
		labe3.setFont(new Font("Calibri", Font.BOLD, 36));
		labe3.setBounds(230, 110, 800, 60);
		panel.add(labe3);
		
		labe4 = new JLabel("Calculator");
		labe4.setFont(new Font("Calibri", Font.BOLD, 36));
		labe4.setBounds(220, 150, 800, 60);
		panel.add(labe4);
		

		
		btn1 = new JButton("F = ma");
		btn1.setFont(new Font("Arial Black", Font.BOLD, 34));
		btn1.setBounds(100, 250, 400, 80);
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.black);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boo = Activator.forceonlyDisplayClick();
				
				if(boo == true) {
					Force_Display display = new Force_Display();
					display.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Force Cal Not Startted","Error !", JOptionPane.OK_OPTION);
				}
				
			}
		});
		
		panel.add(btn1);
		
		
		btn2 = new JButton("P = F/A");
		btn2.setFont(new Font("Arial Black", Font.BOLD, 34));
		btn2.setBounds(100, 355, 400, 80);
		btn2.setBackground(Color.CYAN);
		btn2.setForeground(Color.black);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boo1 = Activator.preasureonlyDisplayClick();
				
				if(boo1 == true) {
					Preasure_Display display1 = new Preasure_Display();
					display1.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Preasure Cal Not Startted","Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		
		panel.add(btn2);
	}
	
	

}
