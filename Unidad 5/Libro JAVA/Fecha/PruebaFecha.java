import java.util.Scanner;
public class PruebaFecha {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        Fecha fecha = new Fecha(0, 0, 0);

        System.out.println("Indique el dia");
        int dia = leer.nextInt();
        fecha.establecerDia(dia);

        System.out.println("Indique el mes");
        int mes = leer.nextInt();
        fecha.establecerMes(mes);

        System.out.println("Indique el año");
        int ano = leer.nextInt();
        fecha.establecerAno(ano);

        System.out.println("La fecha es: "+fecha.mostrarFecha());


    }
}
