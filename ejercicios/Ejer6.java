package ejercicios_0;
	
public class Ejer6 {
	
	private Integer[] array;
	
	public Ejer6(Integer[] array) {
		this.array = array;
	}
	
	public Integer[] getArray() {
		return array;
	}
	
	public void mostrar(Integer[] array) {
		for(int x=0; x< array.length; x++)
			System.out.println(array[x]);
	}
	
	public int mayor(Integer[] array) {
		int mayor= array[0];
		for(int i=0; i<array.length; i++) 
			if(mayor < array[i])
				mayor = array[i];
		return mayor;
		
	}

	public Integer[] metodo(Ejer6 array2) {
		
		Integer[] resultado = new Integer[getArray().length + array2.getArray().length];
		
		int mayorA = mayor(getArray());
		int mayorB = mayor(array2.getArray());
		int menorA = mayorA;
		int menorB = mayorB;
		int posicionA = 0;
		int posicionB = 0;
		
		for(int i=0; i<getArray().length + array2.getArray().length; i++) {
			for(int x=0; x<getArray().length; x++) {
				if(getArray()[x] != null)
					if(menorA >= getArray()[x]) {
						posicionA = x;
						menorA = getArray()[x];
					}
			}	
			for(int z=0; z<array2.getArray().length; z++) {
				if(array2.getArray()[z] != null)
					if(menorB >= array2.getArray()[z]) {
						posicionB = z;
						menorB = array2.getArray()[z];
					}					
			}
			if(getArray()[posicionA] != null & array2.getArray()[posicionB] != null) {
				if(getArray()[posicionA] < array2.getArray()[posicionB]) {	
					resultado[i] = getArray()[posicionA];	
					getArray()[posicionA] = null;
				}else {
					resultado[i] = array2.getArray()[posicionB];
					array2.getArray()[posicionB] = null;	
				}
			}
			else {
			if(getArray()[posicionA] != null & array2.getArray()[posicionB] == null) {
				resultado[i] = getArray()[posicionA];	
				getArray()[posicionA] = null;
			}
			if(getArray()[posicionA] == null & array2.getArray()[posicionB] != null) {
				resultado[i] = array2.getArray()[posicionB];
				array2.getArray()[posicionB] = null;
			}
			}
			menorB = mayorB;	
			menorA = mayorA;	
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Ejer6 v1 = new Ejer6(new Integer[] {15,0,6,3,2,8});
		Ejer6 v2 = new Ejer6(new Integer[] {7,3,9,10,20,15});
		v1.mostrar(v1.metodo(v2));	
	}
}
