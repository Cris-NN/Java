package Automovil;

public class Automovil {

	private String patente;
	private int modelo;
	private String fabricante;
	//composicion
	private Motor motor;
	
	public String getPatente() {
		return this.patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getModelo() {
		return this.modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return this.fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Motor getMotor() {
		return this.motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	public Automovil(String patente, int modelo, String fabricante, int numeroSerie, int cantidadCilindros) {
		
		this.setPatente(patente);
		this.setFabricante(fabricante);
		this.setModelo(modelo);
		this.setMotor(new Motor(numeroSerie, cantidadCilindros));
	}
	
	public String toString() {
		return this.getFabricante() +" :: "+ this.getModelo() + " :: " + this.getPatente() + " :: " + this.getMotor();
	}
	
	
}
