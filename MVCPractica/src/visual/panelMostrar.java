package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;

public class panelMostrar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public panelMostrar() {
		setBackground(new Color(200, 185, 192));
		setLayout(null);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevo.setBounds(289, 80, 89, 23);
		add(btnNuevo);
		
		table = new JTable();
		table.setBounds(27, 67, 219, 154);
		add(table);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(289, 132, 89, 23);
		add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(289, 186, 89, 23);
		add(btnModificar);

	}
}
