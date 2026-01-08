import java.util.Scanner;
public class Figuras {
    public static void main(String[] args) {
        int figuraElegida = 0; 
        String continuar = ""; 
        boolean continuarDibujo = false; 
        char caracter = ' ';
        int altura = 0;
        int ancho = 0;
        int contador =0;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Desea realizar un dibujo? si/no");
        continuar = leer.next();
        continuar = continuar.toUpperCase();

        if (continuar.equals("SI")) {
            continuarDibujo = true;
        } else {
            continuarDibujo = false;
        }

        while (continuarDibujo) {
            System.out.println("Indique la figura que desea dibujar: 1:Cuadrado  2:Rectangulo  3:Triangulo");
            figuraElegida = leer.nextInt();

            System.out.println("Indique el caracter con el que desea realizar el dibujo");
            caracter = leer.next().charAt(0);

            switch (figuraElegida) {
                case 1:
                    System.out.println("Indique el tamaño de los lados del cuadrado que desea dibujar");
                    altura = leer.nextInt();

                    //Dibujar 
                    for (int i = 0; i < altura; i++) {
                        for (int j = 1; j < altura; j++) {
                            System.out.print(caracter);
                            
                        }
                        System.out.println("");  
                    }
                    break;

                case 2: 
                    System.out.println("Indique la altura del rectangulo que desea dibujar");
                    altura = leer.nextInt();
                    System.out.println("Indique el ancho del rectangulo que desea dibuujar");
                    ancho = leer.nextInt();

                    //Dibujar 
                    for (int i = 0; i < altura; i++) {
                        for (int j = 1; j < ancho; j++) {
                            System.out.print(caracter);

                        }
                        System.out.println(caracter);
                    }

                break;

                case 3: 
                    System.out.println("indique el tamaño del triangulo que desea dibujar");
                    altura = leer.nextInt();

                     for (int i = altura; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(caracter);
                        
                        }
                        System.out.println("");
                    }
                    
                break; 

                default: 
                    System.out.println("EROR, solo se permiten opciones entre 1 y 3");
                break;
            }

            System.out.println("Desea realizar otro dibujo? si/no");
            continuar = leer.next();
            continuar = continuar.toUpperCase();
    
            if (continuar.equals("SI")) {
                continuarDibujo = true;
            } else {
                continuarDibujo = false;
            }
        }
        System.out.println("Muchas gracias por jugar");
    }
}