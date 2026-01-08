import javax.swing.JOptionPane;
public class CalculoAreaCirculo {
	public static void main (String args []) {
		double area = 0;

		String texto = JOptionPane.showInputDialog (null,"Indique el radio del circulo");
		double radio = Double.parseDouble(texto);

		area = Math.PI * (radio*radio);

		JOptionPane.showMessageDialog (null,"El area del circulo es: "+area);	
	}
}