/*
*@version 7/5/24
*@author Kendal Trejos Cubero
*/
public class Encuesta {
    public static void main(String[] args) {
        String lugar = "";
        String comida = "";
        String color = "";
        String cancion = "";

        Escritor escritor = new Escritor();
        Lector lector = new Lector();

        escritor.escribir("Por favor indique cual es su lugar favorito");
        lugar = lector.leerString();
        escritor.escribir("Por favor indique cual es su comida favorita");
        comida = lector.leerString();
        escritor.escribir("Por favor indique cual es su color favorito");
        color = lector.leerString();
        escritor.escribir("Por favor indique cual es su cancion favorita");
        cancion = lector.leerString();

        escritor.escribir("Su lugar favorito es: " + lugar);
        escritor.escribir("Su comida favorita es: " + comida);
        escritor.escribir("Su color favorito es: " + color);
        escritor.escribir("Su cancion favorita es: " + cancion);
        escritor.escribir("Gracias por su participacion, fue de gran ayuda para la encuesta");

    }
}