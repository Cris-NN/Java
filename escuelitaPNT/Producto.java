package escuelitaPNT;

import java.util.ArrayList;

public class Producto implements Comparable<Producto> {
	private String nombre;
	private int precio;
	
	public Producto(String nombre, int precio) {
		setNombre(nombre);
		setPrecio(precio);
	}
	
	public int compareTo(Producto otro) {
		if(this.getPrecio() > otro.getPrecio())
			return 1;
		else if (this.getPrecio() < otro.getPrecio())
			return -1;
		else return 0;
	}

	public String toString() {
		return "Nombre: " + getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
