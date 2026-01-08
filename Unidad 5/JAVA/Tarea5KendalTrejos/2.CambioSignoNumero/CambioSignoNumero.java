/*
*Esta clase cambia el signo de un numero entero ingresado. 
*@version 24-2-24
*@author Kendal Trejos Cubero
*/
import java.util.Scanner;

public class CambioSignoNumero {
	public static void main (String args []){
		int numIngresado, numContrario;
		Scanner leer = new Scanner (System.in);
		
		System.out.println ("Digite el numero al que le desea cambiar el signo");
		numIngresado = leer.nextInt ();

		numContrario = numIngresado * (-1);

		System.out.println ("El numero contrario es: "+numContrario);
	}
}