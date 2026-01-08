package Controlador;

/*
 * @Author Kendal Trejos Cubero
 * @Version 14/5/24
 */

import Modelo.Carta;
import Vista.Scanner.Escritor;

public class MazoCartas {

	public static void main(String[] args) {

		String simbolo = "";
		String valor = "";

		Escritor escritor = new Escritor();

		for (int i = 1; i <= 4; i++) {

			switch (i) {
			case 1:
				simbolo = "Corazones";
				break;

			case 2:
				simbolo = "Diamantes";
				break;

			case 3:
				simbolo = "Flores";
				break;

			case 4:
				simbolo = "Bastos";
				break;

			default:
				escritor.escribir("ERROR");
				break;
			}

			for (int j = 1; j <= 13; j++) {

				switch (j) {
				case 1:
					valor = "As";
					break;

				case 11:
					valor = "J";
					break;

				case 12:
					valor = "Q";
					break;

				case 13:
					valor = "K";
					break;

				default:
					valor = "" + j;
					break;
				}
				Carta carta = new Carta(valor, simbolo);
				escritor.escribir(carta.imprimir());
			}

		}

	}

}
