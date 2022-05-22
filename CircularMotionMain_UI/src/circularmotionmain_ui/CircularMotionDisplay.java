package circularmotionmain_ui;

import firstcircularalgoconsumer.FirstCircularAlgoDisplay;
import fourthcircularalgoconsumer.FourthCircularAlgoDisplay;
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
import secondcircularalgoconsumer.SecondCircularAlgoDisplay;
import thirdcircularalgoconsumer.ThirdCircularAlgoDisplay;

public class CircularMotionDisplay extends JFrame {
	
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
				CircularMotionDisplay display = new CircularMotionDisplay();
				display.setVisible(true);
			}
		}); 
	}

	public CircularMotionDisplay() throws HeadlessException {
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
		label = new JLabel("Circular Motion Calculator");
		label.setFont(new Font("Calibri", Font.BOLD, 40));
		label.setBounds(80, 70, 500, 60);
		panel.add(label);
		
		//Creating buttons for each category
		btn1 = new JButton("v = r * w");
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
					FirstCircularAlgoDisplay firstlindisplay = new FirstCircularAlgoDisplay();
					firstlindisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		panel.add(btn1);
		
		btn2 = new JButton("a = r * w^2");
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
					SecondCircularAlgoDisplay Secondlindisplay = new SecondCircularAlgoDisplay();
					Secondlindisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		
		panel.add(btn2);
		
		btn3 = new JButton("w = w0 + a * t");
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
					ThirdCircularAlgoDisplay thirdlindisplay = new ThirdCircularAlgoDisplay();
					thirdlindisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		
		panel.add(btn3);
		
		btn4 = new JButton("w = 2 * (pi) * f ");
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
					FourthCircularAlgoDisplay fourthdisplay = new FourthCircularAlgoDisplay();
					fourthdisplay.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Can't navigate", "Error !", JOptionPane.OK_OPTION);
				}
			}
		});
		
		panel.add(btn4);
	}

}
