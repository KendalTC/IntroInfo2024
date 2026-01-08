public class Descuentos {
    public static void main (String [] args) {
        char tipoCliente = ' ';
        String continua = "";
        boolean continuaProgra = false;
        final double DESCUENTO_A = 0.10;
        final double DESCUENTO_B = 0.20;
        final double DESCUENTO_C = 0.30;
        final double DESCUENTO_D =0.40;
        double precioIncial = 0;
        double precioFinal = 0;

        Escritor escritor = new Escritor();
        Lector lector = new Lector();

        escritor.escribir("Desea comenzar? si/no");
        continua = lector.leerString();
        continua = continua.toUpperCase();

        if(continua.equals("SI")) {
            continuaProgra = true;
        }else {
            continuaProgra = false;
        }

        while(continuaProgra) {
            escritor.escribir("Indique el precio del articulo comprado");
            precioIncial = lector.leerDouble();

            escritor.escribir("Indique el tipo de cliente (A ,B ,C, D)");
            tipoCliente = lector.leerChar();
            tipoCliente = Character.toUpperCase(tipoCliente);
            
            switch (tipoCliente) {
                case 'A':
                    precioFinal = precioIncial - (precioIncial * DESCUENTO_A);
                    escritor.escribir("El precio final del producto es: "+precioFinal);

                break;

                case 'B': 
                    precioFinal = precioIncial - (precioIncial * DESCUENTO_B);
                    escritor.escribir("El precio fianl del producto es: "+precioFinal);

                break;

                case 'C': 
                    precioFinal = precioIncial -(precioIncial * DESCUENTO_C);
                    escritor.escribir("El precio final del producto es: "+precioFinal);

                break;

                case 'D': 
                    precioFinal = precioIncial -(precioIncial * DESCUENTO_D);
                    escritor.escribir("El precio final del producto es: "+precioFinal);

                break;
            
                default:
                    escritor.escribir("Error solo se permiten numeros entre 1 y 4");
                    break;
            }
            escritor.escribir("Desea realizar otro descuento? si/no");
            continua = lector.leerString();
            continua = continua.toUpperCase();

            if(continua.equals("SI")) {
                continuaProgra = true;
            }else {
                continuaProgra = false;
            }
        }
    }
}
