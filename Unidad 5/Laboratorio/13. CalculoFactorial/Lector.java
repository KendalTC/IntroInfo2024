/*//
 * @version 8/5/24
 * @author Kendal Trejos Cubero  
 */
import javax.swing.JOptionPane; 
public class Lector {
    public Lector () {
    }
    public int leerInt () { 
        return Integer.parseInt(JOptionPane.showInputDialog(""));
    }
}