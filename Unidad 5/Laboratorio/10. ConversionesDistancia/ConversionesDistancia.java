/*
 * @version 7/5/24
 * @author Kendal Trejos 
 */
public class ConversionesDistancia {
    public static void main(String[] args) {
        final double OPERADOR = 3.6;
        int indicadorElegido = 0;
        double metros = 0;
        double kilometros = 0;
        double resultadoKilometros = 0; 
        double resultadoMetros =0; 

        Escritor escritor = new Escritor();
        Lector lector = new Lector();

        escritor.escribir("Digite 1 si desea convertir de Km/h a m/s o digite 2 si desea convertir de m/s a Km/h");
        indicadorElegido = lector.leerInt();

        switch (indicadorElegido) {
            case 1: 
                escritor.escribir("Indique la cantidad de kilometros por hora que desea convertir");
                kilometros = lector.leerDouble();
                resultadoMetros = kilometros / OPERADOR; 
                escritor.escribir("El resultado al convertir "+kilometros+ " Km/h a m/s es: "+resultadoMetros);
                break;

            case 2: 
                escritor.escribir("Indique la cantidad de metros por segundo que desea convertir");
                metros = lector.leerDouble();
                resultadoKilometros = metros * OPERADOR; 
                escritor.escribir ("El resultado al convertir "+metros + " m/s a Km/h es: "+ resultadoKilometros);
                break;
        
            default:
                escritor.escribir("EROR, solo se permite ingresar 1 o 2");
                break;
        }
    }
}
