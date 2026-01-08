/*
 * @version 8/5/24
 * @author Kendal Trejos Cubero 
 */
public class PiramideNumeros {
    public static void main (String args []) {
        int altura = 1; 

        Escritor escritor = new Escritor(); 
        Lector lector = new Lector();
        String piramide = "";

        escritor.escribir ("Indique la altura o la base de la piramide que desea dibujar");
        altura = lector.leerInt();
        
        
        for (int i = 1; i <= altura; i++) {
            
            for (int f = 1; f <= i; f++) {
                piramide = piramide + f;
            } 
            piramide = piramide + "\n";
        }
        escritor.escribir(piramide);
    }
}
