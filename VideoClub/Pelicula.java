package VideoClub;

public class Pelicula extends VideoClub{
	
	private String titulo, director, genero = "no definido";
	private Integer anio;
	public Pelicula() {
	
	}
	
	public Pelicula (String titulo, String director) {
		
		this.titulo = titulo;
		this.director = director;
	}

	public Pelicula(String titulo, String director, String genero, int anio) {
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public int compareTo(VideoClub otraPelicula) {
		Pelicula unaPelicula = (Pelicula) otraPelicula;
		return this.anio.compareTo(unaPelicula.anio);
	}
	
	public String toString() {
		
		return "Pelicula [ titulo: " + getTitulo() + "año: "+ getAnio() + "genero: " + getGenero()+ "director: " + getDirector() + "]";
	}	
}
