package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class panelCrear extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtNacimiento;
	private JTextField txtEstudios;

	/**
	 * Create the panel.
	 */
	public panelCrear() {
		setBackground(new Color(200, 185, 192));
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(44, 46, 106, 14);
		add(lblNombre);
		
		JLabel lblNacimiento = new JLabel("Nacimiento:");
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNacimiento.setBounds(44, 86, 106, 14);
		add(lblNacimiento);
		
		JLabel lblEstudios = new JLabel("Estudios:\r\n");
		lblEstudios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEstudios.setBounds(44, 125, 106, 14);
		add(lblEstudios);
		
		JCheckBox cbHijos = new JCheckBox("Hijos");
		cbHijos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbHijos.setBackground(new Color(200, 185, 192));
		cbHijos.setBounds(138, 164, 97, 23);
		add(cbHijos);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGuardar.setBounds(138, 216, 106, 33);
		add(btnGuardar);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNombre.setBounds(138, 42, 106, 23);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNacimiento.setColumns(10);
		txtNacimiento.setBounds(138, 82, 106, 23);
		add(txtNacimiento);
		
		txtEstudios = new JTextField();
		txtEstudios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEstudios.setColumns(10);
		txtEstudios.setBounds(138, 121, 106, 23);
		add(txtEstudios);

	}
}
