package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Principal extends JFrame{
	private JPanel contentPane;
	public JButton btnUsuarios;
	public JButton btnActividades;
	public JButton btnInscripciones;
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		
		btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setBackground(Color.GRAY);
		btnUsuarios.setBounds(126, 107, 146, 23);
		getContentPane().add(btnUsuarios);
		contentPane.add(btnUsuarios);
		
		btnActividades = new JButton("ACTIVIDADES");
		btnActividades.setBounds(126, 181, 146, 23);
		getContentPane().add(btnActividades);
		
		
		
		btnInscripciones = new JButton("INSCRIPCIONES");
		btnInscripciones.setBounds(126, 260, 146, 23);
		getContentPane().add(btnInscripciones);
		
		
	}
		
	}
