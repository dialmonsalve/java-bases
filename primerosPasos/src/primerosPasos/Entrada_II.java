package primerosPasos;

import javax.swing.JOptionPane;

public class Entrada_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Introduce el nombre por favor");

		String age = JOptionPane.showInputDialog("Introduce la edad por favor");

		System.out.println(
				"Hola " + name + " el próximo año tendrás: " + (Integer.parseInt(age) + 1));
		

	}

}
