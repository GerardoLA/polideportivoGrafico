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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	
	
	
	
	public PanelUsuario(JFrame padre,boolean modal) {
		super(padre,modal);
		setBounds(100,1001,690,319);
		contentPanel = new JPanel();
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel,BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombreApellido = new JLabel("Nombre_Apellido");
		lblNombreApellido.setBounds(43, 67, 111, 22);
		getContentPane().add(lblNombreApellido);
		
		textField = new JTextField();
		textField.setBounds(190, 68, 142, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblid = new JLabel("Id: ");
		lblid.setBounds(43, 29, 46, 14);
		getContentPane().add(lblid);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 26, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI :");
		lblDni.setBounds(43, 115, 46, 14);
		getContentPane().add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 112, 142, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Código : ");
		lblCodigo.setBounds(43, 168, 46, 14);
		getContentPane().add(lblCodigo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(190, 165, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
