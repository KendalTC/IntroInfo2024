/*
*@version 4/5/24
*@author Kendal Trejos Cubero 
*/
import javax.swing.JOptionPane;

public class CartaMayor {
	public static void main (String args []){
		String nombre = "";
		boolean sigueJuego = false; 
		String continuarJuego = "";
		int cartaJugador = 0;
		int cartaCasa = 0; 
		int contadorGanes = 0;
		int contadorDerrotas = 0;
		int contadorEmpates =0;
		
		nombre = JOptionPane.showInputDialog (null, "Indique su nombre");
		continuarJuego = JOptionPane.showInputDialog (null, "Desea jugar? si/no");
		continuarJuego = continuarJuego.toUpperCase();

		if (continuarJuego.equals ("SI")) {
			sigueJuego = true;
		}else {
			sigueJuego = false;
		}
			
		while (sigueJuego) {
			JOptionPane.showMessageDialog (null,"Se le asignará una carta aleatoria");
			cartaJugador = 1+(int)(Math.random()*14);
			JOptionPane.showMessageDialog (null,"Su carta es: " + cartaJugador);

			cartaCasa = 1+(int)(Math.random()*14);
			JOptionPane.showMessageDialog (null, "La carta elegida por la casa es: "+cartaCasa);
			
			// definir carta mayor
			
			if (cartaJugador == cartaCasa) {
				JOptionPane.showMessageDialog (null,"Se ha dado un empate, eligieron la misma carta");
				contadorEmpates = contadorEmpates +1;
			}else {
				if (cartaJugador > cartaCasa) {
					JOptionPane.showMessageDialog (null,"El ganador es: " +nombre);
					contadorGanes = contadorGanes +1;
				
				}else {
					JOptionPane.showMessageDialog (null,"El ganador es la CASA");
					contadorDerrotas = contadorDerrotas +1;
				}
			}
			continuarJuego = JOptionPane.showInputDialog (null,"Desea continuar jugando? si/no");
			continuarJuego = continuarJuego.toUpperCase();

			if (continuarJuego.equals ("SI")) {
				sigueJuego = true;
			}else {
				sigueJuego = false;
			}
		}
		JOptionPane.showMessageDialog (null, "Total de derrotas: " +contadorDerrotas);
		JOptionPane.showMessageDialog (null, "Total de ganes: " +contadorGanes);
		JOptionPane.showMessageDialog (null, "Total de empates: " +contadorEmpates);
	}
}