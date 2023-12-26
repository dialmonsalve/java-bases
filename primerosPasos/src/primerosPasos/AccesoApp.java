package primerosPasos;
import javax.swing.*;

public class AccesoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "diego";
		String pass = "";
		
		while (!password.equalsIgnoreCase(pass)) {
			System.out.println("No son iguales");
			pass = JOptionPane.showInputDialog("Introduce la contraseña");
		}

	}

}
