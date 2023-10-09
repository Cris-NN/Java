package ejemplos;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class Mapa {
	
	
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> productos = new HashMap<String, Integer>();
					 //clave .......valor
		productos.put("galletitas", 100);
		productos.put("gaseosa", 50);
		productos.put("cereales", 75);
		productos.put("papel", 75);
		productos.put("misceleano", 75);
		
		System.out.println(productos.get("galletitas")); //me retorna el valor que tiene la clave
		System.out.println(productos.containsKey("gaseosa")); // pregunta si existe una clave
		System.out.println(productos.containsValue(100)); // pregunta si existe el valor
		
		productos.remove("gaseosa");
		productos.remove("cereales", 75);
		System.out.println(productos.get("gaseosas"));
		System.out.println(productos.get("cereales"));
		
		Set<String> claves = productos.keySet(); // obtener todas las claves
		System.out.println(claves);
		
		Collection<Integer> valores = productos.values(); // obtener todos los valores
		System.out.println(valores);
		
		for(Map.Entry<String, Integer> e : productos.entrySet()) { //recorrer el MAP
			System.out.println("A la clave:  "+ e.getKey()+"  le corresponde el valor:  " +e.getValue());
			
		}
	}

}
