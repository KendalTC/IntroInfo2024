/* 
*@author Kendal Trejos Cubero 
*@version4/5/24 
*/
import javax.swing.JOptionPane;
public class Potencias {
	public static void main (String args []){
		int base =0;
		int exponente =0;
		int resultadoPotencia = 1;
		String continuar = "";
		boolean continuarCal = false;
		
		continuar = JOptionPane.showInputDialog (null, "Desea realizar el calculo? si/no");
		continuar = continuar.toUpperCase();
		
		if (continuar.equals ("SI")) {
			continuarCal = true;
		}else {
			continuarCal = false;
		}
		while (continuarCal) {
				String baseStr  = JOptionPane.showInputDialog(null,"Indique la base de la potencia");
			base = Integer.parseInt(baseStr);
		
			String exponenteStr = JOptionPane.showInputDialog(null,"Indique el exponente de la potencia");
			exponente = Integer.parseInt(exponenteStr);
			
			for(int i = 1; i <= exponente; i++){
				resultadoPotencia = (resultadoPotencia * base);
				JOptionPane.showMessageDialog(null, "El resultado de la potencia es: " +resultadoPotencia);
			}
			continuar = JOptionPane.showInputDialog ("Desea continuar con otro calculo? si/no");
			continuar = continuar.toUpperCase();
			if (continuar.equals ("SI")) {
				continuarCal = true;
			}else{
				continuarCal = false;
			}
		}
		
	}
}