package vista;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PanelUsuario extends JDialog {
	private final JPanel contentPanel ;
	private JTextField nombreText;
	private JTextField idText;
	private JTextField dniText;
	private JTextField codigoText;
	
	
	
	
	
	
	public PanelUsuario(JFrame padre,boolean modal) {
		super(padre,modal);
		setBounds(100,1001,690,319);
		getContentPane().setLayout(null);
		contentPanel = new JPanel();
		contentPanel.setBounds(0, 0, 0, 0);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNombreApellido = new JLabel("Nombre_Apellido");
		lblNombreApellido.setBounds(43, 67, 111, 22);
		getContentPane().add(lblNombreApellido);
		
		nombreText = new JTextField();
		nombreText.setBounds(190, 68, 142, 20);
		getContentPane().add(nombreText);
		nombreText.setColumns(10);
		
		JLabel lblid = new JLabel("Id: ");
		lblid.setBounds(43, 29, 46, 14);
		getContentPane().add(lblid);
		
		idText = new JTextField();
		idText.setBounds(190, 26, 142, 20);
		getContentPane().add(idText);
		idText.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI :");
		lblDni.setBounds(43, 115, 46, 14);
		getContentPane().add(lblDni);
		
		dniText = new JTextField();
		dniText.setBounds(190, 112, 142, 20);
		getContentPane().add(dniText);
		dniText.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Código : ");
		lblCodigo.setBounds(43, 168, 46, 14);
		getContentPane().add(lblCodigo);
		
		codigoText = new JTextField();
		codigoText.setBounds(190, 165, 142, 20);
		getContentPane().add(codigoText);
		codigoText.setColumns(10);
	}
}
