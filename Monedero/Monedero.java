package Monedero;

public class Monedero {

	private double dinero;
		
	public Monedero(double dinero) {
		this.dinero = dinero;
	}
	
	public void agregarDinero(double dinero) {
		this.dinero = this.dinero + dinero;
	}
	
	public void sacarDinero(double dinero) {
		if(this.dinero > dinero) 
			this.dinero = this.dinero - dinero;
		else System.out.println("No hay suficiente dinero");   
	}
	
	protected double disponible() {
		return this.dinero;
	}
	
	public double getdisponible() {
		return this.disponible();
	} 
}
