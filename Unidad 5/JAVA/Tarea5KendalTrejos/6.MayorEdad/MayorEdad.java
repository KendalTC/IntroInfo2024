/*
*Es una clase para indicar si una persona es mayor de edad 
* @ version 22-4-24
* @ author Kendal Trejos Cubero 
*/
import java.util.Scanner;
public class MayorEdad {

	public static void main (String args []){
		// Definir e inicializar 
		int edad = 0;
		final int MAYOR_EDAD = 18; 
		Scanner leer = new Scanner (System.in);

		//Entradas 
		System.out.println ("Por favor ingrese su edad");
		edad = leer.nextInt();


		//Procesamiento
		if (edad >= MAYOR_EDAD){
			System.out.println ("Usted si es mayor de edad");

		}
		else {
			System.out.println ("Usted no es mayor de edad");
		}
	}
}