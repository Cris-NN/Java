package parcial1;

public enum Brujula {
	N("0"), E("1"), S("2"), O("3");

	private String sentido;

	Brujula(String string) {
		this.sentido = string;
	}

	public String getSentidoBrujula() {
		return this.sentido;
	}
}
