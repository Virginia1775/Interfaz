package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer1 frame = new Ejer1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
                   
	/**
	 * Create the frame.
	 */
	public Ejer1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\virgi\\Pictures\\Saved Pictures\\71494590.jfif"));
		setTitle("ventana con interaccion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(10, 117, 170, 14);
		contentPane.add(lblResultado);
		
		JButton btnBoton1 = new JButton("Boton 1");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText("Has picado el Boton 1 ");
			}
		});
		btnBoton1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBoton1.setBounds(199, 91, 89, 23);
		contentPane.add(btnBoton1);
		
		JButton btnBoton2 = new JButton("Boton 2");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText("Has picado el Botón 2");
			}
		});
		btnBoton2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBoton2.setBounds(199, 146, 89, 23);
		contentPane.add(btnBoton2);
	}
}
