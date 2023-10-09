/*Implementar la clase PlayList tal que: 
a) La misma contiene Canciones. Las canciones se distinguen por su titulo, �lbum, interprete y su 
duraci�n en segundos. 
b) No hay una cantidad m�xima de canciones para una PlayList. 
c) Se pueden agregar y remover canciones. 
d) Para remover una canci�n, se la busca por t�tulo y si la b�squeda es exitosa, la Canci�n es 
removida de la Playlist. Si la canci�n no est� en la lista, se lanza la Excepcion 
CancionNoEncontrada. 
e) Se puede consultar la cantidad de canciones que tiene.
f) Se puede calcular la duraci�n total (en segundos).
g) Se puede exportar la lista a un archivo �miLista.out� con el formato: 
Interprete	 T�tulo 	�lbum	 Duraci�n 
El archivo debe estar ordenado por interprete y para un mismo interprete por �lbum.
 * */
package playlist;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Playlist{
	List<Cancion> array = new ArrayList<Cancion>();
	public List<Cancion> devolverLista(){
		return array;
	}
	
	public void cargarLista(String archivo) throws IOException{
		Scanner sc = new Scanner(new File(archivo));
		String[] datos;
		while(sc.hasNextLine()) {
		datos = sc.nextLine().split(" ");
		array.add(new Cancion(datos[0], datos[1], datos[2], Double.parseDouble(datos[3])));	
		}
		sc.close();
	}
	
	public void agregarCancion(String titulo, String album, String interprete, Double duracion){
		array.add(new Cancion(titulo, album, interprete, duracion));
	}
	
	public void removerCancion(String titulo) {
		Iterator<Cancion> it = array.iterator();
		while(it.hasNext()) {
			if(it.next().getTitulo().equalsIgnoreCase(titulo)) {
				it.remove();
				break;
			}
			}
	}
	
	public int consultarCantidadCanciones(){
		return array.size();
	}
	
	public Double consultarDuracionPlaylist() {
		Iterator<Cancion> it = array.iterator();
		Double acumulador = 0.0;
		while(it.hasNext()) {
			acumulador += it.next().getDuracion();
		}
		return acumulador;
	}
	
	private void ordenarLista() {
		Compara array2 = new Compara();
		Collections.sort(array,array2);
	}
	
	public void imprimirLista(String locacion) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(locacion));
		ordenarLista();
		Iterator<Cancion> it = array.iterator();
		while(it.hasNext()) {
			salida.println(it.next().imprimir());
		}
		salida.close();
	}
	
}
