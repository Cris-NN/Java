package ejercicios_0;

public class Ejer4 {
	
	private int[] array;
	
	public Ejer4(int[] array) {
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}
	
	public int sumaElementosPares() {
		int suma=0;
		
		for(int x=0; x<getArray().length; x+=2)
				suma+= getArray()[x];
		return suma;
	}
	
	
	public static void main(String[] args) {
		Ejer4 numeros = new Ejer4(new int[]{1,2,13,4,8,6}); 
		System.out.println(numeros.sumaElementosPares());
	}
}
