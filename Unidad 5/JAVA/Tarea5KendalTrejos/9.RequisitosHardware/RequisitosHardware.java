/*
* Esta clase analiza el hardware de un ordenador y le indica al usuario si cumple o no con los requisitos. 
*@ version 24-4-24
* @ author Kendal Trejos Cubero
*/
import javax.swing.JOptionPane; 
public class RequisitosHardware {
	public static void main (String args []){
		int ram, almacenamiento, nucleos;
		final int NUCLEO = 4; 
		final int ALMACENAMIENTO_MIN = 500; 
		final int RAM_MINIMA = 2;

		ram = 0; 
		almacenamiento = 0; 
		nucleos = 0;

		String memoria = JOptionPane.showInputDialog(null,"Indique la cantidad de memoria RAM del computador en GB");
		ram = Integer.parseInt(memoria);
		String rom = JOptionPane.showInputDialog(null,"Indique la memoria de almacenamiento del computador en GB"); 
		almacenamiento = Integer.parseInt(rom);
		String nucleo = JOptionPane.showInputDialog(null,"Indique la cantidad de nucleos del procesador con los que cuenta el computador");
		nucleos = Integer.parseInt(nucleo);

		if ((ram >= RAM_MINIMA) && (almacenamiento >= ALMACENAMIENTO_MIN) && (nucleos == NUCLEO)) {
			JOptionPane.showMessageDialog(null,"Su ordenador SI cumple con los requisitos minimos de hardware");
		}
		
		else {
			JOptionPane.showMessageDialog(null,"Su ordenador NO cumple con los requisitos minimos de hardware");
		}
	}
}