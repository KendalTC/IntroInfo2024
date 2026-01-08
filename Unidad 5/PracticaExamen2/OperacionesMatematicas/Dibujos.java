import java.util.Scanner;
public class Dibujos {
    public static void main(String []args) {
        char simbolo = ' ';
        int tamano = 0;
        int eleccion = 0;
        int contador = 0;
        int ancho = 0; 

        Scanner leer = new Scanner(System.in);

        System.out.println("Indique el dibujo que desea realizar: 1:Cuadrado / 2:Rectangulo / 3: Triangulo");
        eleccion = leer.nextInt();
        System.out.println("Indique el simbolo con el que desea dibujar la figura");
        simbolo = leer.next().charAt(0);

        switch(eleccion) {
            case 1:
                System.out.println("Indique el tamano del cuadrado que desea dibujar");
                tamano = leer.nextInt();

                while (contador != tamano) {
                    for(int i= 1; i <= tamano; i++) {
                        System.out.print(" " +simbolo);

                    }
                    System.out.println(" ");
                    contador +=1;
                }   
            break;

            case 2: 
                System.out.println("Indique la altura del rectangulo");
                tamano = leer.nextInt();
                System.out.println("Indique el ancho del rectangulo que desea realizar");
                ancho = leer.nextInt();

                while(contador != ancho) {
                    for(int i = 1; i <= tamano; i++) {
                        System.out.print(" "+simbolo);

                    }
                    contador +=1;
                    System.out.println(" ");

                }
            break;

            case 3: 
                System.out.println("Indique el tamaño del triangulo que desea realizar");
                tamano = leer.nextInt();

                for (int i = 0; i < tamano; i++) {
                    for(int j = tamano; j > i; j--) {
                        System.out.print(" "+simbolo);

                    }

                    System.out.println(" ");
                }
            break;
        }
    }
}
