package escuelitaPNT;

public class Fruta extends Producto {

	private String unidadVenta;
	
	public Fruta(String nombre, int precio, String unidadVenta) {
		super(nombre, precio);
		setUnidadVenta(unidadVenta);
	}
	public String getUnidadVenta() {
		return unidadVenta;
	}
	public void setUnidadVenta(String unidadVenta) {
		this.unidadVenta = unidadVenta;
	}
	
	public String toString() {
		return super.toString() + " /// Precio: $" + super.getPrecio() +" /// Unidad de venta: " + this.getUnidadVenta() + "\n";
	}
}
