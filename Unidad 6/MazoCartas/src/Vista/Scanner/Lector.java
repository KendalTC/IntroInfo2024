/*
 * @author Kendal Trejos Cubero 
 * @version 30/5/24
 */

package Vista.Scanner;

import java.util.Scanner;

public class Lector {
	Scanner leer;

	public Lector() {
		leer = new Scanner(System.in);
	}

	public int leerInt() {
		return leer.nextInt();

	}

	public String leerString() {
		return leer.next();
	}

	public double leerDouble() {
		return leer.nextDouble();
	}

}
