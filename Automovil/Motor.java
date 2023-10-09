package Automovil;

public class Motor {

	private int numeroSerie;
	private int cantidadCilindros;
	
	public int getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public int getCantidadCilindros() {
		return cantidadCilindros;
	}
	public void setCantidadCilindros(int cantidadCilindros) {
		this.cantidadCilindros = cantidadCilindros;
	}
	
	public Motor(int numeroSerie, int cantidadCilindros) {	
		this.setNumeroSerie(numeroSerie);
		this.setCantidadCilindros(cantidadCilindros);
		}

	public String toString() {
		return this.getCantidadCilindros() + " :: " + this.getNumeroSerie();
	}
}
