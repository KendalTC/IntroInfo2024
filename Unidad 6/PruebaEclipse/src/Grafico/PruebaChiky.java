package Grafico;

import java.util.Scanner;

public class PruebaChiky {

	public static void main(String[] args) {
		String eleccion = "";
		boolean comer = false;
		int contador = 0;

		Scanner leer = new Scanner(System.in);
		Chiky chiky = new Chiky("Chocolate", "Pozuelo", 6);
		System.out.println("El sabor es: " + chiky.getSabor() + " y la marca es: " + chiky.getMarca() + " y tiene: "+ chiky.getContenido() + " galletas");

		System.out.println("Desea comer una galleta? si/no");
		eleccion = leer.next();
		eleccion = eleccion.toUpperCase();

		if (eleccion.equals("SI")) {
			comer = true;
		} else {
			comer = false;
		}

		while (comer && contador < 6) {
			contador += 1;
			chiky.comerGalleta();
			System.out.println("Quedan: " + chiky.getContenido() + " galletas");

			System.out.println("Desea comer una galleta? si/no");
			eleccion = leer.next();
			eleccion = eleccion.toUpperCase();

			if (eleccion.equals("SI")) {
				comer = true;
			} else {
				comer = false;
			}

		}
		System.out.println("Ya no quedan galletas");
	}
}
