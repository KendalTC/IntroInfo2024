public class Conversiones {
    public static void main (String [] args) {
        String continuarConversion = "";
        boolean continuar = false;
        int eleccion = 0;
        double metros = 0;
        double kilometros =0;
        double kilogramos =0;
        double gramos = 0;
        double celsius = 0; 
        double fahrenheit =0;
        double litros = 0;
        double mililitros = 0;

        Escritor escritor = new Escritor();
        Lector lector = new Lector();

        escritor.escribir("Desea realizar una conversion? si/no");
        continuarConversion = lector.leerString();
        continuarConversion = continuarConversion.toUpperCase();

        if(continuarConversion.equals("SI")) {
            continuar = true;
        }else {
            continuar = false;
        }
        while(continuar) {
            escritor.escribir("Que conversion desea realizar: 1:Metros a kilometros / 2:Kilometros a gramos / 3:Litros a mililitros / 4:Celsius a Fahrenheit / 5: Fahrenheit a Celsius ");
            eleccion = lector.leerInt();

            switch(eleccion) {
                case 1:
                    escritor.escribir("Indique la cantidad de metros que desea convertir a kilometros");
                    metros = lector.leerDouble();

                    kilometros = metros/1000;

                    escritor.escribir("El resultado de la conversion es: "+kilometros);
                break;

                case 2: 
                    escritor.escribir("Indique la cantidad de kilogramos que desea convertir a gramos");
                    kilogramos = lector.leerDouble();

                    gramos = kilogramos * 1000;

                    escritor.escribir("El resultado de la conversion es: " +gramos);
                break;
                    
                case 3: 
                    escritor.escribir("Indique la cantidad de litros que desea convertir a mililitros");
                    litros = lector.leerDouble();

                    mililitros = litros * 1000;

                    escritor.escribir("El resultado de la conversion es: " +mililitros);
                break;

                case 4: 
                    escritor.escribir("Indique la cantidad de grados Celsius que desea convertir a Fahrenheit");
                    celsius = lector.leerDouble();

                    fahrenheit = (celsius * 1.8) +32;

                    escritor.escribir("El resultado de la conversion es: " +fahrenheit);
                break;

                case 5: 
                    escritor.escribir("Indique la cantidad de grados Fahrenheit que desea convertir a grados Celsius");
                    fahrenheit = lector.leerDouble();

                    celsius = (fahrenheit - 32) /1.8;

                    escritor.escribir("El resultado de la conversion es: " +celsius);
                break;

                default: 
                    escritor.escribir("ERROR, solo se permiten opciones entre 1 y 5");
                break;
            }
            escritor.escribir("Desea realizar otra conversion? si/no");
            continuarConversion = lector.leerString();
            continuarConversion = continuarConversion.toUpperCase();

            if(continuarConversion.equals("SI")) {
                continuar = true;
            }else {
                continuar = false;
            }
        }
        escritor.escribir("Gracias por participar");
    }
}