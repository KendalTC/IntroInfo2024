import java.util.Scanner;
public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        Empleado empleado1 = new Empleado(null, null, 0);
        Empleado empleado2 = new Empleado(null, null, 0);

        System.out.println("Indique el nombre del empleado1");
        String nombre = leer.next();
        empleado1.setNombre(nombre);

        System.out.println("Indique el apellido del empleado1");
        String apellido = leer.next(); 
        empleado1.setApellido(apellido);

        System.out.println("Indique el salario mensual del empleado 1");
        double salarioMensual = leer.nextInt();
        empleado1.setSalarioM(salarioMensual);

        
        System.out.println("Indique el nombre del empleado2");
        nombre = leer.next();
        empleado2.setNombre(nombre);

        System.out.println("Indique el apellido del empleado2");
        apellido = leer.next(); 
        empleado2.setApellido(apellido);

        System.out.println("Indique el salario mensual del empleado2");
        salarioMensual = leer.nextInt();
        empleado2.setSalarioM(salarioMensual);

        System.out.println("El salario anual de los empleados es:");
        System.out.println(empleado1.getNombre()+ empleado1.getApellido()+ " : " +(empleado1.getSalarioM()*12));
        System.out.println(empleado2.getNombre()+ empleado2.getApellido()+ " : " + (empleado2.getSalarioM()*12));

        System.out.println("");
        System.out.println("Se le sumara el 10% al salario mensual");
        System.out.println("");
        System.out.println("El salario anual de los empleados con la suma del 10% es:");
        System.out.println(empleado1.getNombre()+empleado1.getApellido()+ " : " +((empleado1.getSalarioM()*12) *1.1));
        System.out.println(empleado2.getNombre()+empleado2.getApellido()+ " : " + ((empleado2.getSalarioM()*12)*1.1));
    }
}
