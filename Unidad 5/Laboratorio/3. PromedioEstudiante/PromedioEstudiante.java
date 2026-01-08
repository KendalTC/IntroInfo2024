/*
 * @version 7/5/24
 * @author Kendal Trejos Cubero 
 */
public class PromedioEstudiante {
    public static void main(String[] args) {
        String nombre = "";
        double promedio1 = 0;
        double promedio2 =0;
        double promedio3 = 0;
        double promedio4 = 0;
        double promedioTotal = 0; 

        Escritor escritor = new Escritor ();
        Lector lector = new Lector();

        escritor.escribir("Por favor indique su nombre");
        nombre = lector.leerString();
        escritor.escribir("Por favor indique el promedio de su primer curso (escala 1-100)");
        promedio1 = lector.leerDouble();
        escritor.escribir("Por favor indique el promedio de su segundo curso (escala 1-100)");
        promedio2 = lector.leerDouble();
        escritor.escribir("Por favor indique el promedio de su tercer curso (escala 1-100)");
        promedio3 = lector.leerDouble();
        escritor.escribir("Por favor indique el promedio de su cuarto curso (escala 1-100)");
        promedio4 = lector.leerDouble();

        promedioTotal = (promedio1+promedio2+promedio3+promedio4) /4;

        escritor.escribir("El promedio cuatrimestral del estudiante: "+nombre + " es: "+promedioTotal);
    }
}