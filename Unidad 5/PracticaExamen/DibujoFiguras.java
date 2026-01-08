public class DibujoFiguras {
    public static void main(String[] args) {
        
        int figuraElegida = 0; 
        String continuar = ""; 
        boolean continuarDibujo = false; 
        char caracter = ' ';
        int altura = 0;
        int ancho = 0;
        
        Escritor escritor = new Escritor();
        Lector lector = new Lector();
    
        escritor.escribir("Desea realizar un dibujo? si/no \n");
        continuar = lector.leerString();
        continuar = continuar.toUpperCase();

        if (continuar.equals("SI")) {
            continuarDibujo = true;
        } else {
            continuarDibujo = false;
        }
        while (continuarDibujo) {
            escritor.escribir("Indique la figura que desea dibujar: 1:Cuadrado  2:Rectangulo  3:Triangulo \n");
            figuraElegida = lector.leerInt();

            escritor.escribir("Indique el caracter con el que desea realizar el dibujo \n");
            caracter = lector.leerChart();

            switch (figuraElegida) {
                case 1:
                    escritor.escribir("Indique el tamaño de los lados del cuadrado que desea dibujar \n");
                    altura = lector.leerInt();

                    //Dibujar
                    for (int i = 0; i < altura; i++) {
                        for (int j = 0; j < altura; j++) {
                            escritor.escribir(" "+caracter);
                        }

                        escritor.escribir("\n");
                    }
                break;

                case 2: 
                    escritor.escribir("Indique la altura del rectangulo que desea dibujar \n");
                    altura = lector.leerInt();

                    escritor.escribir("Indique el ancho del rectangulo que desea dibujar \n");
                    ancho = lector.leerInt();

                    for(int i = 1; i <= altura; i++) {
                        for(int j = 1; j <= ancho; j++) {
                            escritor.escribir(" "+caracter);
                        }

                        escritor.escribir("\n");
                    }
                break;

                case 3:
                    escritor.escribir("Indique el tamaño del triangulo que desea dibujar \n"); 
                    altura = lector.leerInt();

                    for(int i = altura; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            escritor.escribir(" "+caracter);

                        }

                        escritor.escribir("\n");
                    }
                break;

                default:
                    escritor.escribir("ERROR, solo se permite numeros entre 1 y 3 \n");

                break;
            }
            escritor.escribir("Desea realizar otro dibujo? si/no \n");
            continuar = lector.leerString();
            continuar = continuar.toUpperCase();
    
            if (continuar.equals("SI")) {
                continuarDibujo = true;
            } else {
                continuarDibujo = false;
            }
        }
        escritor.escribir("Gracias por participar");
    }
}
