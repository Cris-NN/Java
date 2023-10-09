/*Implementar la clase PlayList tal que: 
a) La misma contiene Canciones. Las canciones se distinguen por su titulo, álbum, interprete y su 
duración en segundos. 
b) No hay una cantidad máxima de canciones para una PlayList. 
c) Se pueden agregar y remover canciones. 
d) Para remover una canción, se la busca por título y si la búsqueda es exitosa, la Canción es 
removida de la Playlist. Si la canción no está en la lista, se lanza la Excepcion 
CancionNoEncontrada. 
e) Se puede consultar la cantidad de canciones que tiene.
f) Se puede calcular la duración total (en segundos).
g) Se puede exportar la lista a un archivo “miLista.out” con el formato: 
Interprete Título Álbum Duración 
El archivo debe estar ordenado por interprete y para un mismo interprete por álbum.
 * */

package playlist;

public class Cancion{
	
	private String titulo;
	private String album;
	private String interprete;
	private Double duracion;
	
	public Cancion(String titulo, String album, String interprete, Double duracion) {
		setAlbum(album);
		setDuracion(duracion);
		setInterprete(interprete);
		setTitulo(titulo);
	}
	
	public String imprimir() {
		return getInterprete()+"  "+getTitulo()+"  "+getAlbum()+"  "+getDuracion();
	}
	
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", album=" + album + ", interprete=" + interprete + ", duracion="
				+ duracion + "]" +"\n";
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((album == null) ? 0 : album.hashCode());
		result = prime * result + ((duracion == null) ? 0 : duracion.hashCode());
		result = prime * result + ((interprete == null) ? 0 : interprete.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		if (album == null) {
			if (other.album != null)
				return false;
		} else if (!album.equals(other.album))
			return false;
		if (duracion == null) {
			if (other.duracion != null)
				return false;
		} else if (!duracion.equals(other.duracion))
			return false;
		if (interprete == null) {
			if (other.interprete != null)
				return false;
		} else if (!interprete.equals(other.interprete))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}


	
	
	
	
	
}
