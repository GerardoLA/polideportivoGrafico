package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Principal extends JFrame{
	private JPanel contentPane;
	JButton btnUsuarios;
	JButton btnInscripciones;
	JButton btnActividades;
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		
		btnUsuarios = new JButton("GESTOR USUARIOS");
		btnUsuarios.setBackground(Color.GRAY);
		btnUsuarios.setBounds(126, 107, 146, 23);
		getContentPane().add(btnUsuarios);
		contentPane.add(btnUsuarios);
		
//		btnModificar = new JButton("MODIFICAR");
//		btnModificar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				UpdateClienteJDialog dialog = new UpdateClienteJDialog();
//				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//				dialog.setVisible(true);

			
		
		
		
		btnActividades = new JButton("GESTOR ACTIVIDADES");
		btnActividades.setBounds(126, 181, 146, 23);
		getContentPane().add(btnActividades);
		
		
		
		btnInscripciones = new JButton("GESTOR INSCRIPCIONES");
		btnInscripciones.setBounds(126, 260, 146, 23);
		getContentPane().add(btnInscripciones);
		
		
	}

	public JButton getBtnUsuarios() {
		return btnUsuarios;
	}

	

	public JButton getBtnInscripciones() {
		return btnInscripciones;
	}

	

	public JButton getBtnActividades() {
		return btnActividades;
	}

	
		
	}
