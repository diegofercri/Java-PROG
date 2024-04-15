package ejer4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Taxi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_km;
	private JTextField textField_total;
	private JCheckBox chckbxNewCheckBox_idaVuelta;
	private JCheckBox chckbxNewCheckBox_maletas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Taxi frame = new Taxi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Taxi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calcula el presupuesto de tu Taxi");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(68, 10, 325, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Km de distancia:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(125, 71, 104, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Total:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_3.setBounds(51, 195, 60, 25);
		contentPane.add(lblNewLabel_1_3);
		
		chckbxNewCheckBox_idaVuelta = new JCheckBox("Ida y Vuelta");
		chckbxNewCheckBox_idaVuelta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_idaVuelta.setBounds(125, 121, 93, 21);
		contentPane.add(chckbxNewCheckBox_idaVuelta);
		
		chckbxNewCheckBox_maletas = new JCheckBox("Maletas (suplemento del 15%)");
		chckbxNewCheckBox_maletas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_maletas.setBounds(125, 144, 195, 21);
		contentPane.add(chckbxNewCheckBox_maletas);
		
		textField_km = new JTextField();
		textField_km.setBounds(235, 71, 96, 19);
		contentPane.add(textField_km);
		textField_km.setColumns(10);
		
		textField_total = new JTextField();
		textField_total.setEditable(false);
		textField_total.setBounds(172, 201, 96, 19);
		contentPane.add(textField_total);
		textField_total.setColumns(10);
		
		JButton btn_calc = new JButton("Calcular");
		btn_calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btn_calc.setBounds(347, 200, 85, 21);
		contentPane.add(btn_calc);
		
		JLabel lblNewLabel_1_1 = new JLabel("0,30 € / KM");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_1_1.setBounds(336, 221, 104, 19);
		contentPane.add(lblNewLabel_1_1);
		
	}
	
	private void calcular() {
		try {
			if (textField_km.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Introduce los kilometros", "Error", JOptionPane.WARNING_MESSAGE);
			} else {
				double km = Double.parseDouble(textField_km.getText());
				double total = km * 0.3;
				if (chckbxNewCheckBox_idaVuelta.isSelected()) {
					total *= 2;
				}
				if (chckbxNewCheckBox_maletas.isSelected()) {
					double maletas = total * 0.15;
					total += maletas;
				}
				textField_total.setText(String.valueOf(total));
			}
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
		    JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido", "Error", JOptionPane.WARNING_MESSAGE);
		}
	}
}
