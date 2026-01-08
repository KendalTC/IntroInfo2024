package Grafico;

public class Chiky {
	private String sabor;
	private String marca;
	private int contenido;

	public Chiky(String sabor, String marca, int contenido) {
		contenido = 6;
		this.sabor = sabor;
		this.marca = marca;
		this.contenido = contenido;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public int getContenido() {
		return contenido;
	}

	public void comerGalleta() {
		contenido -= 1;

	}
}
