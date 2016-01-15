import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Brian David Sandoval Soto
 *
 */
public class Ventana extends JFrame {
	
	//declaración de objetos
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbN1 = new JLabel("Número 1");
	private JLabel lbN2 = new JLabel("Número 2");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnSumar = new JButton("+");
	private JButton btnRestar = new  JButton("-");
	private JButton btnMult = new JButton("X");
	private JButton btnDiv = new JButton("/");
	
	private Container c=getContentPane();
	
	// se crea objeto de la otra clase
	private Operaciones op = new Operaciones();
	
	/**
	 * Contructor de la clase por seguridad
	 */
	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	

	/**
	 * Se asignan los objetos a la ventana
	 */
	private void cargarControles() {
		// TODO Auto-generated method stub
		c.setLayout(null);
		lbN1.setBounds(10,10,280,30);
		c.add(lbN1);
		
		txtN1.setBounds(10,40, 280, 30);
		c.add(txtN1);
		
		lbN2.setBounds(10,80,280,30);
		c.add(lbN2);
		
		txtN2.setBounds(10,110,280,30);
		c.add(txtN2);
		
		btnSumar.setBounds(20, 150, 50, 40);
		c.add(btnSumar);
		
		btnRestar.setBounds(90, 150, 50, 40);
		c.add(btnRestar);
		
		btnMult.setBounds(160, 150, 50, 40);
		c.add(btnMult);
		
		btnDiv.setBounds(230, 150, 50, 40);
		c.add(btnDiv);
		
		lbResultado.setBounds(70, 200, 280, 30);
		
		c.add(lbResultado);
		
		
		/**
		 * Se declara el evento del botón sumar
		 */
		
		btnSumar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double r=op.sumar(Double.parseDouble(txtN1.getText()),
						Double.parseDouble(txtN2.getText())
						);
								
				lbResultado.setText(String.format("%s + %s = %f",
						txtN1.getText(),
						txtN2.getText(),
						r));
				
			}
		});// fin del btnSumar
		
		/**
		 * Se declara el evento a realizar por el btnRestar
		 */
		btnRestar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double r=op.restar(Double.parseDouble(txtN1.getText()),
						Double.parseDouble(txtN2.getText())
						);
				lbResultado.setText(String.format("%s - %s = %f",
						txtN1.getText(),
						txtN2.getText(),
						r));
				
			}
		}); //fin del btnRestar
		
		/**
		 * Se declara la función y/o evento del btnMult
		 */
		btnMult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double r= op.multiplicar(Double.parseDouble(txtN1.getText()),
						Double.parseDouble(txtN2.getText()));
				lbResultado.setText(String.format("%s * %s = %f",
						txtN1.getText(),
						txtN2.getText(),
						r));
				
			}
		}); //fin del btnMulti
		/**
		 * Se declara el evento del btnDiv
		 */
		btnDiv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r=op.dividir(Double.parseDouble(txtN1.getText()),
						Double.parseDouble(txtN2.getText()));
				
				lbResultado.setText(String.format("%s / %s = %f",
						txtN1.getText(),
						txtN2.getText(),
						r));
				
			}
		});// fin del btnDiv
	}
}
