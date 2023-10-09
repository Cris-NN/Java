package pilas;

import java.util.Stack;

public class Ejercicio3 {
	private Stack<Character> pila = new Stack<Character>();
	private int contador = 0;

	public boolean esBalanceado(String cadena) {
		char[] vector = cadena.toCharArray();
		
		for(Character c : vector) {
			this.pila.push(c);
			}
		
		while(!pila.isEmpty()) {
			if(pila.pop() == '(' ) {
				contador++;
			}
				else contador--;
		}
		return (contador == 0);
	}
	public static void main(String[] args) {
		Ejercicio3 sym = new Ejercicio3();
		
		System.out.println(sym.esBalanceado("(((())))"));
		System.out.println(sym.esBalanceado("(((()))"));
		System.out.println(sym.esBalanceado("((((()))))"));
		System.out.println(sym.esBalanceado("((())))"));
	}

}
