package ejercicios_0;

public class Ejer8 {
	private int matriz[][];

	public Ejer8(int [][] matriz) {
		this.matriz = matriz;
	}
	
	public int[][] getMatriz() {
		return matriz;
	}
	
	public boolean metodo() {
		int media=0;
		
		for(int x=0; x< getMatriz().length; x++)
			media+= getMatriz()[x][x];
			
		media /= getMatriz().length;
		
		for(int x=0; x< getMatriz().length; x++)
			for(int i=0; i<getMatriz()[x].length; i++)
				if(x!=i)
					if(getMatriz()[x][i]<media)
						return false;
		return true;
	}
	
	public static void main(String[] args) {
		Ejer8 matriz = new Ejer8(new int[][] {{1,2},{10,5}});
		
		System.out.println(matriz.metodo());
	}
}
