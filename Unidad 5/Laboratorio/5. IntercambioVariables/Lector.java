/*
 * @version 7/5/24
 * @author Kendal Trejos
 */
import javax.swing.JOptionPane;
public class Lector { 
    public Lector() {
    }

        public int leerInt(){
            return Integer.parseInt (JOptionPane.showInputDialog(""));
        }
}
