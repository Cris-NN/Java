package ejemplos;

import java.util.Stack;

public class Teletipo {
	private Stack<Character> pila = new Stack<Character>();

	public String teletipear(String cadena) {
		/* QXERT */
		
		char[] arrayChar = cadena.toCharArray();

		for (Character c : arrayChar) {
			if (c != '/' && c != '&' && c != ' ')
				pila.push(c);
			else if (c == '/') {
				if (!pila.isEmpty())
					pila.pop();
			} else if (c == '&')
				vaciarPila();
			
		}

		return pilaDadaVueltaComoString(pila);

	}

	private String pilaDadaVueltaComoString(Stack<Character> p) {
		Stack<Character> alip = new Stack<Character>();
		String dadavuelta = "";
		while (!p.isEmpty())
			alip.push(p.pop());

		while (!alip.isEmpty()) {
			dadavuelta += alip.pop().toString();
		}

		return dadavuelta;

	}

	private void vaciarPila() {
		while (!pila.isEmpty())
			pila.pop();
	}

	public static void main(String[] args) {

		Teletipo tele = new Teletipo();
		System.out.println(tele.teletipear("ABCD/F/8&Q/   /XYZ//ERT"));
		System.out.println(tele.teletipear("///////ER  T"));

	}

}
