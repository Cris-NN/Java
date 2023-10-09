package ejercicios_0;

public class Ejer5 {
	
	private int[][] matriz;
	
	public Ejer5(int[][] matriz) {
		this.matriz = matriz;
	}

	public int[][] getMatriz() {
		return matriz;
	}
	
	public int[][] suma(Ejer5 matriz){
		
		int [][] resultado = null;
		
		for(int x=0; x<getMatriz().length; x++) 
			for(int i=0; i<getMatriz()[x].length; i++) 
					resultado = new int[getMatriz().length][getMatriz()[x].length];
		
		for(int x=0; x<getMatriz().length; x++) 
			for(int i=0; i<getMatriz()[x].length; i++) 
				resultado[x][i] = getMatriz()[x][i] + matriz.getMatriz()[x][i];
					
		for(int x=0; x<getMatriz().length; x++) 
			for(int i=0; i<getMatriz()[x].length; i++) 
				System.out.println(resultado[x][i]);
		
		return resultado;
		
	}
	
	public static void main(String[] args) {
		Ejer5 matriz1 = new Ejer5(new int[][]{{1,2,3},{1,2,5}});
		Ejer5 matriz2 = new Ejer5(new int[][]{{1,1,1},{1,1,1}});
		
		System.out.println(matriz1.suma(matriz2));
	
		
	}
}
