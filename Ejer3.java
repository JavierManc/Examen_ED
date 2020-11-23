package examenED;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer3 {

	private JFrame frame;
	private JTextField a;
	private JTextField b;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer3 window = new Ejer3();
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
	public Ejer3() {
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
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero ");
		lblNewLabel.setBounds(42, 85, 77, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("N\u00FAmero 2");
		lblNmero.setBounds(163, 85, 77, 14);
		frame.getContentPane().add(lblNmero);
		
		JLabel lblNewLabel_1_1 = new JLabel("Resultado");
		lblNewLabel_1_1.setBounds(302, 85, 65, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		a = new JTextField();
		a.setBounds(42, 134, 46, 20);
		frame.getContentPane().add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(163, 134, 46, 20);
		frame.getContentPane().add(b);
		
		resultado = new JTextField();
		resultado.setColumns(10);
		resultado.setBounds(254, 134, 159, 20);
		frame.getContentPane().add(resultado);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00DAMEROS AMIGOS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(138, 11, 210, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=a.getText();
				String num2=b.getText();
				
				int x=Integer.valueOf(num1);
				int z=Integer.valueOf(num2);
				
				int tot=0;
				for (int contador=1;contador<x;contador++) {
					if(x%contador==0) {
						tot=tot+contador;
						}
				}
				int tot2=0;
				for (int contador=1;contador<x;contador++) {
					if(z%contador==0) {
						tot2=tot2+contador;
							
					}
				}
				if (tot==z && tot2==x) {
					resultado.setText("Son números amigos");
				}else {
					resultado.setText("No son números amigos");
				}
				
			}
		});
		btnNewButton.setBounds(160, 196, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
