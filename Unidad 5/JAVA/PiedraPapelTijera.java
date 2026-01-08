/*
*@version 29-4-2024
*@author Kendal Trejos Cubero
*/
import java.util.Scanner; 

public class PiedraPapelTijera {
	public static void main (String args []) {
		
		String nombre = ""; 
		String sigueJuego = "";
		String eleccionJugador = ""; 
		int eleccionMaquina = 0;
		boolean continuarJuego = false;  
		int valorJugador = 0;
		
		Scanner leer = new Scanner (System.in);


		System.out.println ("Indique el nombre del jugador");
		nombre = leer.next(); 
		System.out. println ("Desea jugar? si/no");
		sigueJuego = leer.next();

		sigueJuego = sigueJuego.toUpperCase();
		
		if (sigueJuego.equals ("SI")){
			continuarJuego = true;
		}else {
			continuarJuego = false;
		}
		//Definir las elecciones-
		while (continuarJuego) {
			System.out.println ("Haga una eleccion Piedra / Papel / Tijera");
			eleccionJugador = leer.next();
	
			eleccionJugador = eleccionJugador.toUpperCase();
			if (eleccionJugador == "PIEDRA") {
				valorJugador = 1; 
			}
			if (eleccionJugador == "PAPEL") {
				valorJugador = 2; 
			}
			if (eleccionJugador == "TIJERA") {
				valorJugador = 3;
					
			}else {
				System.out.println ("Error, solo se permite Piedra / Papel / Tijera");
			}
			
			eleccionMaquina = 1+ (int)(Math.random () *3); 
			switch (eleccionMaquina){
				case 1: 
					System.out.println ("La elección de la computadora es PIEDRA");
										
					switch (valorJugador) {
					
						case 1: 
							System.out.println ("Se ha dado un EMPATE"); 
							break; 
						case 2: 
							System.out.println ("Usted ha ganado"); 
							break;
						case 3:
							 System.out.println ("Ha ganado la computadora");
						 	break;
					}
					break;

				case 2: 
					System.out.println ("La elección de la computadora es PAPEL");

					switch (valorJugador) {
					
						case 1: 
							System.out.println ("Ha ganado la computadora"); 
							break; 
						case 2: 
							System.out.println ("Se ha dado un EMPATE"); 
							break;
						case 3:
							 System.out.println ("Usted ha ganado");
						 	break;
					}
					break; 
					
				case 3: 
					System.out.println ("La elección de la computadora es TIJERAS");

					switch (valorJugador) {
					
						case 1: 
							System.out.println ("Usted ha ganado"); 
							break; 
						case 2: 
							System.out.println ("Ha ganado la computadora"); 
							break;
						case 3:
							 System.out.println ("Se ha dado un EMPATE");
						 	break;
					}

					 break; 

				default: 
					System.out.println ("ERROR");
			} 

			System.out. println ("Desea continuar jugando? si/no");
			sigueJuego = leer.next();

			sigueJuego = sigueJuego.toUpperCase();
		
			if (sigueJuego.equals ("SI")){
				continuarJuego = true;
			}else {
				continuarJuego = false;
			}
		}
	}
}