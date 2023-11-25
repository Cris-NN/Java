package escuelitaPNT;

public class Gaseosa extends Producto {
	private Double litros;
	
	public Gaseosa(String nombre, int precio, Double litros) {
		super(nombre, precio);
		setLitros(litros);
	}

	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

	public String toString() {
		return super.toString() +" /// Litros: " + this.getLitros() + " /// Precio: $" + super.getPrecio() + "\n";
	}
}
