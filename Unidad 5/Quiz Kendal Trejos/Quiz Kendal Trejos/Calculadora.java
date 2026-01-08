/*
 * @version 9/5/24
 * @author Kendal Trejos Cubero C4K374
 */
import java.util.Scanner;
 public class Calculadora {
    public static void main (String args []) {
        //Se declaran e inicializan las variables
        int operando1 = 0; 
        int operando2 = 0; 
        int eleccion = 0;
        int suma = 0; 
        int resta = 0; 
        int multiplicacion = 0; 
        int division = 0;
        int resultadoCalculo = 0;
        boolean continuar = false;
        String continuaCalculo = "";
        int residuo = 0;

        Scanner leer = new Scanner(System.in);

        //Datos de entrada 
        System.out.println("Desea utilizar la calculadora? si/no");
        continuaCalculo = leer.next();
        continuaCalculo = continuaCalculo.toUpperCase();

        if (continuaCalculo.equals("SI")) {
            continuar = true; 
            
        } else {
            continuar =false;
            
        }

        while (continuar) {
            System.out.println("Indique el calculo que desea realizar 1:Suma, 2:Resta, 3:Multiplicacion, 4:Division");
            eleccion = leer.nextInt();

            System.out.println("Por favor indique el primer operando o numero con el que desea realizar la operacion");
            operando1 = leer.nextInt();

            System.out.println("Por favor indique el segundo operando o numero con el que desea realizar la operacion");
            operando2 = leer.nextInt();

            //Se realizan las operaciones correspondientes
            switch (eleccion) {
                case 1:
                    suma = operando1 + operando2; 
                    resultadoCalculo = suma;
                    break;

                case 2: 
                    resta = operando1-operando2;
                    resultadoCalculo = resta; 
                break;

                case 3: 
                    multiplicacion = operando1 * operando2;
                    resultadoCalculo = multiplicacion; 
                break;

                case 4: 
                    division = operando1 / operando2;
                    residuo = operando1 % operando2;
                    if (residuo == 0) {
                        resultadoCalculo = division;
                    } else {
                        System.out.println("ERROR, los numeros ingresados no son divisibles entre sí");
                    }
                break;
            
                default:
                System.out.println("ERROR, SOLO se permite ingresar el numero correspondiente a la operacion entre 1 y 4");
                    break;
            }
            //Se muestra el resultado
            System.out.println("El resultado de la operacion realizada es: "+ resultadoCalculo);

            System.out.println("Desea seguir utilizando la calculadora? si/no");
            continuaCalculo = leer.next();
            continuaCalculo = continuaCalculo.toUpperCase();
    
            if (continuaCalculo.equals("SI")) {
                continuar = true; 
                
            } else {
                continuar =false;  
            }
        }
        System.out.println("Muchas gracias por utilizar la calculadora, que tenga lindo dia");
    }
 }