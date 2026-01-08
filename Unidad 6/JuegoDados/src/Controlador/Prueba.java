package Controlador;

/*
 * @Author Kendal Trejos 
 * @Version 12/6/2024
 */

import Modelo.Dado;
import Vista.Scanner.Escritor;
import Vista.Scanner.Lector;

public class Prueba {

	public static void main(String[] args) {
		// Variables
		String nombreJ1 = "";
		String nombreJ2 = "";
		String continuar = "";
		boolean hayApuesta = false;
		int apuesta = 0;
		int valorJ1 = 0;
		int valorJ2 = 0;
		int contVictoriasJ1 = 0;
		int contEmpates = 0;
		int contVictoriasJ2 = 0;
		// Instancias de objetos
		Escritor escritor = new Escritor();
		Lector lector = new Lector();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado(24);

		escritor.escribir("Indique el nombre del primer jugador");
		nombreJ1 = lector.leerString();

		escritor.escribir("Indique el nombre del segundo jugador");
		nombreJ2 = lector.leerString();

		escritor.escribir("Desean realizar una apuesta? si/no");
		continuar = lector.leerString();
		continuar = continuar.toUpperCase();

		if (continuar.equals("SI")) {
			hayApuesta = true;

		} else {
			//hayApuesta = false;
			escritor.escribir("Ha terminado el juego");
			System.exit(0);
		}

		while (hayApuesta) {
			escritor.escribir(" Cuanto dinero desean apostar?");
			apuesta = lector.leerInt();

			escritor.escribir("*****SE TIRAN LOS DADOS*****");
			dado1.tirar();
			dado2.tirar();
			valorJ1 = dado1.getValor() + dado2.getValor();
			escritor.escribir(nombreJ1 + " El total de sus dados es: " + valorJ1);

			dado1.tirar();
			dado2.tirar();
			valorJ2 = dado1.getValor() + dado2.getValor();
			escritor.escribir(nombreJ2 + " El total de sus dados es: " + valorJ2);

			if (valorJ1 == valorJ2) {
				escritor.escribir("Se ha dado un empate");
				contEmpates++;

			} else if (valorJ1 > valorJ2) {
				escritor.escribir("El ganador es: " + nombreJ1);
				contVictoriasJ1++;

			} else {
				escritor.escribir("El ganador es: " + nombreJ2);
				contVictoriasJ2++;
			}

			escritor.escribir("Desean realizar otra apuesta? si/no");
			continuar = lector.leerString();
			continuar = continuar.toUpperCase();

			if (continuar.equals("SI")) {
				hayApuesta = true;

			} else {
				//hayApuesta = false;
				escritor.escribir("Ha terminado el juego");
				System.exit(0);
			}
		}

		escritor.escribir(nombreJ1 + "Ganaste " + contVictoriasJ1 + " veces");
		escritor.escribir(nombreJ2 + "Ganaste " + contVictoriasJ2 + " veces");
		escritor.escribir("Se dieron " + contEmpates + " empates");
		escritor.escribir("Gracias por apostar");

	}
}