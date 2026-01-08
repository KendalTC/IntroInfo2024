/*
 * @version 10/5/24
 * @author Kendal Trejos Cubero 
 */
import java.util.Scanner;
public class CantidadAgua {
    public static void main(String[] args) {
        String genero = "";

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor indique su genero hombre/mujer");
        genero = leer.next();
        genero = genero.toUpperCase();

        if (genero.equals("HOMBRE")) {
            System.out.println("Usted debe tomar 1 litro de agua diariamente");
            
        } else {
            if (genero.equals("MUJER")){
                System.out.println("Usted debe tomar 1.5 litros de agua diariamente");
            } else {
                System.out.println("EROR, solo se permite: Hombre/Mujer");
            }
        }
    }  
}


                
            
            
        
    
