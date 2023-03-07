package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.AccesoBBDD;
import vista.PanelUsuario;
import vista.Principal;



public class ControladorPrincipal implements ActionListener{
	
	private Principal frmPrincipal;
	
	public ControladorPrincipal(Principal principal) {
		frmPrincipal = principal;
		frmPrincipal.getBtnUsuarios().addActionListener(this);
		frmPrincipal.getBtnInscripciones().addActionListener(this);
		frmPrincipal.getBtnActividades().addActionListener(this);
	}

	public void inicializar() {
		frmPrincipal.setTitle("Desktop");
		frmPrincipal.setLocationRelativeTo(null);
		frmPrincipal.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == frmPrincipal.getBtnUsuarios()) {
			AccesoBBDD ab = new AccesoBBDD();
			vista.PanelUsuario panelU = new PanelUsuario(frmPrincipal, 	false);
			controladorUsuario cu = new controladorUsuario(ab,panelU);
			cu.inicializar();
			panelU.setVisible(true);
			
		}
}
	
	
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == frmPrincipal.btnGestionarProductos) {
//			ProductoModelo productoM = new ProductoModelo();
//			vista.ProductoFormulario productoF = new ProductoFormulario(frmPrincipal, true);
//			
//			ControladorProducto productoC = new ControladorProducto(productoM, productoF);
//			productoC.inicializar();
//			productoF.setVisible(true);
//		}
//	}
	}
