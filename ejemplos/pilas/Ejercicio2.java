package pilas;

import java.util.Stack;

public class Ejercicio2 {

	public boolean esPalindromo(String input) {
		Stack<Character> pila = new Stack<Character>();
		
		char[] vector = input.toCharArray();
		
		for (Character c : vector) {
			pila.push(c);
		}
		
		for (Character c : vector) {
			if(pila.peek() == c)
				pila.pop();
		}
		return pila.isEmpty();
	}
	
	public static void main(String[] args) {
		Ejercicio2 palabra = new Ejercicio2();
		
		System.out.println(palabra.esPalindromo("hola"));
		System.out.println(palabra.esPalindromo("radar"));
		System.out.println(palabra.esPalindromo("radar"));
		System.out.println(palabra.esPalindromo("radar"));
		System.out.println(palabra.esPalindromo("hola"));
		System.out.println(palabra.esPalindromo("hola"));
		System.out.println(palabra.esPalindromo("radar"));
	}
}
