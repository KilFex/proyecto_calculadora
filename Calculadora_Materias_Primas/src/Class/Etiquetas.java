package Class;

public class Etiquetas {
	private double peso, pesoOlla, pesoQueso;
	public static double numeroOllas;

	public Etiquetas(double pesoEtiqueta, double pesoOlla, double pesoQueso) {
		
		this.peso = pesoEtiqueta;
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

	public double cantidadQuesosResultantes() {
		return cantidadQuesosKilos() / pesoQueso;
	}
	
	public double etiquetasSellarGramos() {
		return cantidadQuesosResultantes() * peso;
	}
	public double cantidadQuesosKilos() {
		return numeroOllas * pesoOlla; 
	}
}
