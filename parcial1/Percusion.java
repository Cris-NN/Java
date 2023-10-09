package parcial;

public class Percusion extends Instrumento {

	public Percusion(String nombre, double precio) {
		super(nombre, precio);
	}

	
	public String queInstrumentoEres() {
		return "percusion";
	}

	
	public void afinar() {
		System.out.println("Sonido de golpes");
		
	}
	
}
