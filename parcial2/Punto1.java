package parcial2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Punto1 {

	public void reemplazar(String archivoOrigen, String archivoDestino, 
							String palabraAReemplazar, String nuevaPalabra) throws IOException {
		List<String> array = new ArrayList<String>();
		Scanner sc = new Scanner(new File(archivoOrigen));
		String datos;
		
		while(sc.hasNext()) {
			datos = sc.next();
			datos.toLowerCase();
			array.add(datos);
			}
			sc.close();
	
			for(int x=0; x< array.size();x++) {
				if(array.get(x).equalsIgnoreCase(palabraAReemplazar)) {
					array.set(x, nuevaPalabra);
				}				
				if(array.get(x).equalsIgnoreCase(palabraAReemplazar+",")) {
					array.set(x, nuevaPalabra+",");
				}
				if(array.get(x).equalsIgnoreCase(palabraAReemplazar+"(")) {
					array.set(x, nuevaPalabra+"(");
				}
				if(array.get(x).equalsIgnoreCase(")"+palabraAReemplazar)) {
					array.set(x, ")"+nuevaPalabra);
				}
				if(array.get(x).equalsIgnoreCase("."+palabraAReemplazar)) {
					array.set(x, "."+nuevaPalabra);
				}
				if(array.get(x).equalsIgnoreCase(","+palabraAReemplazar)) {
					array.set(x, ","+nuevaPalabra);
				}
				if(array.get(x).equalsIgnoreCase(palabraAReemplazar+".")) {
					array.set(x, nuevaPalabra+".");
				}
			}
			
		PrintWriter salida = new PrintWriter(new FileWriter(archivoDestino));
		Iterator<String> it = array.iterator();
		while(it.hasNext()) {
			salida.print(it.next()+" ");
		}	
		salida.close();
		}
}
