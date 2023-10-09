package examen1;
import java.util.ArrayList;
import java.util.List;

public  class Barco {
	private String matricula;
	private List<Carga> barco = new ArrayList<Carga>();
		
	public Barco (String matricula) {
		this.matricula = matricula;
	}
	
	public void mostrarCargas() {
		for(int i = 0 ; i < barco.size(); i++)
			System.out.println(barco.get(i));
	}
	
	public void agregarCarga(Contenedor carga) {
		barco.add(carga);
	}
	
	public void agregarCarga(CargaSimple carga) {
		barco.add(carga);
	}
	
	public void removerCarga(Contenedor carga) {
		barco.remove(carga);
	}
	
	public void removerCarga(CargaSimple carga) {
		barco.remove(carga);
	} 
}
