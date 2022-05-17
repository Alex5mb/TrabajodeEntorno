import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;

public class Ejercicio3 {

	private JFrame frmRegistroDeAlumnos;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 window = new Ejercicio3();
					window.frmRegistroDeAlumnos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeAlumnos = new JFrame();
		frmRegistroDeAlumnos.setTitle("Registro de Alumnos");
		frmRegistroDeAlumnos.setBounds(100, 100, 598, 406);
		frmRegistroDeAlumnos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeAlumnos.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new TitledBorder(null, "Datos personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 191, 255)));
		layeredPane.setBounds(26, 11, 546, 137);
		frmRegistroDeAlumnos.getContentPane().add(layeredPane);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(10, 26, 46, 14);
		layeredPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(69, 23, 110, 20);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(189, 26, 46, 14);
		layeredPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(240, 23, 110, 20);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBounds(360, 26, 46, 14);
		layeredPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(416, 23, 120, 20);
		layeredPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion");
		lblNewLabel_3.setBounds(10, 51, 46, 14);
		layeredPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(69, 48, 281, 20);
		layeredPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Distrito");
		lblNewLabel_4.setBounds(360, 51, 46, 14);
		layeredPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(10, 76, 46, 14);
		layeredPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(69, 73, 193, 20);
		layeredPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Celular");
		lblNewLabel_6.setBounds(304, 79, 46, 14);
		layeredPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(360, 76, 110, 20);
		layeredPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Carrera");
		lblNewLabel_7.setBounds(10, 101, 46, 14);
		layeredPane.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Trujillo", "Comercial", "Urbano"}));
		comboBox.setBounds(416, 47, 120, 22);
		layeredPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Computacion e informatica", "Ciencias sociales", "Quimica", "Fisica"}));
		comboBox_1.setBounds(69, 97, 233, 22);
		layeredPane.add(comboBox_1);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new TitledBorder(null, "Comentario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		layeredPane_1.setBounds(26, 179, 546, 117);
		frmRegistroDeAlumnos.getContentPane().add(layeredPane_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 26, 526, 80);
		layeredPane_1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN ACEPTAR");
				System.exit(0);
			}
		});
		Aceptar.setBounds(130, 321, 89, 23);
		frmRegistroDeAlumnos.getContentPane().add(Aceptar);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN SALIR");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(365, 321, 89, 23);
		frmRegistroDeAlumnos.getContentPane().add(btnNewButton);
	}
}
