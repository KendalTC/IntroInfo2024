/*
 * @version 10/5/24
 * @author Kendal Trejos Cubero 
 */
  import java.util.Scanner;
  public class NumeroMayor {
    public static void main(String[] args) {
        int numero1 = 0; 
        int numero2 = 0; 

        Scanner leer = new Scanner(System.in);

        System.out.println("Digite el primer numero con el que desea trabajar");
        numero1 = leer.nextInt();

        System.out.println("Digite el segundo numero con el que desea trabajar");
        numero2 = leer.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los numeros ingresados son iguales");

        } else {
            if (numero1 > numero2) {
                System.out.println("El numero mayor es: "+numero1);
            
            }else {
                System.out.println("El numero mayor es: "+numero2);
            } 
        }
    }
}