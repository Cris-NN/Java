/*Un conductor maneja de un pueblo origen a un pueblo destino, pasando por varios
pueblos. Una vez en el pueblo destino, el conductor debe regresar a casa por el mismo
camino. Mostrar el camino recorrido tanto de ida como de vuelta.
*/
package pilas;

import java.util.Stack;

public class Ejercicio1 {
	
	private Stack<String> recorrido = new Stack<String>();

	
	public void AgregarParada(String estacion) {
		this.recorrido.push(estacion);
	}
	
	public void MostrarRecorridoRegreso() {
		Stack<String> aux = new Stack<String>();
		while(!recorrido.isEmpty()) {
			System.out.println(aux.push(this.recorrido.pop()));
		}
		while(!aux.isEmpty()) {
			this.recorrido.push(aux.pop());
		}
	}
	public void MostrarRecorridoIda() {
		System.out.println(this.recorrido);
	
	}
	
	public static void main(String[] args) {
		Ejercicio1 conductor = new Ejercicio1();
		conductor.AgregarParada("Moreno");
		conductor.AgregarParada("Paso del rey");
		conductor.AgregarParada("Merlo");
		conductor.AgregarParada("Moron");
		
		//conductor.MostrarRecorridoRegreso();
		conductor.MostrarRecorridoIda();
		conductor.MostrarRecorridoRegreso();
		conductor.MostrarRecorridoIda();
		conductor.MostrarRecorridoIda();
		conductor.MostrarRecorridoIda();
		conductor.MostrarRecorridoRegreso();
		conductor.MostrarRecorridoRegreso();
		conductor.MostrarRecorridoRegreso();
		
	}

}
