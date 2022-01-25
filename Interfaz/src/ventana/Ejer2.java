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

public class Ejer2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer2 frame = new Ejer2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
                                int contador=0;
	/**
	 * Create the frame.
	 */
	public Ejer2() {
		setTitle("Ventana con m\u00E1s interacci\u00F3n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\virgi\\Pictures\\Saved Pictures\\71494590.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEtiqueta1 = new JLabel("");
		lblEtiqueta1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEtiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiqueta1.setBounds(10, 45, 193, 14);
		contentPane.add(lblEtiqueta1);
		
		JLabel lblEtiqueta2 = new JLabel("");
		lblEtiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiqueta2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEtiqueta2.setBounds(10, 170, 193, 14);
		contentPane.add(lblEtiqueta2);
		
		JButton btnBotón1 = new JButton("Bot\u00F3n 1");
		btnBotón1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador++;
				lblEtiqueta1.setText("Has picado el botón 1: "+contador+" veces");
			}
		});
		btnBotón1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBotón1.setBounds(375, 41, 89, 23);
		contentPane.add(btnBotón1);
		
		JButton btnBoton2 = new JButton("Bot\u00F3n 2");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador++;
				lblEtiqueta2.setText("Has picado el botón 2: "+contador+" veces");
			}
		});
		btnBoton2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBoton2.setBounds(375, 166, 89, 23);
		contentPane.add(btnBoton2);
	}

}
