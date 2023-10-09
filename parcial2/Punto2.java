package parcial2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Punto2 {

	
	public List<Libro> eliminarLibrosRepetidos(List<Libro> libros){
		List<Libro> aux = new ArrayList<Libro>();
		List<Libro> aux2 = new ArrayList<Libro>();
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro librito = it.next();
			if(!aux.contains(librito)) {
				aux.add(librito);
			}
			aux.sort((Comparator<Libro>) aux);
		}
		return aux;	
	}

}
