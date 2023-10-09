package examen1;

public class CargaSimple extends Carga {	
	private Double peso = 0.0;
	private boolean refrigeracion = false;
	
	public CargaSimple(String nombre, String descripcion, Double peso, boolean refrigeracion) {
		super(nombre, descripcion);
		setPeso(peso);
		setRefrigeracion(refrigeracion);
	}
	
	public Double calcularPeso() {
		Double pesoTotal = 0.0;
		if(this.refrigeracion)
			pesoTotal += 2;
		return pesoTotal += this.peso;
	}
	
	private void setPeso(Double peso) {
		this.peso = peso;
	}
	private void setRefrigeracion(boolean refrigeracion) {
		this.refrigeracion = refrigeracion;
	}

	public Double getPeso() {
		return peso;
	}
	
	
	
	
}
