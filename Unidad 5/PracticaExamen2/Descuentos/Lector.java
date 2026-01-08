import javax.swing.JOptionPane;
public class Lector {
    public Lector() {

    }

    public String leerString() {
        return JOptionPane.showInputDialog("");
    }

    public double leerDouble() {
        return Double.parseDouble(JOptionPane.showInputDialog(""));
    }

    public char leerChar() {
        return JOptionPane.showInputDialog("").charAt(0);
    }

    public int leerInt() {
        return Integer.parseInt(JOptionPane.showInputDialog(""));
    }
}
