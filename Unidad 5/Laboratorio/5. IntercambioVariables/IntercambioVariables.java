/*
 * @version 7/5/24
 * @author Kendal Trejos Cubero 
 */
public class IntercambioVariables {
    public static void main(String[] args) {
        int numero1 = 0; 
        int numero2 = 0; 
        int temporal = 0;

        Escritor escritor = new Escritor(); 
        Lector lector = new Lector();

        escritor.escribir ("Indique el primer numero con el que desea trabajar");
        numero1 = lector.leerInt();
        escritor.escribir("Indique el segundo numero con el que desea trabajar");
        numero2 = lector.leerInt();

        temporal = numero1; 
        numero1 = numero2;
        numero2 = temporal;

        escritor.escribir("El valor intercambiado del primer numero ingresado es: "+numero1);
        escritor.escribir("El valor intercambiado del segundo numero ingresado es: "+numero2);
    
    }
}