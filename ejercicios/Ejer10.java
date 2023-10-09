package ejercicios_0;

public class Ejer10 {
	
	private String palabras;
	
	public Ejer10(String palabras) {
		this.palabras = palabras;
	}

	public String getPalabras() {
		return palabras;
	}
	
	public String consonantes() {
		String nuevo = "";
		
		for(int x=0; x<getPalabras().length(); x++)
			if(getPalabras().charAt(x) != 'a' & getPalabras().charAt(x) != 'e' & getPalabras().charAt(x) != 'i' & getPalabras().charAt(x) != 'o' & getPalabras().charAt(x) != 'u')
				nuevo+= getPalabras().charAt(x);
		return nuevo;
	}
	
	public static void main(String[] args) {
		Ejer10 palabras = new Ejer10("hola como estas");
		
		System.out.println(palabras.consonantes());
	}
}
