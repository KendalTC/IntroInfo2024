/*
* Es una clase para sumar dos números
* @ version 22-4-24
* @ author Kendal Trejos Cubero
*/

public class SumaEnteros{
	public static void main (String args [] ){

	//paso1 declarar variables 
		int primerOperando, resultadoSuma;
		int segundoOperando = 0;


		//Uso de la librera scanner
		Lector lector = new Lector();
		Escritor escritor = new Escritor();


		//inicializar variables 
		primerOperando = 0;
		resultadoSuma = 0;


		//paso2 entradas y salidas 
		escritor.escribir ("Digite el primer operando");

		primerOperando = lector.leerInt();

		escritor.escribir ("Digite el segundo operando");
		segundoOperando = lector.leerInt();


		// paso3 proceso 
	
		resultadoSuma = primerOperando + segundoOperando;

		// mostrar las salidas o resultados

		escritor.escribir("El resultado de la suma es: "+ resultadoSuma);
	
	}

}