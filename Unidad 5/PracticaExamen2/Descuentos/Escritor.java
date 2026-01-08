import javax.swing.JOptionPane;
public class Escritor {
public Escritor() {
}

public void escribir(String mensaje) {
    JOptionPane.showMessageDialog(null, mensaje);
}

//public void escribirString(String message) {
//    message = JOptionPane.showInputDialog(message);
//}

//public void escribirInt(String mensaje){
//    Integer.parseInt(JOptionPane.showInputDialog(mensaje));
//}

}