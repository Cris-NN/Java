package parcial2;

public class Punto3 {
	public Double suma(String [] array) {
		Double sumita = 0.0;
		
			for(int x =0; x<array.length; x++) {
				try {
				sumita+= Double.parseDouble(array[x]);
			}catch(NumberFormatException e) {	
				System.err.println("No se pudo convertir este elemento ("+ array[x] +") a un numero");
				
			}catch(Exception e){
				System.err.println("A ocurrido un error");
			}
			finally {
				System.err.println("Finally se ejecuto");
			}
			}
		return sumita;
	}
}


