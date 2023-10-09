package parcial1;

public class Robot {
	private int posx;
	private int posy;
	private String sentido;
	private String comando;
	private Cuadricula mapa;
	private Brujula bruji;
	private int cantidadComandos = 125;

	public int getCantidadComandos() {
		return cantidadComandos;
	}

	public void setCantidadComandos() {
		this.cantidadComandos--;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	public String getComando() {
		return comando;
	}

	public int getPosx() {
		return this.posx;
	}

	public void setPosx(int posx) {
		if (posx > mapa.getColumnas())
			this.posx = mapa.getColumnas();
		else if (posx < 1)
			this.posx = 1;
		else
			this.posx = posx;
	}

	public int getPosy() {
		return this.posy;
	}

	public void setPosy(int posy) {
		if (posy >= mapa.getFilas())
			this.posy = mapa.getFilas();
		else if (posy < 1)
			this.posy = 1;
		else
			this.posy = posy;
	}

	public String getSentido() {
		return sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}

	public Robot(int x, int y, String sentido, String comando, int n, int m) {
		mapa = new Cuadricula(n, m);
		setPosx(x);
		setPosy(y);
		setSentido(sentido);
		setComando(comando);

	}

	public void movimientoRobot() {
		String[] array = getComando().split("|");
		for (int x = 0; x < getComando().length(); x++) {
				if (array[x].equals("A") && Character.isDigit(array[x+1].charAt(0)))
					avanzar(Integer.parseInt(array[x + 1]));
				else if (array[x].equals("R") && Character.isDigit(array[x+1].charAt(0)))
					rotar(Integer.parseInt(array[x + 1]));
		}
	}

	public void rotar(int Rn) {
		if (getCantidadComandos() != 0) {
			setCantidadComandos();
			int indice = Integer.parseInt(bruji.valueOf(getSentido()).getSentidoBrujula());
			for (int x = 0; x < Rn; x++) {
				indice++;
				if (indice == 4) {
					indice = 0;
				}
				setSentido(bruji.values()[indice].toString());
			}
		}
	}

	public void avanzar(int An) {
		if (getCantidadComandos() != 0) {
			setCantidadComandos();
			if (getSentido().equals("E"))
				setPosx(getPosx() + An);
			else if (getSentido().equals("O"))
				setPosx(getPosx() - An);
			else if (getSentido().equals("N")) {
				setPosy(getPosy() + An);
			} else if (getSentido().equals("S"))
				setPosy(getPosy() - An);
		}
	}
}