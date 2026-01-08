package Modelo;

/*
 * @Author Kendal Trejos 
 * @Version 12/6/2024
 */
public class Dado {
	private int valor;
	private int caras;

	public Dado() {
		caras = 6;
		valor = 3;
	}

	public Dado(int caras) {
		this.valor = 1;
		this.caras = caras;
	}

	public void setCaras(int caras) {
		this.caras = caras;
	}

	public int getCaras() {
		return caras;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void tirar() {
		this.valor = 1 + (int) (Math.random() * caras);

	}

	public String toString() {
		return "Dados: valor: " + this.valor + "Caras:" + caras;
	}

}
