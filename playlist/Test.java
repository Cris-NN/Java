package playlist;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		Playlist test = new Playlist();
		
		test.cargarLista("C:\\Users\\Cristian\\Desktop\\texto.txt");
		System.out.println(test.devolverLista());
		
		test.removerCancion("gato");
		test.agregarCancion("perro","loco","sucio", 119.0);
		System.out.println(test.devolverLista());
		
		System.out.println(test.consultarCantidadCanciones());
		System.out.println(test.consultarDuracionPlaylist());
		test.imprimirLista("C:\\Users\\Cristian\\Desktop\\salida.txt");
	}

}
