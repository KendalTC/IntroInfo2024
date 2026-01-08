package codigo_base_examen3;
import javax.swing.JOptionPane;

public class GestorES {
	//Atributos [no los necesitamos]
	
	//Metodo Constructores [no los necesitamos]
	
	// Otros Metodos
	public void mostrarMensaje (String mensaje){
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public String solicitarString(String mensaje){
		return JOptionPane.showInputDialog(mensaje);
	}

	public int solicitarEntero(String mensaje){
		int numeroSolicitado = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return numeroSolicitado;
	}

	public double solicitarDouble(String mensaje){
		double numeroSolicitado = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return numeroSolicitado;
	}
}
