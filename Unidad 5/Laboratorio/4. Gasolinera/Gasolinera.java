public class Gasolinera {
    public static void main(String[] args) {
        final double PRECIO_LITRO = 650.30;
        String nombreCliente = "";
        double litrosVendidos = 0;
        double totalPagar =0;

        Escritor escritor = new Escritor();
        Lector lector = new Lector();

        escritor.escribir("Indique el nombre del cliente");
        nombreCliente = lector.leerString();
        escritor.escribir("Indique la cantidad de litros de combustible vendidos");
        litrosVendidos = lector.leerDouble();

        totalPagar = PRECIO_LITRO * litrosVendidos;

        escritor.escribir("Nombre cliente: "+ nombreCliente);
        escritor.escribir("Litros vendidos: "+ litrosVendidos);
        escritor.escribir("Monto total a pagar: "+ totalPagar);
        escritor.escribir("Gracias por su preferencia");

    }
}