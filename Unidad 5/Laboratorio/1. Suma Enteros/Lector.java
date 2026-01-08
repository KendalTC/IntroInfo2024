/*
 * @version 6/5/24
 * @author Kendal Trejos Cubero
 */
import java.util.Scanner;

public class Lector {
    //declarar
    java.util.Scanner leer;

    public Lector() {
        //Inicializar 
        leer = new Scanner(System.in);
        
    }
    //TODAS LAS ACCIONS DEL LECTOR
    public int leerInt(){
        return leer.nextInt();
    }
    public String leerString(){
        return leer.next();
    }
}