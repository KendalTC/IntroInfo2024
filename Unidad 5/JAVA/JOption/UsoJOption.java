import javax.swing.JOptionPane;

public class UsoJOption {
	public static void main (String args []){

		int numeroEntero = 0;
		String nombre = ""; 

		
		String numeroString = JOptionPane.showInputDialog("Digite un numero");
		numeroEntero = Integer.parseInt(numeroString);

		JOptionPane.showMessageDialog(null, "El numero es: " + (numeroEntero + 20));
		


	}

}