package Gui;

import java.awt.EventQueue;
import Class.Etiquetas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.sound.midi.Soundbank;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JRadioButton;

public class frmCalculadora extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOllas;
	private JButton btnIngresar;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtKilosQueso;
	private JTextField txtQuesosSaldran;
	private JTextField txtEtiquetasGramos;
	private JLabel lblNewLabel_5;
	private JRadioButton rdioQueso300;
	private JRadioButton rdioQueso250;
	DecimalFormat format = new DecimalFormat("###");

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
	Etiquetas etiquetas300 = new Etiquetas(0.5, 100, 0.3);
	Etiquetas etiquetas250 = new Etiquetas(0.5, 100, 0.25);
	
	
	public frmCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtOllas = new JTextField();
		txtOllas.addActionListener(this);
		txtOllas.setBounds(259, 39, 86, 20);
		contentPane.add(txtOllas);
		txtOllas.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(390, 38, 135, 23);
		contentPane.add(btnIngresar);
		
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
		
		lblNewLabel_5 = new JLabel("Cantidad de Ollas");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(253, 0, 135, 14);
		contentPane.add(lblNewLabel_5);
		
		rdioQueso300 = new JRadioButton("300gr");
		rdioQueso300.addActionListener(this);
		rdioQueso300.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdioQueso300.setBounds(150, 24, 66, 23);
		contentPane.add(rdioQueso300);
		
		rdioQueso250 = new JRadioButton("250gr");
		rdioQueso250.addActionListener(this);
		rdioQueso250.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdioQueso250.setBounds(150, 55, 78, 23);
		contentPane.add(rdioQueso250);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rdioQueso250) {
			actionPerformedRdioQueso250(e);
		}
		if (e.getSource() == rdioQueso300) {
			actionPerformedrdioQueso300(e);
		}
		if (e.getSource() == btnIngresar) {
			actionPerformedbtnIngresar(e);
		}
	}
	

	protected void actionPerformedbtnIngresar(ActionEvent e) {
		String cantidaOllas = txtOllas.getText();
		
		if(!cantidaOllas.isEmpty()) {
		
		if(rdioQueso300.isSelected()) {
			
			numeroOllas300();
			
			double kilosQueso = etiquetas300.cantidadQuesosKilos();
			double cantidadQuesosResultantes = etiquetas300.cantidadQuesosResultantes();
			double etiquetasSellarGramos = etiquetas300.etiquetasSellarGramos();
			
			txtKilosQueso.setText(String.valueOf(kilosQueso));
			txtQuesosSaldran.setText(String.valueOf(format.format(cantidadQuesosResultantes)));
			txtEtiquetasGramos.setText(String.valueOf(format.format(etiquetasSellarGramos)));
			
			
		}
		if(rdioQueso250.isSelected())  {
			
			numeroOllas250();
			
			double kilosQueso = etiquetas250.cantidadQuesosKilos();
			double cantidadQuesosResultantes = etiquetas250.cantidadQuesosResultantes();
			double etiquetasSellarGramos = etiquetas250.etiquetasSellarGramos();
			
			txtKilosQueso.setText(String.valueOf(kilosQueso));
			txtQuesosSaldran.setText(String.valueOf(format.format(cantidadQuesosResultantes)));
			txtEtiquetasGramos.setText(String.valueOf(format.format(etiquetasSellarGramos)));	
		}
		}
		else {
			
			JOptionPane.showMessageDialog(this,"Esta Vacio, Ingrese nuevamente");
		}
	}
	protected void actionPerformedrdioQueso300(ActionEvent e) {
		
	}
	protected void actionPerformedRdioQueso250(ActionEvent e) {
		
	}
	public double numeroOllas300() {
		return etiquetas300.numeroOllas = Double.parseDouble(txtOllas.getText());
	}
	public double numeroOllas250() {
		return etiquetas250.numeroOllas = Double.parseDouble(txtOllas.getText());
	}
}
