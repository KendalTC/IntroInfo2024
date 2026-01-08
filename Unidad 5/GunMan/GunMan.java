/*
 * @version 13/5/24
 * @author Kendal Trejos Cubero 
 */
import java.util.Scanner;
public class GunMan {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Presione ENTER para jugar");
        leer.nextLine();
      
        while (true) {

            int disparo = (int) (1+(Math.random()*6));
            long inicio = System.currentTimeMillis();
            long fire = System.currentTimeMillis()/1000; 
            System.out.println(disparo);  
            if (inicio == disparo) {
                System.out.println("FIRE!!!");  
            }


            
            long fin = System.currentTimeMillis(); 
            long tiempo = fin - inicio;
            leer.nextLine();
            System.out.println("Su tiempo es: " + tiempo);




        }
    }
}
