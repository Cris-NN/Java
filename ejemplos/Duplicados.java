package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Duplicados {

	public List<Integer> EliminarDuplicados(List<Integer> entrada){
		List<Integer> sinDuplicados = new ArrayList<Integer>();
		
		for (Integer numero : entrada) {
			if(!sinDuplicados.contains(numero))
				sinDuplicados.add(numero);
		}
		return sinDuplicados;
	}
	public static void main(String[] args) {
		Duplicados sd = new Duplicados();
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(2);
		numeros.add(4);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(1);

		System.out.println(sd.EliminarDuplicados(numeros));
	}

}
