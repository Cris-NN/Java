package parcial1;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void avanzar2HaciaElNorte() {
		Robot robi = new Robot(1, 1, "N", "A2", 10, 10);
		robi.avanzar(2);
		assertEquals(3, robi.getPosy());
		assertEquals(1, robi.getPosx());
	}

	@org.junit.Test
	public void avanzarHaciaElLimite() {
		Robot robi = new Robot(3, 3, "N", "A9", 10, 10);
		robi.avanzar(9);
		assertEquals(10, robi.getPosy());
		assertEquals(3, robi.getPosx());
	}

	@org.junit.Test
	public void noRotar() {
		Robot robi = new Robot(1, 1, "O", "R0", 10, 10);
		robi.rotar(0);
		assertEquals("O", robi.getSentido());
		assertEquals(1, robi.getPosy());
		assertEquals(1, robi.getPosx());
	}

	@org.junit.Test
	public void rotar1() {
		Robot robi = new Robot(1, 1, "N", "R1", 10, 10);
		robi.rotar(1);
		assertEquals("E", robi.getSentido());
		assertEquals(1, robi.getPosy());
		assertEquals(1, robi.getPosx());
	}

	@org.junit.Test
	public void rotar9() {
		Robot robi = new Robot(1, 1, "N", "R9", 10, 10);
		robi.rotar(9);
		assertEquals("E", robi.getSentido());
		assertEquals(1, robi.getPosy());
		assertEquals(1, robi.getPosx());
	}

	@org.junit.Test
	public void rotar1YAzanzar3() {
		Robot robi = new Robot(1, 1, "N", "R1A3", 10, 10);
		robi.movimientoRobot();
		assertEquals("E", robi.getSentido());
		assertEquals(1, robi.getPosy());
		assertEquals(4, robi.getPosx());
	}

	@org.junit.Test
	public void llegarAlLimiteDeLaCuadricula() {
		Robot robi = new Robot(2, 2, "N", "A9R1A9", 10, 10);
		robi.movimientoRobot();
		assertEquals("E", robi.getSentido());
		assertEquals(10, robi.getPosy());
		assertEquals(10, robi.getPosx());
	}

	@org.junit.Test
	public void probandoComandos() {
		Robot robi = new Robot(5, 5, "N", "A5R3A3", 10, 10);
		robi.movimientoRobot();
		assertEquals(10, robi.getPosy());
		assertEquals(2, robi.getPosx());
	}

	@org.junit.Test
	public void probandoComandos2() {
		Robot robi = new Robot(1, 1, "N", "A1R1A1R1A9", 10, 10);
		robi.movimientoRobot();
		assertEquals(1, robi.getPosy());
		assertEquals(2, robi.getPosx());
	}

	@org.junit.Test
	public void EntradaDefectuosa() {
		Robot robi = new Robot(1, 1, "N", "@12F5A1ghR1FA1s1R1A98zz", 10, 10);
		robi.movimientoRobot();
		assertEquals(1, robi.getPosy());
		assertEquals(2, robi.getPosx());
	}

	@org.junit.Test
	public void iniciarRobotFueraDeLaCuadricula() {
		Robot robi = new Robot(15, 21, "N", "A1R1A1R1A9", 7, 8);
		assertEquals(8, robi.getPosy());
		assertEquals(7, robi.getPosx());
	}

	@org.junit.Test
	public void iniciarPosicionRobotEnNegativo() {
		Robot robi = new Robot(-15, -21, "N", "A1R1A1R1A9", 100, 100);
		assertEquals(1, robi.getPosy());
		assertEquals(1, robi.getPosx());
	}

	@org.junit.Test
	public void crearCuadriculaMayorA100() {
		Cuadricula cuadri = new Cuadricula(121, 130);
		assertEquals(100, cuadri.getColumnas());
		assertEquals(100, cuadri.getFilas());
	}

	@org.junit.Test
	public void crearCuadriculaNegativa() {
		Cuadricula cuadri = new Cuadricula(-80, -50);
		assertEquals(1, cuadri.getColumnas());
		assertEquals(1, cuadri.getFilas());
	}

	@org.junit.Test
	public void leerArchivo() {
		Archivo a1 = new Archivo("C:\\Users\\Cristian\\Desktop\\test\\in.txt",
				"C:\\Users\\Cristian\\Desktop\\test\\out.txt");

	}

	/*@org.junit.Test(expected = Error.class)
	public void leerArchivoError() {
		Archivo a1 = new Archivo("in.txt", "out.txt");
	}*/

}
