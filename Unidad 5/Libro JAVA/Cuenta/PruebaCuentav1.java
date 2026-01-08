import java.util.Scanner;

public class PruebaCuentav1 {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane", 50.00);
        Cuenta cuenta2 = new Cuenta("John", -7.53);

        System.out.println("El saldo de "+cuenta1.obtenerNombre()+ " es: "+ cuenta1.obtenerSaldo());
        System.err.println("El saldo de "+cuenta2.obtenerNombre()+ " es: "+ cuenta2.obtenerSaldo());

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba el monto a depositar para cuenta1");
        double montoDeposito = entrada.nextDouble();
        System.out.println("Sumando "+montoDeposito+ " al saldo de cuenta1");
        cuenta1.depositar(montoDeposito);

        System.out.println("Saldo de: "+cuenta1.obtenerNombre()+ ": " +cuenta1.obtenerSaldo());
        System.out.println("Saldo de: "+cuenta2.obtenerNombre()+ ": "+cuenta2.obtenerSaldo());

        System.out.println("Escriba el monto a depositar para cuenta2");
        montoDeposito = entrada.nextDouble();
        System.out.println("Sumando "+montoDeposito+ " al saldo de cuenta2");
        cuenta2.depositar(montoDeposito);

        System.out.println("Escriba el monto del retiro para la cuenta1");
        double montoRetiro = entrada.nextDouble();
        cuenta1.retirar(montoRetiro);

        System.out.println("Escriba el monto del retiro para cuenta2");
        montoRetiro = entrada.nextDouble();
        cuenta2.retirar(montoRetiro);

        //Muestra saldos
        System.out.println("Saldo de "+cuenta1.obtenerNombre()+ ": "+cuenta1.obtenerSaldo());
        System.out.println("Saldo de "+cuenta2.obtenerNombre()+ ": "+cuenta2.obtenerSaldo());

    }
}
