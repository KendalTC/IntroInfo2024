package Vista.Terminal;
/*
 *@Anthonny Lopez Martinez 		C4G614
 *@Johan Andrey Rivera Martinez		C4I975
 *@Kendal Trejos Cubero 	C4K374
 */

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
}
