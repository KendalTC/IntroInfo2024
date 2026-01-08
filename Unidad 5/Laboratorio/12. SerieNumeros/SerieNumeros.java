/*
 * @version 8/5/24
 * @author Kendal Trejos Cubero
 */
public class SerieNumeros {
    public static void main(String[] args) {
        int numIngresado = 0; 
        int numMayor = 0;
        int numMenor =0; 
        int sumatoria =0;
        int contador =0;
        double promedio = 0; 
        boolean esPrimeraVez = true; 

        Escritor escritor = new Escritor();
        Lector lector = new Lector(); 

        escritor.escribir("Ingrese el numero con el que desea trabajar (digite 0 cuando desea terminar)");
        numIngresado = lector.leerInt(); 

        while (numIngresado != 0) {
            escritor.escribir("Ingrese el numero con el que desea trabajar (digite 0 cuando desea terminar)");
            numIngresado = lector.leerInt();

            if (numIngresado > numMayor) {
                numMayor = numIngresado; 

                if (esPrimeraVez) {
                    numMenor = numIngresado; 
                    esPrimeraVez = false; 
                }

            } else {
                if (numIngresado < numMenor && numIngresado != 0) {
                    numMenor = numIngresado;
                }
            }

            if (numIngresado != 0) {
                contador = contador +1; 
            }

            sumatoria = numIngresado + sumatoria; 
        }
        promedio = sumatoria / contador; 

        escritor.escribir("El numero mayor de la lista es: "+ numMayor);
        escritor.escribir("El numero menor de la lista es: "+numMenor);
        escritor.escribir("El promedio de la lista es: "+ promedio);
    }
}
