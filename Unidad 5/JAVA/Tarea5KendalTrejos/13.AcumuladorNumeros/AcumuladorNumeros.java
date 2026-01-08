/*
*Es una clase en la que se solicitan numeros y se acumulan.
*@version 22-4-24
*@author Kendal Trejos Cubero
*/
import java.util.Scanner;

public class AcumuladorNumeros {
	public static void main (String args[]) {

		int numIngresado, resultadoAcumulado;
		numIngresado = 0;
		resultadoAcumulado = 0;
		Scanner leer = new Scanner (System.in);

		System.out.println ("Digite el numero que desea acumular");
		numIngresado = leer.nextInt();

		do {
			resultadoAcumulado = numIngresado + resultadoAcumulado;
			System.out.println ("El resultado al acumular "+ numIngresado+ " es: "+ resultadoAcumulado);
			System.out.println ("Digite el siguiente numero que desea acumular o digite 0 si desea terminar");
			numIngresado = leer.nextInt();

		}while (numIngresado != 0);
		System.out.println ("El total acumulado es: " + resultadoAcumulado);
		

	}	

}