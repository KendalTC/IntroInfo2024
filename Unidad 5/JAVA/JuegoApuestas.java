/*
*@version 25-4-24
*@author Kendal Trejos Cubero
*/ 
import java.util.Scanner; 

public class JuegoApuestas {
	public static void main (String args []){
			
		String nombre = "";
		int dineroDisponible = 0; 
		int valorApuesta = 0; 
		boolean continuarJuego = false;
		String hayApuesta = ""; 
		int numUsuario = 0;
		int numCasa = 0;
		int numRuleta = 0;
		int contGanes = 0;
		int acumuladorDinero = 0; 
		Scanner leer = new Scanner (System.in);

		System.out.println ("Por favor indique su nombre");
		nombre = leer.next();

		System.out.println ("Ingrese la cantidad de dinero disponible");	
		dineroDisponible = leer.nextInt();

		System.out.println (nombre+ " Desea usted realizar una apuesta? si/no");
		hayApuesta = leer.next();

		hayApuesta = hayApuesta.toUpperCase();
		if (hayApuesta.equals ("SI")){
			continuarJuego = true;
		}else {
			continuarJuego = false;
		}
		
		while (continuarJuego) {
			System.out.println ("Ingrese la cantidad de dinero que desea apostar");
			valorApuesta = leer.nextInt ();
			System.out.println ("Digite un numero entre 1 y 30 con el que desea realizar la apuesta");
			numUsuario = leer.nextInt ();
			if (numUsuario > 0 && numUsuario <= 30) {

				// Apuesta con la casa
				numCasa =  ( (1 + (int) (Math.random()*30) ));
				System.out.println ("El numero apostado por la CASA es :" + numCasa);

				// Numero random ruleta 
				numRuleta =  ( (1 + (int) (Math.random()*30) ));
				System.out.println ("*******RULETA*******");
			
				System.out.println ("EL NUMERO QUE CAYO EN LA RULETA ES: "+ numRuleta);

				// Se evaluan los numeros 
				int distanciaCasa = Math.abs (numRuleta - numCasa);
				int distanciaUsuario = Math.abs (numRuleta - numUsuario);

				if (distanciaCasa == distanciaUsuario) {
					System.out.println ("Se ha dado un EMPATE, gana la casa");
					dineroDisponible = dineroDisponible - valorApuesta;

				}
				else {
					if (distanciaCasa > distanciaUsuario ) {
						System.out.println ("El ganador de la apuesta es:" + nombre);
						dineroDisponible = dineroDisponible + valorApuesta;
						contGanes = contGanes +1;
						acumuladorDinero = acumuladorDinero + valorApuesta; 
					}else {
						System.out.println ("El ganador de la apuesta es LA CASA ");
						dineroDisponible = dineroDisponible - valorApuesta;
					}
			
				} 
				}
			else {
				System.out.println ("Solo se permiten numeros entre 1 y 30");
			}
			System.out.println ("Su dinero disponible en este momento es:" + dineroDisponible);
			System.out.println ("Quiere realizar otra apuesta? si/no");
			hayApuesta = leer.next();	
			hayApuesta = hayApuesta.toUpperCase();
			if (hayApuesta.equals ("SI")){
				continuarJuego = true;
			}else {
				continuarJuego = false;
			}
		}
	
		System.out.println ("Total de rondas ganadas: "+ contGanes);
		System.out.println ("Total de dinero ganado: "+ acumuladorDinero);
	} 
}