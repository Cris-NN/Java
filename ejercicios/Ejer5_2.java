package ejercicios_0;

public class Ejer5_2 {
	private int matriz[][];
	private int matriz2[][];

	
	public Ejer5_2(int [][] matriz, int [][] matriz2) {
		this.matriz = matriz;
		this.matriz2 = matriz2;
	}

	public int[][] getMatriz() {
		return matriz;
	}
	
	public int[][] getMatriz2() {
		return matriz2;
	}
	
	public int[][] suma(){
		
		int resultado [][] = new int[10][10];
		
		
		
		for(int x=0; x< getMatriz().length; x++)
			for(int i=0; i<getMatriz2()[x].length; i++)
				resultado[x][i]= getMatriz()[x][i] + getMatriz2()[x][i];
		
		for(int x=0; x< getMatriz().length; x++)
			for(int i=0; i<getMatriz()[x].length; i++)
				System.out.println(resultado[x][i]);
						
		return resultado;				
	}
	
	public static void main(String[] args) {
		Ejer5_2 m1 = new Ejer5_2(new int[][] {{1,2,3},{4,5,10},{4,5,10}}, new int[][] {{1,1,1},{1,1,1},{1,1,1}});
		
		m1.suma();
		
		
	}
}
