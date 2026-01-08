/*
 * @version 10/5/24
 * @author Kendal Trejos Cubero
 */
import java.util.Scanner;
public class CalculoCircunferencia {
    public static void main(String[] args) {
        double diametro = 0; 
        double circunferencia =0; 

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor digite el diametro del circulo");
        diametro = leer.nextDouble();

        circunferencia = diametro * Math.PI;

        System.out.println("La medida de la circunferencia es: "+circunferencia);
    }
}          