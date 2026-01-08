/*
*Esta clase dibuja una piramide de asteriscos de base 5. 
*@version 24-4-24
*@author Kendal Trejos Cubero 
*/ 
public class DibujoAsteriscos { 
	public static void main (String args []){
	
		String dibujo = "";
		int contador = 0;
		
		while (contador < 5) {
			contador = contador +1;
			dibujo = "*" + dibujo;
			System.out.println (dibujo);
		}	
	}
}