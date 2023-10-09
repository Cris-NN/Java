package Monedero;

public class MonederoTest {

	public static void main(String[] args) {
		
		Monedero billetera = new Monedero (15000);
		
		billetera.sacarDinero(1500);
		billetera.agregarDinero(8000);
		
		System.out.println(billetera.getdisponible());
	}

}
