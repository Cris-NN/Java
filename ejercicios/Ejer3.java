package ejercicios_0;
public class Ejer3 {
	
	private int[] array;
	
	public Ejer3(int[] array) {
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}
	
	public boolean estaOrdenado() {
		for(int x=0; x<getArray().length; x++)
			if(x+1 < getArray().length)
				if(getArray()[x] > getArray()[x+1])
					return false;
		return true;
	}
	
	public static void main(String[] args) {
		Ejer3 numeros = new Ejer3(new int[]{1,2,6,7,10,26});
		System.out.println(numeros.estaOrdenado());
	}
}
