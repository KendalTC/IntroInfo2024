/*
*La clase imprime la tabla de multiplicar de determinado numero.
*@version 10-5-24
*@author Kendal Trejos Cubero
*/
public class TablaMultiplicar {
	public static void main (String args []){
		int num1, producto;

		num1 = 0;
		producto = 0;

		Lector lector = new Lector();
		Escritor escritor = new Escritor(); 

		escritor.escribir("Digite el numero de la tabla de multiplicar");
		num1 = lector.leerInt();

		escritor.escribir("La tabla de multiplicar del numero" + num1 + "es: ");

		for (int i = 0; i <=10; i++){
			producto = num1*i;
			escritor.escribir(num1 + "*" + i + " = "+ producto);		
		}
	}
}