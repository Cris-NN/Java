package examen1;

public class Contenedor extends Carga {
	private Double peso = 0.0;
	
	public Contenedor(String nombre, String descripcion, Double peso) {
		super(nombre, descripcion);
		setPeso(peso);
	}
	
	public void agregarCargaSimple(CargaSimple carga) {
		this.peso += carga.getPeso();
	}
		
	public Double calcularPeso() {
		return this.peso;
	}
	
	private void setPeso(Double peso) {
		this.peso = peso;
	}
	
}
