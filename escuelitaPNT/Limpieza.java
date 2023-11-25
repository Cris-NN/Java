package escuelitaPNT;

public class Limpieza extends Producto{
	private String contenido;
	
	public Limpieza(String nombre, int precio, String contenido) {
		super(nombre, precio);
		setContenido(contenido);
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public String toString() {
		return super.toString() +" /// Contenido: " + this.getContenido() + " /// Precio: $" + super.getPrecio() + "\n";
	}
}
