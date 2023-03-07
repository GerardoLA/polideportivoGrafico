package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.AccesoBBDD;
import vista.PanelUsuario;

public class controladorUsuario implements ActionListener,MouseListener{
	
	private AccesoBBDD abd;
	private vista.PanelUsuario panelUsuario;
	
	
	
	public controladorUsuario(AccesoBBDD abd, PanelUsuario panelUsuario) {
		this.panelUsuario=panelUsuario;
		this.abd = abd;
		
		
		
	}
	
	public void inicializar() {
		this.panelUsuario.setTitle("Usuarios");
		panelUsuario.setLocationRelativeTo(null);
		panelUsuario.setVisible(false);
		
		abd.conectar();
	}
	
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
