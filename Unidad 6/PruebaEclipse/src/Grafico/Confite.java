package Grafico;

public class Confite {
	private String nombreConfite;
	private String sabor;

	public Confite(String nombreConfite, String sabor) {
		this.nombreConfite = nombreConfite;
		this.sabor = sabor;

	}

	public void setNombre(String nombreConfite) {
		this.nombreConfite = nombreConfite;
	}

	public String getNombre() {
		return nombreConfite;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

}
