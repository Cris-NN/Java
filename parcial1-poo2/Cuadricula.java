package parcial1;

public class Cuadricula {
	private int filas;
	private int columnas;

	public int getFilas() {
		return filas;
	}

	private void setFilas(int filas) {
		if (filas > 100)
			this.filas = 100;
		else if (filas < 1)
			this.filas = 1;
		else
			this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	private void setColumnas(int columnas) {
		if (columnas > 100)
			this.columnas = 100;
		else if (columnas < 1)
			this.columnas = 1;
		else
			this.columnas = columnas;
	}

	public Cuadricula(int n, int m) {
		setFilas(m);
		setColumnas(n);
	}

}