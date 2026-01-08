package Modelo;

/*
 * @Author Kendal Trejos Cubero
 * @Version 14/5/24
 */

public class Carta {
	private String valor;
	private String simbolo;

	public Carta() {
		valor = "As";
		simbolo = "Corazon";
	}

	public Carta(String valor, String simbolo) {
		this.valor = valor;
		this.simbolo = simbolo;

	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public String toString() {
		return "Carta: valor: " + valor + " simbolo: " + simbolo;
	}

	public String imprimir() {
		return "El valor es: " + valor + " de " + simbolo;
	}

}
