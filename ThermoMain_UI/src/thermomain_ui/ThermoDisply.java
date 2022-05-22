package thermomain_ui;

import firstthermoalogconsumer.FirstThermoAlogDisplay;
import fourththermoalgoconsumer.FourthThermoAlgoDisplay;
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
import secondthermoalgoconsumer.SecondThermoAlgoDisplay;
import thirdthermoalgoconsumer.ThirdThermoAlgoDisplay;

public class ThermoDisply extends JFrame{

	private JPanel panel;
	private JLabel label;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private static boolean nextUI2 = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ThermoDisply display = new ThermoDisply();
				display.setVisible(true);
			}
		}); 
	}

	public ThermoDisply() throws HeadlessException {
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
		label = new JLabel("Thermodynamics Calculator");
		label.setFont(new Font("Calibri", Font.BOLD, 40));
		label.setBounds(60, 70, 500, 60);
		panel.add(label);
		
		//Creating buttons for each category
		btn1 = new JButton("Ideal gas law");
		btn1.setFont(new Font("Calibri", Font.PLAIN, 20));
		btn1.setBounds(80, 170, 200, 50);
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.black);
		//When linking the button add action listener
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nextUI2 = Activator.linearClick();
				if(nextUI2 == true) {
					FirstThermoAlogDisplay firstdisplay = new FirstThermoAlogDisplay();
					firstdisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(btn1);
		
		btn2 = new JButton("Specific Heat Capacity");
		btn2.setFont(new Font("Calibri", Font.PLAIN, 20));
		btn2.setBounds(300, 170, 200, 50);
		btn2.setBackground(Color.CYAN);
		btn2.setForeground(Color.black);
		//When linking the button add action listener
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nextUI2 = Activator.linearClick();
				if(nextUI2 == true) {
					SecondThermoAlgoDisplay seconddisplay = new SecondThermoAlgoDisplay();
					seconddisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		
		panel.add(btn2);
		
		btn3 = new JButton("Latent Heat");
		btn3.setFont(new Font("Calibri", Font.PLAIN, 20));
		btn3.setBounds(80, 250, 200, 50);
		btn3.setBackground(Color.CYAN);
		btn3.setForeground(Color.black);
		//When linking the button add action listener
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nextUI2 = Activator.linearClick();
				if(nextUI2 == true) {
					ThirdThermoAlgoDisplay thirddisplay = new ThirdThermoAlgoDisplay();
					thirddisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		
		panel.add(btn3);
		
		btn4 = new JButton("Change of Internal Energy");
		btn4.setFont(new Font("Calibri", Font.PLAIN, 20));
		btn4.setBounds(300, 250, 200, 50);
		btn4.setBackground(Color.CYAN);
		btn4.setForeground(Color.black);
		//When linking the button add action listener
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nextUI2 = Activator.linearClick();
				if(nextUI2 == true) {
					FourthThermoAlgoDisplay fourthdisplay = new FourthThermoAlgoDisplay();
					fourthdisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		
		panel.add(btn4);
	}

	
}
