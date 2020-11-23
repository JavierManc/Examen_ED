package examenED;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer1 {

	private JFrame frame;
	private JTextField a;
	private JTextField b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer1 window = new Ejer1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejer1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factorial");
		lblNewLabel.setBounds(180, 41, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(283, 107, 63, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("N\u00FAmero");
		lblNewLabel_2.setBounds(79, 107, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		a = new JTextField();
		a.setBounds(59, 146, 86, 20);
		frame.getContentPane().add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(270, 146, 86, 20);
		frame.getContentPane().add(b);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=a.getText();
				int a=Integer.parseInt(num1);
				int x = 1;
				int contador;
				for (contador=2;contador<=a;contador++) {
					x=x*contador;
				}
				String num2=String.valueOf(x);
				b.setText(num2);
				
			}
		});
		btnNewButton.setBounds(163, 202, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
