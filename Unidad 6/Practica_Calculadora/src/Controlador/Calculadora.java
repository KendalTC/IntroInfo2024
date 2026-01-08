package Controlador;

import Modelo.OperacionesDouble;
import Modelo.OperacionesInt;
import Modelo.Usuario;
import Vista.Scanner.Escritor;
import Vista.Scanner.Lector;

public class Calculadora {

	public static void main(String[] args) {
		String nombre = "";
		String continuarStr = "";
		boolean continuar = false;
		int tipoNum = 0;
		int operacion = 0;
		int operandoInt1 = 0;
		int operandoInt2 = 0;
		double operandoDouble1 = 0;
		double operandoDouble2 = 0;

		Escritor escritor = new Escritor();
		Lector lector = new Lector();
		OperacionesDouble opDouble = new OperacionesDouble();
		OperacionesInt opInt = new OperacionesInt();
		Usuario user = new Usuario("");

		escritor.escribir("Indique su nombre");
		nombre = lector.leerString();
		user.setNombre(nombre);

		do {
			escritor.escribir("Desea realizar una operacion con numeros enteros o reales? \n 1.Enteros \n 2.Reales");
			tipoNum = lector.leerInt();

			escritor.escribir(
					"Que tipo de operacion desea realizar? \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division");
			operacion = lector.leerInt();

			switch (tipoNum) {
			case 1:
				escritor.escribir("Indique el primer operando");
				operandoInt1 = lector.leerInt();

				escritor.escribir("Indique el segundo operando");
				operandoInt2 = lector.leerInt();

				switch (operacion) {
				case 1:
					escritor.escribir("El resultado de la suma es: " + opInt.calcularSuma(operandoInt1, operandoInt2)
							+ " Nombre: " + user.getNombre());

					break;

				case 2:
					escritor.escribir("El resultado de la resta es: " + opInt.calcularResta(operandoInt1, operandoInt2)
							+ " Nombre: " + user.getNombre());

					break;

				case 3:
					escritor.escribir("El resultado de la multiplicacion es: "
							+ opInt.calcularMultiplicacion(operandoInt1, operandoInt2) + " Nombre: "
							+ user.getNombre());

					break;

				case 4:
					escritor.escribir("El resultado de la division es: "
							+ opInt.calcularDivision(operandoInt1, operandoInt2) + " Nombre: " + user.getNombre());

					break;

				default:
					escritor.escribir("Solo se permiten opciones entre 1 y 4");
					break;
				}
				break;

			case 2:
				escritor.escribir("Indique el primer operando");
				operandoDouble1 = lector.leerDouble();

				escritor.escribir("Indique el segundo operando");
				operandoDouble2 = lector.leerDouble();

				switch (operacion) {
				case 1:
					escritor.escribir("El resultado de la suma es: "
							+ opDouble.calcularSuma(operandoDouble1, operandoDouble2) + " Nombre: " + user.getNombre());
					break;

				case 2:
					escritor.escribir(
							"El resultado de la resta es: " + opDouble.calcularResta(operandoDouble1, operandoDouble2)
									+ " Nombre: " + user.getNombre());

					break;

				case 3:
					escritor.escribir("El resultado de la multiplicacion es: "
							+ opDouble.calcularMultiplicacion(operandoDouble1, operandoDouble2) + " Nombre: "
							+ user.getNombre());
					break;

				case 4:
					escritor.escribir("El resultado de la division es: "
							+ opDouble.calcularDivision(operandoDouble1, operandoDouble2) + " Nombre: "
							+ user.getNombre());
					break;

				default:
					escritor.escribir("Solo se permiten opciones entre 1 y 4");
					break;
				}

				break;

			default:
				escritor.escribir("Solo se permiten las opciones 1 y 2");
				break;
			}

			escritor.escribir("Desea realizar un nuevo calculo? si/no");
			continuarStr = lector.leerString();
			continuarStr = continuarStr.toUpperCase();

			if (continuarStr.equals("SI")) {
				continuar = true;
			} else {
				continuar = false;
				escritor.escribir(" Ha termiando el programa, gracias por usar la calculadora");
			}
		} while (continuar);
		

	}

}
