import javax.swing.JOptionPane;
public class Suma {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma;

        String numeroUno = JOptionPane.showInputDialog("Escriba el primer numero entero");
        numero1 = Integer.parseInt(numeroUno);

        String numeroDos = JOptionPane.showInputDialog("Escriba el segundo numero");
        numero2 = Integer.parseInt(numeroDos);

        suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "La suma de los numeros es: "+suma);
    }
}
