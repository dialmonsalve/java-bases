package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador {

	public static void main(String[] args) {

		GetTime oyente = new GetTime();

		Timer miTemporizador = new Timer(1000, oyente);

		miTemporizador.start();

		JOptionPane.showMessageDialog(null, "Aceptar para detener");

		System.exit(0);

	}

}

class GetTime implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		Date ahora = new Date();
		System.out.println("Se ejecuta cada 5 segundos " + ahora);		
		Toolkit.getDefaultToolkit().beep();
	}

}