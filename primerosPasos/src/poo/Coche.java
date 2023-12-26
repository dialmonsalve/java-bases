package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	boolean asientosCuero, climatizador;
	public String marca;

	public Coche(String marca) {
		ruedas = 4;
		largo = 2;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
		this.marca = marca;
	}

	public String getDatosGenerales() {
		return "Vehiculo " + this.marca + ": La plataforma del vehículo tiene " + ruedas
				+ " ruedas. Mide " + largo + " mts con un ancho de " + ancho
				+ " cms y un peso de plataforma de " + pesoPlataforma + " kg";
	}

	public String getRuedas() {
		return "El vechículo tiene " + ruedas + " ruedas";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return "El color del vehículo es: " + color;
	}

	public void setConfigurarAsientos(String asientosCuero) {
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}

	public String getConfigurarAsientos() {
		if (asientosCuero) {
			return "El vehículo tiene asientos de cuero";
		}
		return "El vehículo tiene asientos de serie";
	}

	public void setClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String getClimatizador() {
		if (climatizador == true) {
			return "El vehículo incorpora climatizador";
		}
		return "El vehículo incorpora aire acondicionado";
	}

	public String tellPesoChoche() {
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;

		if (asientosCuero) {
			pesoTotal += 50;
		}
		if (climatizador) {
			pesoTotal += 20;
		}

		return "El peso del vehículo es " + pesoTotal;
	}

	public int precioVehiculo() {
		int precioFinal = 1000;
		if (asientosCuero) {
			precioFinal += 2000;
		}
		if (climatizador) {
			precioFinal += 1500;
		}

		return precioFinal;
	}

}
