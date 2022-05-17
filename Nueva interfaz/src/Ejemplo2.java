import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Ejemplo2 {

	private JFrame frmContrasea;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2 window = new Ejemplo2();
					window.frmContrasea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContrasea = new JFrame();
		frmContrasea.setFont(null);
		frmContrasea.setTitle("Contrase\u00F1a");
		frmContrasea.setBounds(100, 100, 450, 300);
		frmContrasea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContrasea.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(46, 71, 105, 23);
		frmContrasea.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(174, 72, 86, 20);
		frmContrasea.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 119, 86, 20);
		frmContrasea.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(46, 122, 76, 14);
		frmContrasea.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN ENTRAR");
			}
		});
		btnNewButton.setBounds(73, 196, 89, 23);
		frmContrasea.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN SALIR");
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(241, 196, 89, 23);
		frmContrasea.getContentPane().add(btnNewButton_1);
	}
}
