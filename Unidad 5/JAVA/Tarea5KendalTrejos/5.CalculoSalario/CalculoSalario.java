/*
 * @version 10/5/24
 * @author Kendal Trejos Cubero
 */
import java.util.Scanner;
public class CalculoSalario {
    public static void main(String[] args) {
        final int VALOR_EXTRAS = 3500;
        double salarioBase = 0;
        double horasExtras =0; 
        double salarioTotal =0; 

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor indique su salario base");
        salarioBase = leer.nextDouble();
        System.out.println("Por favor indique la cantidad de horas extras trabajadas durante el mes");
        horasExtras = leer.nextDouble();

        salarioTotal = salarioBase + (horasExtras * VALOR_EXTRAS);

        System.out.println("Su salario total es: "+salarioTotal);
    }
}