/*
 * @author Kendal Trejos 
 * @version 8/5/24
 */
public class SumatoriaMultiplos5 {
    public static void main(String[] args) {
        int contador = 5;
        int sumatoria = 0; 

        Escritor escritor = new Escritor();
        Lector lector = new Lector(); 

        escritor.escribir("Se suman los multiplos del 5 entre 1 y 100");

        while (contador <= 100) {
            escritor.escribir( "" +contador);
            contador = contador + 5; 
            sumatoria = sumatoria + contador;
        }
        escritor.escribir("La sumatoria de los multiplos del 5, del 1 al 100 es: "+sumatoria);

    }
}
