/*
*@version 2/5/2024
*@author Kendal Trejos Cubero
*/

import javax.swing.JOptionPane;

public class EscudoCorona {
	public static void main (String args []) {
		String nombre = "";
		String eleccion = "";
		int moneda = 0;
		String valorMoneda = "";
		boolean sigueJuego = false;
		String continuarJuego = "";
		int contadorCorona=0;
		int contadorEscudo =0;
		int contadorDerrotas =0;

		nombre = JOptionPane.showInputDialog ("Indique su nombre");
		continuarJuego = JOptionPane.showInputDialog ("Desea jugar? si / no");
		continuarJuego = continuarJuego.toUpperCase();

		if (continuarJuego.equals ("SI")) {
			sigueJuego = true;
		}else {
			sigueJuego = false;
		}
		
		while (sigueJuego) {

			eleccion = JOptionPane.showInputDialog ("Eliga entre escudo / corona");
			eleccion = eleccion.toUpperCase();

			if (eleccion.equals ("ESCUDO")) {
				JOptionPane.showMessageDialog (null, "La eleccion de la casa es: CORONA");
			}else {
				if (eleccion.equals ("CORONA")) {
					JOptionPane.showMessageDialog (null, "La eleccion de la casa es: ESCUDO");
			
				}else {
					JOptionPane.showMessageDialog (null, "EROR, solo se permite ESCUDO / CORONA");
				}
			}			
	
			moneda = 1+(int)(Math.random()*2);

			if (moneda == 1) {
				valorMoneda = "ESCUDO";
			}else {
				valorMoneda = "CORONA";
			}
			JOptionPane.showMessageDialog (null, "CAYÓ: " + valorMoneda);
		
			if ((valorMoneda.equals ("ESCUDO")) &&(eleccion.equals ("ESCUDO"))) {
				JOptionPane.showMessageDialog (null,"Usted ha ganado");
				contadorEscudo = contadorEscudo +1;
			
			}else {
				if ((valorMoneda.equals ("CORONA")) && (eleccion.equals ("CORONA"))) {
					JOptionPane.showMessageDialog (null,"Usted ha ganado");
					contadorCorona = contadorCorona +1;
				}else {
					JOptionPane.showMessageDialog (null, "Ha ganado la casa");
					contadorDerrotas = contadorDerrotas +1;
				}
			}
			continuarJuego = JOptionPane.showInputDialog ("Desea continuar jugando? si/no");
			continuarJuego = continuarJuego.toUpperCase();

			if (continuarJuego.equals ("SI")) {
				sigueJuego = true;
			}else {
				sigueJuego = false;
			}
		}
		JOptionPane.showMessageDialog (null, "total de ganes con CORONA: " + contadorCorona);
		JOptionPane.showMessageDialog (null, "Total de ganes con ESCUDO: " + contadorEscudo);
		JOptionPane.showMessageDialog (null, "Total de derrotas: "+ contadorDerrotas);	
	}

}