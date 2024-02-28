package Class;

public class Etiquetas {
	private double peso, pesoOlla, pesoQueso;
	public static double olla;

	public Etiquetas(double peso, double pesoOlla, double pesoQueso) {
		
		this.peso = peso;
		this.pesoOlla = pesoOlla;
		this.pesoQueso = pesoQueso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPesoOlla() {
		return pesoOlla;
	}

	public void setPesoOlla(double pesoOlla) {
		this.pesoOlla = pesoOlla;
	}

	public double getPesoQueso() {
		return pesoQueso;
	}

	public void setPesoQueso(double pesoQueso) {
		this.pesoQueso = pesoQueso;
	}

	public double cantidadQuesos() {
		return cantidadOllas() / pesoQueso;
	}
	
	public double etiquetasSellar() {
		return cantidadQuesos() * peso;
	}
	public double cantidadOllas() {
		return olla * pesoOlla; 
	}
}
