
public class Yipy {
	private String marca; 
	private String sabor;
	
	public Yipy(String sabor, String marca) {
		this.marca = marca;
		this.sabor = sabor;
		
	}
	
	public void setMarca(String marca) {
		this.marca = marca; 
		
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public String getSabor() {
		return sabor;
	}
	
	public String toString() {
		return "Yipy :" + "Sabor: " + this.sabor + "Marca: "+ this.marca;
	}
	

}
