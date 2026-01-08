/*
 * @version 7/5/24
 * @author Kendal Trejos
 */
public class NumerosDivisibles {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int residuo = 0;

        Escritor escritor = new Escritor(); 
        Lector lector = new Lector();

        escritor.escribir("Indique el primer numero con el que desea trabajar");
        numero1 = lector.leerInt();
        escritor.escribir("Indique el segundo numero con el que desea trabajar");
        numero2 = lector.leerInt();

        residuo = numero1 % numero2;

        if (residuo == 0) {
            escritor.escribir("El "+numero1+ " Si es divisible entre el numero "+numero2);
        } else {
            escritor.escribir("El primer numero ingresado no es divisible entre el segundo");

            
        }
    }
}
