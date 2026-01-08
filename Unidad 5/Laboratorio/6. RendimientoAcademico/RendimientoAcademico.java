/*
 * @version 7/5/24
 * @author Kendal Trejos Cubero
 */
public class RendimientoAcademico {
    public static void main(String[] args) {
        int porcentajeAprobados = 0;
        final int BUENO = 80;
        final int PESIMO = 50;
        final int MALO = 60;

        Escritor escritor = new Escritor();
        Lector lector = new Lector(); 

        escritor.escribir("Por favor indique el porcentaje de aprobados");
        porcentajeAprobados = lector.leerInt();

        if (porcentajeAprobados >= BUENO) {
            escritor.escribir("El rendimiendo de los estudiantes es bueno");
        }
        else {
            if (porcentajeAprobados >= PESIMO && porcentajeAprobados <= MALO) {
                escritor.escribir("El rendimiento de los estudiantes es malo");     
            }
            else {
                    escritor.escribir("El rendimiento de los estudiantes es pesimo");
                
            }
        } 
    }
}
