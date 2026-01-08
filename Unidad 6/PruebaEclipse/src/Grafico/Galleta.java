package Grafico;

public class Galleta {
private String sabor; 

	public Galleta(String sabor) {
		this.sabor = sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public String getSabor() {
		return sabor;
	}
	
		public String toString() {
			return "Galleta: " + "Sabor: " + this.sabor;
		}
}
