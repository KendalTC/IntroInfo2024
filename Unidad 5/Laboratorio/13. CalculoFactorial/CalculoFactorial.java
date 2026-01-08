/*
 * @version 8/5/24
 * @author Kendal Trejos Cubero
 */
public class CalculoFactorial {
    public static void main(String[] args) {
        int numIngresado = 0; 
        int factorial = 1; 

        Escritor escritor = new Escritor(); 
        Lector lector = new Lector(); 

        escritor.escribir("Indique el numero al que desea obtener su factorial");
        numIngresado = lector.leerInt();

        for (int i = 1; i <= numIngresado; i++) {
            //System.out.println(i);
            escritor.escribir(i + " * "+ factorial);
            factorial = factorial * i;
        }

        escritor.escribir(" = "+ factorial);
        escritor.escribir("El factorial del numero "+ numIngresado+ " es: "+ factorial);
    }
}
