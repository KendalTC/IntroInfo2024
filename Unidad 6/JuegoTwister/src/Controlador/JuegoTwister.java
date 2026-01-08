package Controlador;

import Modelo.Ruleta;
import Vista.Scanner.Escritor;
import Vista.Scanner.Lector;

public class JuegoTwister {
	public static void main(String[] args) {
		String continuar = "";
		boolean continuaJuego = false;

		Escritor escritor = new Escritor();
		Lector lector = new Lector();
		Ruleta ruleta = new Ruleta();

		escritor.escribir("Desea girar la ruleta?");
		continuar = lector.leerString();
		continuar = continuar.toUpperCase();

		if (continuar.equals("SI")) {
			continuaJuego = true;

		} else {
			continuaJuego = false;

		}

		do {
			ruleta.girar();

			escritor.escribir(ruleta.getExtremidad()+ " en: "+ ruleta.getColor());

			escritor.escribir("Desea girar la ruleta de nuevo?");
			continuar = lector.leerString();
			continuar = continuar.toUpperCase();

			if (continuar.equals("SI")) {
				continuaJuego = true;

			} else {
				continuaJuego = false;

			}

		} while (continuaJuego);

	}

}
