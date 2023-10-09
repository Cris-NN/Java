package examen1;

public class Demo {

	public static void main(String[] args) {
		
		Barco barquito = new Barco("001");
		
		CargaSimple carga1 = new CargaSimple("TV 32” LED", "TV 32” LED", 3.0, false);
		CargaSimple carga2 = new CargaSimple("Medicamentos", "Caja de medicamentos", 2.0, true);
		
		Contenedor cont1 = new Contenedor("rojo", "rojo", 100.0);
		
		cont1.agregarCargaSimple(carga1);
		cont1.agregarCargaSimple(carga2);
		
		//barquito.agregarCarga(carga1);
		//barquito.agregarCarga(carga2);
		barquito.agregarCarga(cont1);
		barquito.mostrarCargas();
		
		System.out.println(cont1.calcularPeso());
	}

}
