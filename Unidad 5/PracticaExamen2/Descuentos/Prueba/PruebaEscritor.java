package Prueba;
import javax.swing.JOptionPane;
public class PruebaEscritor {
public PruebaEscritor() {
}

//public void escribir(String mensaje) {
//    JOptionPane.showMessageDialog(null, mensaje);
//}

public String escribir(String message) {
    message = JOptionPane.showInputDialog(message);
    return message;
}

public int escribirInt(int mensaje){
    Integer.parseInt(JOptionPane.showInputDialog(mensaje));
}

}
