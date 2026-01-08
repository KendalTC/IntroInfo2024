import java.util.Scanner;
public class Prueba {
    public static void main (String [] args) {
        Scanner leer = new Scanner(System.in);

        int altura = 0; 
        char simbolo = '/';
        int contador = 0;

        System.out.println("Indique la altura");
        altura = leer.nextInt();

        for(int i = 1; i <= altura; i++){
            for(int j = altura; j >= i; j--){
                System.out.print(" "+simbolo);
            }

            System.out.println(" ");
        }

        while(contador != altura) {
            contador +=1;
            for(int i = 1; i <= altura; i++) {
                System.out.print(" "+simbolo);
            }
            System.out.println(" ");
        }



    }
}
