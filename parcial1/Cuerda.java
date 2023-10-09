package parcial;

public class Cuerda extends Instrumento {

	public Cuerda(String nombre, double precio) {
		super(nombre, precio);
	}

	
	public String queInstrumentoEres() {
		return "Cuerda";
	}

	
	public void afinar() {
		
		System.out.println("Sonido de cuerdas");
	}
	
}
