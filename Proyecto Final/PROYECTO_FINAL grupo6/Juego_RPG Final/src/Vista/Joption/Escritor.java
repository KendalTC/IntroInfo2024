package Vista.Joption;

/*
 *@Anthonny Lopez Martinez 		C4G614
 *@Johan Andrey Rivera Martinez		C4I975
 *@Kendal Trejos Cubero 	C4K374
 */
import javax.swing.JOptionPane;

public class Escritor {
	public Escritor() {

	}

	public String mostrarEntradaStr(String mensaje) {
		return JOptionPane.showInputDialog(null, mensaje);
	}

	public int mostrarEntradaInt(String mensaje) {
		return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
	}

	public void escribir(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}