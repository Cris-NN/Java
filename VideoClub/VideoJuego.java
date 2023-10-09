package VideoClub;

public class VideoJuego extends VideoClub {
	private String titulo, genero, compania;
	private Integer horasEstimadas = 3;
	
	public VideoJuego () {
	}
	
	public VideoJuego (String titulo, String compania) {
		this.titulo = titulo;
		this.compania = compania;
	}
	
	public VideoJuego (String titulo, String compania, String genero,int horasEstimadas) {
		this.titulo = titulo;
		this.compania = compania;
		this.genero = genero;
		this.horasEstimadas = horasEstimadas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getcompania() {
		return compania;
	}

	public void setcompania(String compania) {
		this.compania = compania;
	}

	public int gethorasEstimadas() {
		return horasEstimadas;
	}

	public void sethorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	public int compareTo(VideoClub otroJuego) {
		VideoJuego unJuego = (VideoJuego) otroJuego;
		return this.horasEstimadas.compareTo(unJuego.horasEstimadas);
	}
	
	public String toString() {
		return "VideoJuego [ titulo: " + getTitulo() + "numero de temporadas: "+ gethorasEstimadas() + "genero: " + getGenero()+ "compania: " + getcompania() + "]";
	}
}
