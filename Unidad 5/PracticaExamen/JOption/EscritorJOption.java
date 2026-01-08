import javax.swing.JOptionPane;
public class Escritor {
    public Escritor () {

    }
    public void escribir (String mensaje) {
        String entrada = JOptionPane.showInputDialog(null,mensaje);
    }
}
