/*
 * @version 7/5/24
 * @author Kendal Trejos Cubero
 */
import java.util.Scanner;

public class Lector {
    java.util.Scanner leer;

    public Lector() {
        leer = new Scanner(System.in);
        
    }
    public String leerString(){
        return leer.nextLine();
    }
}