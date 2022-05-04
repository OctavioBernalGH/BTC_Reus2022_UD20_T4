package com.dou.ud20.t4;

import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class T4 implements WindowListener{

	private JFrame frame;
	public static JTextArea txtrTextoInicial;
	public static String texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T4 window = new T4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public T4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Declarations
		frame = new JFrame();
		txtrTextoInicial = new JTextArea();
		JLabel lblTittle = new JLabel("Eventos");
		
		//Parametring
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.addWindowListener(this);
		txtrTextoInicial.setText("Texto inicial");
		txtrTextoInicial.setBounds(111, 50, 206, 177);
		lblTittle.setBounds(106, 22, 61, 16);
		
		//Adding to frame
		frame.getContentPane().add(txtrTextoInicial);
		frame.getContentPane().add(lblTittle);
	}


	@Override
	public void windowClosing(WindowEvent e) {
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana cerrandose");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana cerrada");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana activada");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana desactivada");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana abierta");
	}
}
