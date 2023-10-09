package ejercicios_0;

public class Ejer1 {
	
	private int numero;
	
	public Ejer1(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	public boolean verificar() {
		int contador = 0;
		for(int x = 1; x<=getNumero(); x++) {
			
			if( getNumero()%x == 0)
				contador++;
		}
		
		return contador==2;
	}
	
	public static void main(String[] args) {
		Ejer1 numero = new Ejer1(7);
		
		System.out.println(numero.verificar());
	}
	
}

