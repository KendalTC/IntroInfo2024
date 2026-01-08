/*
 * @author Kendal Trejos Cubero 
 * @version 7/5/24
 */
import java.util.Scanner;
public class Lector {
    Scanner leer; 
    public Lector () {
        leer = new Scanner(System.in);
    }
    public String leerString () {
        return leer.next();
    }
    public int leerInt () {
        return leer.nextInt();
    }
}