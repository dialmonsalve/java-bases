package primerosPasos;
public class CalculosMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raiz = Math.sqrt(250);

		int resultado = (int) Math.round(raiz);
		double base = 3;
		double exponente = 4;

		int resultadoPow = (int) Math.pow(base, exponente);

		String mensaje = String.format("El resultado de %s elevado a %s es = %s", base, exponente,
				resultadoPow);

		System.out.println(mensaje);
		System.out.println(resultado);

	}

}
