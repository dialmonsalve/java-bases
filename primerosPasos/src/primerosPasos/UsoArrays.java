package primerosPasos;


public class UsoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int miMatriz[] = { 8, 7, 4, 7, 5, 9, 5, 4, 8, 6 };
		int miMatriz2[] = new int[5];
		
		miMatriz2[0] = 5;
		miMatriz2[1] = 38;
		miMatriz2[2] = 15;
		miMatriz2[3] = 92;
		miMatriz2[4] = 71;
		
		for (int i = 0; i < miMatriz2.length; i++) {
			System.out.println(miMatriz2[i]);
		}
		System.out.println("===============");
		
		for (int numero : miMatriz) {
			System.out.println(numero);
		}
	}

}
