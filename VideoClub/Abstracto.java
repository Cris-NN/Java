package VideoClub;

public abstract class Abstracto {
	
	private String titulo, genero;
	private boolean entregado = false;
	
	public Abstracto(String titulo) {
		this.titulo = titulo;
	}

	public Abstracto(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
	}
	
	
	
	
}
