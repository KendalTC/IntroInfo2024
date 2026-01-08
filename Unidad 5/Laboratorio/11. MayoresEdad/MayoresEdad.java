/*
 * @version 7/5/24
 * @author Kendal Trejos Cubero 
 */
public class MayoresEdad {
    public static void main(String[] args) {
        int edad = 0;
        int mayoresEdad = 0;
        String nombre = "";
        
        Escritor escritor = new Escritor();
        Lector lector = new Lector(); 

        for (int i = 0; i < 5; i++) {
            escritor.escribir("Digite su nombre");
            nombre = lector.leerString();
            escritor.escribir("Indique su edad");
            edad = lector.leerInt();

            if (edad >= 18) {
                mayoresEdad = mayoresEdad+1;
            }
        }

        escritor.escribir("La cantidad de personas mayores de edad es: "+mayoresEdad);
    }
}

