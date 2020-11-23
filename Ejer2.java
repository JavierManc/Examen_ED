package examenED;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer2 window = new Ejer2();
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
	public Ejer2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 344, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Elige un sistema operativo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(31, 20, 189, 23);
		frame.getContentPane().add(lblNewLabel);

		JRadioButton windows = new JRadioButton("Windows");
		windows.setBounds(31, 50, 109, 23);
		frame.getContentPane().add(windows);

		JRadioButton linux = new JRadioButton("Linux");
		linux.setBounds(31, 82, 109, 23);
		frame.getContentPane().add(linux);

		JRadioButton mac = new JRadioButton("Mac");
		mac.setBounds(31, 120, 109, 23);
		frame.getContentPane().add(mac);

		JLabel lblNewLabel_1 = new JLabel("Elige una especialidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(31, 161, 156, 23);
		frame.getContentPane().add(lblNewLabel_1);

		JCheckBox programacion = new JCheckBox("Programaci\u00F3n");
		programacion.setBounds(31, 199, 119, 23);
		frame.getContentPane().add(programacion);

		JCheckBox diseño = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		diseño.setBounds(31, 233, 119, 23);
		frame.getContentPane().add(diseño);

		JCheckBox administracion = new JCheckBox("Administraci\u00F3n");
		administracion.setBounds(31, 265, 189, 23);
		frame.getContentPane().add(administracion);

		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en ordenador");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(31, 309, 200, 23);
		frame.getContentPane().add(lblNewLabel_2);

		JSlider slider = new JSlider();
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(1);
		slider.setValue(0);
		slider.setMaximum(10);
		slider.setBounds(31, 354, 200, 39);
		frame.getContentPane().add(slider);

		JLabel horas = new JLabel("");
		horas.setBounds(31, 354, 46, 14);
		frame.getContentPane().add(horas);

		JButton btnNewButton = new JButton("Generar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s = slider.getValue();
				String slider = s + "";
				String sistema = null;
				String especialidad = null;
				if (windows.isSelected()) {
					sistema = "Windows";
				}
				if (linux.isSelected()) {
					sistema = "Linux";
				}
				if (mac.isSelected()) {
					sistema = "Mac";
				}
				if (programacion.isSelected()) {
					especialidad = "Programación";
				}
				if (diseño.isSelected()) {
					if (especialidad=="Programación") {
					especialidad = especialidad+ " Diseño gráfico";
				}else {
					especialidad="Diseño gráfico";
				}
				}
				
				
				if (administracion.isSelected()) {
					especialidad = especialidad+" Administración";
				}

				JOptionPane.showMessageDialog(null,"Tu sistema operativo favorito es  " + sistema + " , tus especialidades son "+ especialidad + ", y el número de horas dedicadas al ordenador son  " + slider + ".","Muestra de datos", JOptionPane.INFORMATION_MESSAGE);

			}
		});
		btnNewButton.setBounds(89, 404, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel x = new JLabel("");
		x.setBounds(31, 364, 46, 14);
		frame.getContentPane().add(x);
	}
}
