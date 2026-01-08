import javax.swing.JOptionPane;
public class Operaciones {
    public static void main(String []args) {
        String continuarOperacion ="";
        boolean continuar = false;
        int operacion = 0;
        int num1 = 0;
        int num2 = 0;
        int sumatoria = 0;
        int factorial = 1;
        int contador =0;
        double division =0;


        continuarOperacion = JOptionPane.showInputDialog("Desea realizar una operacion? si/no");
        continuarOperacion = continuarOperacion.toUpperCase();

        if(continuarOperacion.equals("SI")) {
            continuar = true;
        }else {
            continuar = false;
        }

        while(continuar) {
            String eleccion = JOptionPane.showInputDialog("Inique la operacion que desea realizar: 1:sumatoria / 2:factorial / 3:Division");
            operacion = Integer.parseInt(eleccion);
            
            switch(operacion) {
                case 1:
                    String numero = JOptionPane.showInputDialog("Indique el numero al que desea averiguar su sumatoria");
                    num1 = Integer.parseInt(numero);
                    while (contador < num1) {
                        contador = contador+1;
                        sumatoria = sumatoria + contador;

                        
                    }
                    JOptionPane.showMessageDialog(null, sumatoria);
                    contador = 0;
                    sumatoria = 0;
                
                break;

                case 2: 
                    numero = JOptionPane.showInputDialog("Indique el numero al que desea calcular la factorial");
                    num1 = Integer.parseInt(numero);
                    contador =1;
                    while (contador != num1) {
                        
                        contador = contador +1;
                        factorial = factorial * contador;

                    }
                    JOptionPane.showMessageDialog(null, factorial);
                    contador =1;
                    factorial=1;
                break;

                case 3:
                    numero = JOptionPane.showInputDialog("Indique el primer numero que desea dividir");
                    num1 = Integer.parseInt(numero);

                    numero = JOptionPane.showInputDialog("Indique el segundo numero que desea dividir");
                    num2 = Integer.parseInt(numero);

                    division = num1/num2;

                    JOptionPane.showMessageDialog(null, "El resultado de la division es: "+division);
                break;

                default:
                JOptionPane.showMessageDialog(null,"Error, solo se permiten numeros entre 1 y 3");

                break;
            
            }
            continuarOperacion = JOptionPane.showInputDialog("Desea realizar otra operacion? si/no");
            continuarOperacion = continuarOperacion.toUpperCase();

            if(continuarOperacion.equals("SI")) {
                continuar = true;
            }else {
                continuar = false;
            }

        }

    }   
}