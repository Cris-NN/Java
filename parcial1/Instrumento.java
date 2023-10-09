package parcial;

public abstract class Instrumento implements Identificable {

	private String nombre;
	private double precio;
	
	abstract void afinar();
	
	public Instrumento(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
}