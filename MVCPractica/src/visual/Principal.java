package visual;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import visual.panelCrear;
import visual.panelMostrar;

import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.CardLayout;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private CardLayout layoutPrincipal;
	private JPanel panelPrincipal;
	
	private panelCrear panelCrear;
	private panelMostrar panelMostrar;
	
	
	private JButton btnCrear;
	private JButton btnMostrar;


	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Principal() {
		getContentPane().setBackground(new Color(200, 185, 192));
		this.setMinimumSize(new Dimension(400,450));
		layoutPrincipal = new CardLayout();
		
		getContentPane().setLayout(layoutPrincipal);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		btnMostrar = new JButton("Mostrar");
		menuBar.add(btnMostrar);
		
		btnCrear = new JButton("Crear");
		menuBar.add(btnCrear);
		
		aspectoVentana();
		
		crearPaneles();
		agregarEventos();
	}
	
	
	private void crearPaneles() {
		panelCrear = new panelCrear();
		panelMostrar = new panelMostrar();
		
		getContentPane().add(panelCrear, "panelCrear");
		getContentPane().add(panelMostrar, "panelMostrar");
	}
	
	
	private void agregarEventos() {
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPrincipal.show(getContentPane(), "panelMostrar");
			}
		});
		
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPrincipal.show(getContentPane(), "panelCrear");
			}
		});
		
	}
	
	
	private void aspectoVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 379);
	}
}
