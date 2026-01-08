package Vista.Joption;

/*
 *@Anthonny Lopez Martinez 		C4G614
 *@Johan Andrey Rivera Martinez		C4I975
 *@Kendal Trejos Cubero 	C4K374
 */
import javax.swing.JOptionPane;

public class Lector {
	public Lector() {

	}

	public String leerString() {
		return JOptionPane.showInputDialog("");
	}

	public int leerInt() {
		return Integer.parseInt(JOptionPane.showInputDialog(""));

	}
}
