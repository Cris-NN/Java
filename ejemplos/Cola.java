package ejemplos;

import java.util.ArrayDeque;
import java.util.Queue;

public class Cola {

	public static void main(String[] args) {
		Queue <Integer> colaA = new ArrayDeque<Integer>();
		Queue <Integer> colaB= new ArrayDeque<Integer>();
		Queue <Integer> colaAux = new ArrayDeque<Integer>();
		
		colaA.add(5);
		colaA.add(8);
		colaA.add(4);
		colaA.add(15);
		colaA.add(2);
		colaA.add(1);
		colaA.add(4);
		colaA.add(3);
		colaA.add(20);
		
		while(!colaA.isEmpty()) {
			
			if(colaA.peek() < 5)
				colaB.add(colaA.poll());
			else colaAux.add(colaA.poll());
		}
		
		colaA = colaAux;
		
		System.out.println(colaA);
		System.out.println(colaB);
		
		
		
		
		
	}

}
