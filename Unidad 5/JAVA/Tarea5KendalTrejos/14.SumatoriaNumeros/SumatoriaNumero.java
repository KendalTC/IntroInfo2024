/*
*Esta clase realiza la sumatoria de un numero ingresado
*@version 22-4-24
*@author Kendal Trejos Cubero
*/

import java.util.Scanner;
public class SumatoriaNumero {
	public static void main (String args[]){
		int numIngresado, resultadoSumatoria, contador; 
		numIngresado = 0;
		resultadoSumatoria =0; 
		contador = 0;
		Scanner leer = new Scanner (System.in);

		System.out.println ("Por favor indique el numero con el cual desea realiza la sumatoria");
		numIngresado = leer.nextInt();
		
		while (contador != numIngresado) {
			contador = contador + 1;
			resultadoSumatoria = resultadoSumatoria + contador;
			System.out.println (contador + "+"); 
		}		
		System.out.println ("=" + resultadoSumatoria+ " El resultado de la sumatoria de "+ numIngresado + " es: " + resultadoSumatoria);
		
	}
}