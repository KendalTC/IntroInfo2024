public class Ahorcado {
    public static void main (String [] args) {
        String continuarJuego = "";
        boolean continuar = false;
        int numero = 0;
        int random = 0;
        int contador = 0;
        boolean gane = true;

        Escritor escritor = new Escritor();
        Lector lector = new Lector();

        escritor.escribir("Desea jugar? si/no");
        continuarJuego = lector.leerString();
        continuarJuego = continuarJuego.toUpperCase();

        if (continuarJuego.equals("SI")) {
            continuar = true;
        } else {
            continuar = false;
        }

        while (continuar) {
            escritor.escribir("Se asignara un numero random entre 1 y 30 para ser adivinado TIENE 5 INTENTOS");
            random =  1+ (int) (Math.random()*30);

            while (gane && contador < 5) { 
                contador +=1;
                escritor.escribir("Elija un numero entre 1 y 30");
                numero = lector.leerInt();

                if (numero == random) {
                    gane = false;
                    escritor.escribir("Felicidades, ha adivinado el numero, el numero era: "+random);

                }else {
                    gane = true;
                    if (numero < random) {
                        escritor.escribir("El numero ingresado es menor al que debe adivinar");
                        
                    }else {
                        escritor.escribir("El numero ingreado es mayor al que debe adivinar");
                    }

                }

                if (contador >= 5) {
                    escritor.escribir("HAS PERDIDO");
                    escritor.escribir("El numero era: "+random);
                    
                }
    
            }

            escritor.escribir("Desea jugar de nuevo? si/no");
            continuarJuego = lector.leerString();
            continuarJuego = continuarJuego.toUpperCase();

            if(continuarJuego.equals("SI")) {
                continuar = true;

            }else {
                continuar = false;
            }
            contador = 0;
            gane = true;
        }
    }
}
