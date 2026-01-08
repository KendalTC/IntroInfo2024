/*
 * @version 7/5/24
 * @author Kendal Trejos Cubero
 */
public class PlantacionArboles {
    public static void main(String[] args) {
        final double DIST_ARBOL = 4.5;
        final double AGRICULTOR_PEQ = 50; 
        final double AGRICULTOR_MED = 200;
        final double AGRICULTOR_GRAN = 2001;
        double terreno =0;
        double cantidadArboles =0;

        Escritor escritor = new Escritor();
        Lector lector = new Lector();

        escritor.escribir("Por favor, indique el terreno disponible para sembrar los arboles, en metros cuadrados");
        terreno = lector.leerDouble();

        cantidadArboles = terreno / DIST_ARBOL;

        if (cantidadArboles <= AGRICULTOR_PEQ) {
            escritor.escribir("Usted puede plantar: "+cantidadArboles+ " arboles por lo que es un AGRICULTOR PEQUEÑO");
        
        } else {
            if (cantidadArboles <= AGRICULTOR_MED) {
                escritor.escribir("Usted puede plantar: "+cantidadArboles+ " arboles por lo que es un AGRICULTOR MEDIANO");

            } else {
                if (cantidadArboles >= AGRICULTOR_GRAN) {
                    escritor.escribir("Usted puede plantar: "+cantidadArboles+ " arboles por lo que es un AGRICULTOR GRANDE");
                    
                }
                
            }
        }
    }
}