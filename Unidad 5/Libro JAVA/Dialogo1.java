import javax.swing.JOptionPane;
public class Dialogo1 {
    public static void main(String [] args) {

        String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
        String mensaje = ("Bienvenido," +nombre+ " a la programacion con Java");

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
