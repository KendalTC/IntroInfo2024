package Modelo;
/*
 * @version 30/5/24
 * @author Kendal Trejos Cubero
 */

public class Moneda {
	private int caraActual;
	public static final int ESCUDO = 1;
	public static final int CORONA = 2;

	// Constructor
	public Moneda() {
		this.caraActual = ESCUDO;
	}

	public Moneda(int caraActual) {
		this.caraActual = caraActual;
	}

	// Metodos
	public void setCara(int caraActual) {
		this.caraActual = caraActual;
	}

	public int getCara() {
		return caraActual;
	}

	public void lanzar() {
		int cara = ESCUDO + (int) (Math.random() * CORONA);

		switch (cara) {
		case ESCUDO:
			caraActual = ESCUDO;
			break;
		case CORONA:
			caraActual = CORONA;

			break;

		default:
			System.out.println("ERROR");
			break;
		}

	}

	public String toString() {
		return "Moneda:" + "caraActual: " + this.caraActual;
	}
}
