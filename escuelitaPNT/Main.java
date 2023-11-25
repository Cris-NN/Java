package escuelitaPNT;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Producto> productos = cargarLista();
		
		System.out.println(productos.toString().replace("[", "").replace(", ", "").replace("]", ""));
		mostrarMenorMayor(productos);
	}
	
	public static ArrayList<Producto> cargarLista(){
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		productos.add(new Gaseosa("Coca-Cola", 18, 1.5));
		productos.add(new Gaseosa("Coca-Cola Zero", 20, 1.5));
		productos.add(new Limpieza("Shampoo Sedal", 19,"500ml"));
		productos.add(new Fruta("Frutilla", 64, "kilos"));
		
		return productos;
	}
	
	public static void mostrarMenorMayor(ArrayList<Producto> productos){
		
		Producto mayor = productos.get(0);
		Producto menor = productos.get(0);
		for (Producto prod : productos) {
			mayor = prod.compareTo(mayor) > 0 ? prod : mayor;
			menor = prod.compareTo(menor) < 0 ? prod : menor;
		}
		System.out.println("Producto más caro: "+ mayor.getNombre());
		System.out.println("Producto más barato: "+ menor.getNombre());
	}

}