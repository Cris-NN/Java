package parcial;

public class OrquestaCamara {
	
	private int cantidad;
	private int pos = 0;
	private Instrumento instrumentito[];

	
	public OrquestaCamara(int cantidad) {
		if(cantidad>10)
			cantidad = 10;
		this.instrumentito = new Instrumento[cantidad];
		this.cantidad = cantidad;
	}
	
	public void agregarInstrumento(Instrumento instru) {
		if(pos < cantidad ) {
			this.instrumentito[pos] = instru;
			pos ++;
		}
		else { throw new Error ("No hay mas lugar"); }
	}
	
	public void afinarOrquesta() {
		
		for(int i = 0; i<cantidad; i++) {
			instrumentito[i].afinar();
		}
		
		
	}
	
	
}
