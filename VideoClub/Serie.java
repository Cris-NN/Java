package VideoClub;

public class Serie extends VideoClub {

	private String titulo, genero, creador;
	private Integer numeroDeTemporadas = 3;
	
	public Serie () {
	}
	
	public Serie (String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie (String titulo, String creador, String genero,int numeroDeTemporadas) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.numeroDeTemporadas = numeroDeTemporadas;
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

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}
	
	public int compareTo(VideoClub otraSerie) {
		Serie unaSerie = (Serie) otraSerie;
		return this.numeroDeTemporadas.compareTo(unaSerie.numeroDeTemporadas);
	}
	

	
	public String toString() {
		return "Serie [ titulo: " + getTitulo() + "numero de temporadas: "+ getNumeroDeTemporadas() + "genero: " + getGenero()+ "creador: " + getCreador() + "]";
	}


	
	
}
