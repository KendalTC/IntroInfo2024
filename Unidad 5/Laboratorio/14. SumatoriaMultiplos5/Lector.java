/*
 * @version 8/5/24
 * @author Kendal Trejos 
 */
import java.util.Scanner; 
public class Lector {
    Scanner leer; 
    public Lector () {
        leer = new Scanner(System.in);
    }
    public int leerInt () {
        return leer.nextInt();
    }
}