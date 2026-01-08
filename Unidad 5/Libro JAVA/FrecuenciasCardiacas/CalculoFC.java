import java.util.Scanner;
public class CalculoFC {
    public static void main(String[] args) {
    
        FrecuenciasCardiacas fc = new FrecuenciasCardiacas(null, null, null, 0, 0, 0, 0, 0);

        Scanner leer = new Scanner(System.in);

        System.out.println("Indique su nombre");
        String nombre = leer.nextLine();
        fc.setNombre(nombre);

        System.out.println("Indique su apellido");
        String apellido = leer.next();
        fc.setApellido(apellido);

        System.out.println("Indique el dia de su nacimiento en numero (1/30)");
        int diaNacimiento = leer.nextInt();
        fc.setDiaNacimiento(diaNacimiento);

        System.out.println("Indique el mes de su nacimiento");
        String mesNacimiento = leer.next();
        fc.setMesNacimiento(mesNacimiento);

        System.out.println("Indique el año de su nacimiento");
        int anoNacimiento = leer.nextInt();
        fc.setAnoNacimiento(anoNacimiento);

        //Calculos
        fc.setEdad(anoNacimiento);
        int edad = fc.getEdad();


        fc.setFCMax(edad);
        int fCMax = fc.getFCMax(); 

        fc.setFCEsperada(fCMax);

        System.out.println();
        System.out.println("Nombre: " +fc.getNombre());
        System.out.println("Apellido: "+fc.getApellido());
        System.out.println("Edad: "+fc.getEdad());
        System.out.println("Frecuencia cardiaca maxima: "+fc.getFCMax());
        System.out.println("Frecuencia cardiaca esperada: "+fc.getFCEsperada());

    }
}

