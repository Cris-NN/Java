package parcial;

public class Viento extends Instrumento {

	
	public Viento(String nombre, double precio) {
		super(nombre, precio);
	}
	
	public boolean esDeMetal() {
		
		return true;
	}
	
	public String queInstrumentoEres() {
		return "Viento";
		
	}

	public void afinar() {
		System.out.println("Sonido de viento");

	}
}
