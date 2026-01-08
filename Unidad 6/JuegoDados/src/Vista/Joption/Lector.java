/*
 * @author Kendal Trejos Cubero
 * @version 30/5/24
 */

package Vista.Joption;
import javax.swing.JOptionPane;
public class Lector {
    public Lector() {
    }

        public double leerDouble(){
            return Double.parseDouble (JOptionPane.showInputDialog (""));
        }

        public String leerString () {
            return JOptionPane.showInputDialog("");
        }
        
        public int leerInt() {
        	return Integer.parseInt(JOptionPane.showInputDialog(""));
        }
}
