/*
*Esta clase convierte un numero decimal ingresado en un numero romano
*@version 22-4-24
*@author Kendal Trejos Cubero
*/
import javax.swing.JOptionPane; 
public class NumerosRomanos {
	public static void main (String args []){
		int numDecimal = 0;
		String numRomano = "";

		String decimal = JOptionPane.showInputDialog("Por favor indique un numero entre 1 y 5");
		numDecimal = Integer.parseInt(decimal);

		switch (numDecimal) {
		case 1: 
			numRomano = "I";
		break;	
		case 2: 
			numRomano = "II";
		break;
		case 3: 
			numRomano = "III";
		break;
		case 4:
			numRomano = "IV";
		break;
		case 5: 
			numRomano = "V";
		break; 
		default: 
			JOptionPane.showMessageDialog(null,"Solo se permiten numeros entre 1 y 5");
		}
		JOptionPane.showMessageDialog(null,"El resultado de convertir el numero "+ numDecimal+ " a numero romano es: "+numRomano);
	}
}