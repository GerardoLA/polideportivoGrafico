package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.PanelUsuario;
import vista.Principal;


public class ControladorPrincipal implements ActionListener{
	
	private Principal frmPrincipal;
	
	public ControladorPrincipal(Principal principal) {
		frmPrincipal = principal;
		frmPrincipal.btnUsuarios.addActionListener(this);
	}

	public void inicializar() {
		frmPrincipal.setTitle("Desktop");
		frmPrincipal.setLocationRelativeTo(null);
		frmPrincipal.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == frmPrincipal.btnUsuarios) {
			vista.PanelUsuario panelU = new PanelUsuario();
		}
} 
	}
