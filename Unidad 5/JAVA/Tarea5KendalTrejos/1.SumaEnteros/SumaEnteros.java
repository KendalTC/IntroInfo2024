/*
* Es una clase para sumar dos números
* @ version 22-4-24
* @ author Kendal Trejos Cubero
*/
//Importar clases o paquetes
import java.util.Scanner;

public class SumaEnteros{
	public static void main (String args [] ){

	//paso1 declarar variables 
		int primerOperando, resultadoSuma;
		int segundoOperando = 0;


		//Uso de la librera scanner
		Scanner leer = new Scanner(System.in);


		//inicializar variables 
		primerOperando = 0;
		resultadoSuma = 0;


		//paso2 entradas y salidas 
		System.out.println ("Digite el primer operando");

		primerOperando = leer.nextInt();

		System.out.println ("Digite el segundo operando");
		segundoOperando = leer.nextInt();


		// paso3 proceso 
	
		resultadoSuma = primerOperando + segundoOperando;

		// mostrar las salidas o resultados

		System.out.println ("El resultado de la suma es: "+ resultadoSuma);
	
	}	


}