package fe_main_ui;

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

import energy_main_ui.Energy_Main_Display;
import force_main_ui.Force_Main_DIsplay;

public class FEMain_UI extends JFrame{

	private JPanel panel;
	private JLabel label;
	private JLabel labe2;
	private JButton btn1;
	private JButton btn2;
	
	private static boolean boo = false;
	private static boolean boo1 = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				FEMain_UI display = new FEMain_UI();
				display.setVisible(true);
			}
		});
	}

	public FEMain_UI() throws HeadlessException {
		setResizable(false);
		setTitle("Force & Energy Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 50, 600, 500);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(4,4,4,4));
		setContentPane(panel);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		label = new JLabel("Force & Energy");
		label.setFont(new Font("Calibri", Font.BOLD, 36));
		label.setBounds(130, 100, 800, 60);
		panel.add(label);
		
		labe2 = new JLabel("Calculator");
		labe2.setFont(new Font("Calibri", Font.BOLD, 36));
		labe2.setBounds(180, 140, 800, 60);
		panel.add(labe2);
		
		btn1 = new JButton("Force(F)");
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 30));
		btn1.setBounds(140, 250, 300, 70);
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.black);
		
		btn1.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boo = Activator.forceDisplayClick();
				
				if(boo == true) {
					Force_Main_DIsplay display = new Force_Main_DIsplay();
					display.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Force Cal Not Startted","Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		
		panel.add(btn1);
		
		btn2 = new JButton("Energy(E)");
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 30));
		btn2.setBounds(140, 350, 300, 70);
		btn2.setBackground(Color.CYAN);
		btn2.setForeground(Color.black);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boo1 = Activator.energyDisplayClick();
				
				if(boo1 = true) {
					Energy_Main_Display displayenergy = new Energy_Main_Display();
					displayenergy.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Energy Cal Not Startted","Error !", JOptionPane.OK_OPTION);
				}
				
			}
		});
		panel.add(btn2);
		
	}

	
}
