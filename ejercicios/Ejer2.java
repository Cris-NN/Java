package ejercicios_0;

public class Ejer2 {
	private int numero;
	
	public Ejer2(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	public int sumaMultiplos() {
		int acumulador=0;
		for(int x=0; x<getNumero(); x++)
			if(x%3==0 || x%5==00)
				acumulador+= x;		
		return acumulador;
	}
	
	public static void main(String[] args) {
		Ejer2 numero = new Ejer2(16);
		
		System.out.println(numero.sumaMultiplos());
	}
}
