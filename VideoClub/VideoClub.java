package VideoClub;

public abstract class VideoClub implements Entregable, Comparable<VideoClub>{

	private boolean entregado = false;
	
	
	
	public void entregar() {
		this.entregado = true;	
	}

	public void devolver() {
		this.entregado = false;
	}

	public boolean isEntregado() {
		
		return this.entregado;
	}

	public abstract String toString();
	
	
	
	
}
