package parcial1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {

	private String entrada;
	private String salida;
	private Robot robi;
	private int x;
	private int y;
	private String s;
	private int n;
	private int m;
	private String comando;

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getEntrada() {
		return this.entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public Archivo(String entrada, String salida) {
		setEntrada(entrada);
		setSalida(salida);
		leerArchivo();
	}

	private void leerArchivo() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(getEntrada()));
			sc.useLocale(Locale.ENGLISH);
			this.x = sc.nextInt();
			this.y = sc.nextInt();
			this.s = sc.next();
			this.n = sc.nextInt();
			this.m = sc.nextInt();
			this.comando = sc.next();
			this.robi = new Robot(this.x, this.y, this.s, this.comando, this.n, this.m);
			robi.movimientoRobot();
			escribirArchivo();

		} catch (FileNotFoundException ex) {
			System.out.println("No se encontro el archivo");
		} catch (Exception ex) {
		} finally {
			sc.close();

		}
	}

	private void escribirArchivo() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(getSalida());
			pw = new PrintWriter(fichero);

			pw.println(robi.getPosx() + " " + robi.getPosy());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Archivo a1 = new Archivo("C:\\Users\\Cristian\\Desktop\\test\\in.txt",
				"C:\\Users\\Cristian\\Desktop\\test\\out.txt");

	}

}