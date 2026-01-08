package Controlador;
/*
 * @version 30/5/24
 * @author Kendal Trejos Cubero
 */

import Modelo.Moneda;
import VistaScanner.Escritor;
import VistaScanner.Lector;

public class EscudoCorona {
	public static void main(String args[]) {
		String eleccion = "";
		String valorMoneda = "";
		boolean sigueJuego = false;
		String continuarJuego = "";

		Escritor escritor = new Escritor();
		Lector lector = new Lector();
		Moneda moneda = new Moneda();

		escritor.escribir("Desea jugar? si / no");
		continuarJuego = lector.leerString();
		continuarJuego = continuarJuego.toUpperCase();

		if (continuarJuego.equals("SI")) {
			sigueJuego = true;
		} else {
			sigueJuego = false;
		}

		while (sigueJuego) {

			escritor.escribir("Eliga entre escudo / corona");
			eleccion = lector.leerString();
			eleccion = eleccion.toUpperCase();

			if (eleccion.equals("ESCUDO")) {
				escritor.escribir("La eleccion de la casa es: CORONA");

			} else {
				if (eleccion.equals("CORONA")) {
					escritor.escribir("La eleccion de la casa es: ESCUDO");

				} else {
					escritor.escribir("ERROR, solo se permite ESCUDO / CORONA");
				}
			}

			moneda.lanzar();

			if (moneda.getCara() == Moneda.ESCUDO) {
				valorMoneda = "ESCUDO";
			} else {
				valorMoneda = "CORONA";
			}

			escritor.escribir("CAYO: " + valorMoneda);

			if ((valorMoneda.equals("ESCUDO")) && (eleccion.equals("ESCUDO"))) {
				escritor.escribir("Usted ha ganado");

			} else {
				if ((valorMoneda.equals("CORONA")) && (eleccion.equals("CORONA"))) {
					escritor.escribir("Usted ha ganado");
				} else {
					escritor.escribir("Ha ganado la casa");
				}
			}
			escritor.escribir("Desea continuar jugando? si/no");
			continuarJuego = lector.leerString();
			continuarJuego = continuarJuego.toUpperCase();

			if (continuarJuego.equals("SI")) {
				sigueJuego = true;
			} else {
				sigueJuego = false;
			}
		}
		escritor.escribir("Gracias por participar");
	}

}