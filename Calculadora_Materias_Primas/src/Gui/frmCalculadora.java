package Gui;

import java.awt.EventQueue;
import Class.Etiquetas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;

public class frmCalculadora extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtOllas300;
	private JButton btnIngresar300;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCalculadora frame = new frmCalculadora();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Etiquetas etiquetas = new Etiquetas(0.5, 100, 0.3);
	Etiquetas etiquetas250 = new Etiquetas(0.5, 100, 0.250);
	private JLabel lblNewLabel_1;
	private JTextField txtOllas250;
	private JButton btnIngresar250;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtKilosQueso;
	private JTextField txtQuesosSaldran;
	private JTextField txtEtiquetasGramos;
	
	public frmCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("300");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(167, 27, 46, 17);
		contentPane.add(lblNewLabel);
		
		txtOllas300 = new JTextField();
		txtOllas300.addActionListener(this);
		txtOllas300.setBounds(261, 25, 86, 20);
		contentPane.add(txtOllas300);
		txtOllas300.setColumns(10);
		
		btnIngresar300 = new JButton("Ingresar");
		btnIngresar300.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIngresar300.addActionListener(this);
		btnIngresar300.setBounds(380, 24, 135, 23);
		contentPane.add(btnIngresar300);
		
		lblNewLabel_1 = new JLabel("250");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(167, 53, 58, 20);
		contentPane.add(lblNewLabel_1);
		
		txtOllas250 = new JTextField();
		txtOllas250.setColumns(10);
		txtOllas250.setBounds(261, 56, 86, 20);
		contentPane.add(txtOllas250);
		
		btnIngresar250 = new JButton("Ingresar");
		btnIngresar250.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIngresar250.setBounds(380, 58, 135, 23);
		contentPane.add(btnIngresar250);
		
		separator = new JSeparator();
		separator.setBounds(10, 91, 629, 2);
		contentPane.add(separator);
		
		lblNewLabel_2 = new JLabel("Cantidad de kilos de queso");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(85, 142, 240, 20);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Cantidad de quesos que saldran");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(85, 199, 240, 20);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Etiquetas que se tienen que sellar en gramos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(85, 264, 279, 20);
		contentPane.add(lblNewLabel_4);
		
		txtKilosQueso = new JTextField();
		txtKilosQueso.setColumns(10);
		txtKilosQueso.setBounds(390, 142, 135, 20);
		contentPane.add(txtKilosQueso);
		
		txtQuesosSaldran = new JTextField();
		txtQuesosSaldran.setColumns(10);
		txtQuesosSaldran.setBounds(390, 199, 135, 20);
		contentPane.add(txtQuesosSaldran);
		
		txtEtiquetasGramos = new JTextField();
		txtEtiquetasGramos.setColumns(10);
		txtEtiquetasGramos.setBounds(390, 264, 135, 20);
		contentPane.add(txtEtiquetasGramos);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == txtOllas300) {
			actionPerformedTextField(e);
		}
		if (e.getSource() == btnIngresar300) {
			actionPerformedBtnProcesar(e);
		}
	}
	//int kilosQueso = Integer.parseInt(txtKilosQueso.getText());
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		numeroOllas();
		double ollas = etiquetas.cantidadOllas();
		double quesos = etiquetas.cantidadQuesos();
		double sellar = etiquetas.etiquetasSellar();
		
		
		ollas = Double.parseDouble(txtKilosQueso.getText());
		quesos = Double.parseDouble(txtKilosQueso.getText());
		sellar = Double.parseDouble(txtQuesosSaldran.getText());
		
		/*imprimir("Cantidad de kilos de queso: " + etiquetas.cantidadOllas() );
		imprimir("Cantidad de quesos que saldran: " + etiquetas.cantidadQuesos());
		imprimir("Etiquetas que se tienen que sellar en gramos: " + etiquetas.etiquetasSellar());*/
		
	}
	protected void actionPerformedTextField(ActionEvent e) {
		numeroOllas();
	}
	public double numeroOllas() {
		return etiquetas.olla = Double.parseDouble(txtOllas300.getText());
	}
	/*void imprimir(String s) {
		kilosQueso.append(s + "\n");
	}
	void imprimir2(String s) {
		.append(s + "\n");
	}
	void imprimir3(String s) {
		textResultado.append(s + "\n");
	}*/
}
