import java.util.Scanner;
public class GunMan2 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        long velocidadGun = 0; 
        long tiempoEspera = 0;
        long inicioC = 0; 
        long inicio = 0;
        long finC = 0;
        long fin = 0;
        long cronometro = 0; 
        long tiempoAccion = 0;
        boolean iniciaCronometro;
       

        while (true) {
            velocidadGun = 200 + (int)(Math.random() *600);
            tiempoEspera = 100 + (int)(Math.random() *5000);

            iniciaCronometro = true;

            System.out.println("Precione la tecla ENTER para jugar...");
            leer.nextLine();

            inicioC =System.currentTimeMillis();

            while (iniciaCronometro) {
                finC = System.currentTimeMillis();
                cronometro = finC - inicioC;
                if (cronometro > tiempoEspera) {
                    iniciaCronometro = false;
                }
            }

            System.out.println("FIRE!!!");
            inicio = System.currentTimeMillis();
            leer.nextLine();
            fin  = System.currentTimeMillis();
            tiempoAccion = fin-inicio;

            if (tiempoAccion < velocidadGun) {
                System.out.println("WIND!!");

            } else {
                System.out.println("LOST!!!");
                
            }

            System.out.println("Su tiempo es: " +tiempoAccion);
            System.out.println("El tiempo de GunMan es: "+ velocidadGun);

        }
    }
}
