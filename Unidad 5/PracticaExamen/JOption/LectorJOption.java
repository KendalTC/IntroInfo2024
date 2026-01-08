import javax.swing.JOptionPane;
public class Lector {
    public Lector () {

    }
    public char leerChart() {
        return JOptionPane.showInputDialog("").charAt(0);
    }
    public String leerString() {
        return JOptionPane.showInputDialog(null, "");
    }
    public int leerInt () {
        return Integer.parseInt(JOptionPane.showInputDialog(""));
    }
}