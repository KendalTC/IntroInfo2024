/*
 * @version 6/5/24
 * @author Kendal Trejos Cubero
 */
public class Juego21 {
    public static void main (String args []) {
        String nombre = "";
        String continuarJuego = "";
        boolean sigueJuego = false;
        int cartaJugador1 = 0;
        int cartaJugador2 = 0;
        int cartaCasa1 = 0;
        int cartaCasa2 = 0;
        int puntosJugador = 0;
        int puntosCasa = 0;

        Lector lector = new Lector();
        Escritor escritor = new Escritor();

        escritor.escribir ("Indique su nombre");
        nombre = lector.leerString();
        escritor.escribir("Desea jugar? si/no");
        continuarJuego = lector.leerString();
        continuarJuego = continuarJuego.toUpperCase();

        if (continuarJuego.equals ("SI")) {
            sigueJuego = true;
        }else {
            sigueJuego = false;
        }
        while (sigueJuego) {
            cartaJugador1 = 1+ (int)(Math.random() * 14);
            cartaJugador2 = 1+ (int)(Math.random() * 14);
            cartaCasa1 = 1+ (int)(Math.random() * 14);
            cartaCasa2 = 1+ (int)(Math.random() * 14);
            escritor.escribir("Se le asignaran dos cartas al azar");
            escritor.escribir("Su primer carta es: "+ cartaJugador1);
            escritor.escribir("Su segunda carta es: "+cartaJugador2);

            puntosJugador = cartaJugador1 + cartaJugador2; 
            puntosCasa = cartaCasa1 + cartaCasa2;

            escritor.escribir("Sus total de puntos es: "+puntosJugador);
            escritor.escribir("El total de puntos de la casa es: "+puntosCasa);

            //Quien gana
            if (puntosCasa > puntosJugador) {
                escritor.escribir("El ganador es la casa");
            }
            else 
            {   
                if (puntosCasa < puntosJugador) 
                {
                    escritor.escribir("Usted ha ganado");
                }
                else {
                  
                     escritor.escribir("Se ha dado un empate");    
                }
            }
            
            escritor.escribir("Desea continuar jugando? si/no");
            continuarJuego = lector.leerString();
            continuarJuego = continuarJuego.toUpperCase();
            if (continuarJuego.equals ("SI")) {
                sigueJuego = true;
            }else {
                sigueJuego = false;
            }
        }
    }

}


