package poo;

public class Furgoneta extends Coche {
	private int capacidadExtra;
	private int asientosExtra;

	public Furgoneta(String marca, int capacidadExtra, int asientosExtra) {
		super(marca);

		this.capacidadExtra = capacidadExtra;
		this.asientosExtra = asientosExtra;

	}

	public String getDatosFurgoneta() {
		return "La capacidad de la furgoneta es: " + capacidadExtra + "y los asientos son:"
				+ asientosExtra;
	}
}
