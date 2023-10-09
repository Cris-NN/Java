package ejemplos;

import java.util.Stack;

@SuppressWarnings("serial")
public class PilaSofisticada<T> extends Stack<T> {

	public void agregar(PilaSofisticada<T> b) {
		PilaSofisticada<T> aux = new PilaSofisticada<T>();
		while (!b.isEmpty())
			aux.push(b.pop());

		while (!aux.isEmpty())
			this.push(aux.pop());
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public PilaSofisticada<T> intercalar(PilaSofisticada<T> p) {

		PilaSofisticada<T> aux = new PilaSofisticada<T>();
		PilaSofisticada<T> bux = new PilaSofisticada<T>();
		PilaSofisticada<T> x = new PilaSofisticada<T>();

		while (!this.isEmpty() || !p.isEmpty()) {

			if (!this.isEmpty())
				aux.push(this.pop());

			if (!p.isEmpty())
				bux.push(p.pop());
		}

		while (!aux.isEmpty() || !bux.isEmpty()) {
			if (!aux.isEmpty())
				x.push(aux.pop());
			if (!bux.isEmpty())
				x.push(bux.pop());
		}

		return x;
	}

	public static void main(String[] args) {
		PilaSofisticada<Integer> pares = new PilaSofisticada<Integer>();
		PilaSofisticada<Integer> impares = new PilaSofisticada<Integer>();

		pares.push(2);
		pares.push(4);
		pares.push(6);
		pares.push(8);
		pares.push(10);

		impares.push(5);
		impares.push(7);
		impares.push(11);

		//pares.agregar(impares);
		System.out.println(pares.intercalar(pares));
	

	}

}
