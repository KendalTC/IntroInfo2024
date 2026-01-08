/*
 * @verion 7/5/24
 * @author Kendal Trejos Cubero
 */
public class CalculoIMC {
    public static void main(String[] args) {
        final double IMC_BAJO = 18;
        final double IMC_NORMAL = 24.9;
        final double IMC_SOBREPESO = 26.9;
        final double IMC_OBESIDAD = 27;
        double peso = 0; 
        double estatura = 0; 
        double imc = 0; 

        Escritor escritor = new Escritor(); 
        Lector lector = new Lector(); 

        escritor.escribir("Por favor indique su peso (Kg)");
        peso = lector.leerDouble();
        escritor.escribir("Por favor indique su estatura (Metros) ej: 1.8");
        estatura = lector.leerDouble();
        imc = peso / (Math.pow(estatura,2));
    
        if (imc < IMC_BAJO) {
            escritor.escribir("Su indice de masa muscular es: "+imc+ " que se clasifica como bajo");
       
        } else {
            if (imc <= IMC_NORMAL) {
                escritor.escribir("Su indice de masa muscular es: "+imc+ " que se clasifica como normal");

            } else {
                if (imc <= IMC_SOBREPESO) {
                    escritor.escribir("Su indice de masa muscular es: "+imc+ " que se clasifica como sobrepeso");

                } else {
                    if (imc > IMC_OBESIDAD) {
                        escritor.escribir("Su indice de masa muscular es: "+imc+ "que se clasifica como obesidad");
                    }
                }
            }
        }   
    }
}
