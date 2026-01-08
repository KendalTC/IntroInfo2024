/*
*@version5/5/24
*@author Kendal Trejos Cubero
*/
import java.util.Scanner;
public class PiramideNuemeros {
	public static void main (String args []) {
		int tamano = 0;
		String continuar = "";
		Scanner leer =new Scanner(System.in);

		System.out.println ("Desea realizar la piramide? si/no");
		continuar = leer.next();
		continuar = continuar.toUpperCase();

		while (continuar.equals ("SI")) {
			System.out.println ("Indique la altura de la piramide");
			tamano = leer.nextInt(); 

			for (int i = 1; i<=tamano; i++) {
				System.out.println ("");
				for (int j = 1; j<=i; j++) {
					System.out.print (j);
				}
			}
		System.out.println ("Desea realizar otra piramide? si/no");
		continuar = leer.next();
		continuar = continuar.toUpperCase();
		}
	}
}