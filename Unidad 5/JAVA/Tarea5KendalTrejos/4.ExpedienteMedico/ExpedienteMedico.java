/*
 * @version 10/5/24
 * @author Kendal Trejos Cubero 
 */
import java.util.Scanner;
public class ExpedienteMedico {

    public static void main(String[] args) {
        String nombre ="";
        String sexo = "";
        int edad = 0; 
        String esCasado = ""; 
        int peso = 0;
    
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Digite su nombre");
        nombre = leer.next();

        System.out.println("Digite su edad");
        edad = leer.nextInt(); 
        System.out.println("Digite su sexo masculino/femenino");
        sexo = leer.next();

        System.out.println("Es usted casado? si/no");
        esCasado = leer.next();
        esCasado = esCasado.toUpperCase();
        
        if (esCasado.equals("SI")) {
            esCasado = "CASADO";
        } else {
            esCasado = "no esta casado";
        }
        System.out.println("Digite su peso");
        peso = leer.nextInt();

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+sexo);
        System.out.println("Estado civil: "+esCasado);
        System.out.println("Peso: "+peso);
        
    }
}