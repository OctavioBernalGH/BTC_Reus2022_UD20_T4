<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T04</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  

  
<p align="justify">En este ejercicio se pide crear una aplicación gráfica mediante JFrameForm con una ventana que contenga una etiqueta y un área de texto. La aplicación debe reflejar en el área de texto todos los eventos de ventana que se produzcan por la creación o interacción del usuario.</p>

![UD20-T4](https://user-images.githubusercontent.com/103035621/167312802-60d26d9d-a3a7-4675-b936-57cd60cce7b8.png)

<p align="justify">En la imagen anterior se explican los diferentes eventos mostrados en el campo de texto en área. Para gestionar estos eventos se utilizan las funciones asociadas a la clase WindowListener y WindowEvent.</p>

<details>
  <summary>En este spoiler se muestra el código creado en la Clase T4.java</summary>
<br>

  ```java
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

  ```
 </details>
