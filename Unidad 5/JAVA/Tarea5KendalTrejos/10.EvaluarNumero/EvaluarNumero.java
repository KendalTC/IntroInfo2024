/*
*Esta clase indica si un numero es positivo, negativo o cero. 
*@version 10-5-24
*@author Kendal Trejos Cubero
*/
import javax.swing.JOptionPane; 

public class EvaluarNumero {
	public static void main (String args []){
		
		int numIngresado = 0;

		String numero = JOptionPane.showInputDialog("Por favor indique el numero que desea evaluar");
		numIngresado = Integer.parseInt(numero);

		if (numIngresado < 0) {
			JOptionPane.showMessageDialog(null, "El numero ingresado es negativo");
		}
		else {
			if (numIngresado == 0) {
				JOptionPane.showMessageDialog(null, "El numero ingresado es 0");
			}

			else {
				JOptionPane.showMessageDialog(null, "El numero indicado es positivo");
			}
		}
	}
}