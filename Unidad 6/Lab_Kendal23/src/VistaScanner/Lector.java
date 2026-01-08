/*
 * @author Kendal Trejos Cubero 
 * @version 30/5/24
 */

package VistaScanner;

import java.util.Scanner;

public class Lector {
	Scanner leer;

	public Lector() {
		leer = new Scanner(System.in);
	}

	public String leerString() {
		return leer.next();
	}

}
