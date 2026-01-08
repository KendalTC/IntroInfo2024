package Grafico;

public class Tapita {
	private String sabor; 
	
	public Tapita() {
		this.sabor = "Chocolate";
	}
	
	public Tapita(String sabor) {
		this.sabor = sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public String getSabor() {
		return sabor;
	}
	
	public String toString() {
		return "Tapita :" + "Sabor: " + this.sabor;
	}
 	
}
