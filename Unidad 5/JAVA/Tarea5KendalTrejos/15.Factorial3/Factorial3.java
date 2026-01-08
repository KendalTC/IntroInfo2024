/*
*Esta clase imprime el factorial del numero 3. 
*@version 24-4-24
*@author Kendal Trejos Cubero
*/
public class Factorial3 {

	public static void main (String args []) {
		int operando, factorial; 
		factorial = 1;
		operando = 3;

		for (int i = 1; i <= operando; i++) {
			System.out.println (i + "*");
			factorial = factorial * i;
		}

		System.out.println ("=" + factorial);
		System.out.println ("El factorial de " + operando + " es: " + factorial);
	}
}