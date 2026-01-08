/*
 * @version 6/5/24
 * @author Kendal Trejos Cubero
 */
public class AreaEsfera {
    public static void main(String[] args) {
        int radio = 0;
        double area = 0;
        double PI = 3.1415;

        Lector lector = new Lector();
        Escritor escritor = new Escritor();

        escritor.escribir("Indique el radio del circulo");
        radio = lector.leerInt();

        area = (4*PI) * (radio^2);

        escritor.escribir("El area del circulo es: "+ area);

    }
}