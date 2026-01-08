/*
*@version 29-4-2024
*@author Kendal Trejos Cubero
*/
import java.util.Scanner; 

public class PiedraPapelTijeraV2 {
	public static void main (String args []) {
		
		String nombre = ""; 
		String sigueJuego = "";
		int eleccionJugador = 0; 
		int eleccionMaquina = 0;  
		int contadorEmpates = 0;
		int contadorGanes = 0;
		int contadorDerrotas = 0;

		Scanner leer = new Scanner (System.in);

		System.out.println ("Indique el nombre del jugador");
		nombre = leer.next(); 
		System.out.println ("Desea jugar? si/no");
		sigueJuego = leer.next();
		sigueJuego = sigueJuego.toUpperCase();

		while (sigueJuego.equals ("SI")) {
			System.out.println("Haga una eleccion 1: Piedra / 2: Papel / 3: Tijera");
			eleccionJugador = leer.nextInt();
		
			eleccionMaquina = 1+ (int)(Math.random() *3); 
			System.out.println ("La eleccion de la computadora es: " + eleccionMaquina);

			if (eleccionJugador == eleccionMaquina ) {
				System.out.println ("Se ha dado un empate");
				contadorEmpates = contadorEmpates + 1;
			
			}else {
				if (((eleccionJugador == 1)&&(eleccionMaquina == 3)) ||
				((eleccionJugador == 2)&&(eleccionMaquina == 1)) ||
				((eleccionJugador == 3)&&(eleccionMaquina == 2))){
					System.out.println ("Gana el jugador");
					contadorGanes = contadorGanes +1;

				}else {
					System.out.println ("Ganó la computadora");
					contadorDerrotas = contadorDerrotas +1;
				} 
			}

			System.out.println("Desea continuar jugando? si/no");
			sigueJuego = leer.next();
			sigueJuego = sigueJuego.toUpperCase();
		}
		System.out.println ("Cantidad de empates: " + contadorEmpates);
		System.out.println ("Cantidad de ganes: " + contadorGanes);
		System.out.println ("Cantidad de derrotas: " + contadorDerrotas);



	}
}