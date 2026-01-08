package Modelo;

public class Ruleta {
	private String color;
	private String extremidad;
	public static final int ROJO = 1;
	public static final int AZUL = 2;
	public static final int VERDE = 3;
	public static final int AMARILLO = 4;

	public static final int MANO_DERECHA = 1;
	public static final int MANO_IZQUIERDA = 2;
	public static final int PIE_DERECHO = 3;
	public static final int PIE_IZQUIERDO = 4;
	
	public Ruleta() {
		this.color = "ROJO";
		this.extremidad = "MANO DERECHA";
	}

	public Ruleta(String extremidad, String color) {
		this.color = color;
		this.extremidad = extremidad;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setExtremidad(String extremidad) {
		this.extremidad = extremidad;
	}

	public String getExtremidad() {
		return extremidad;
	}

	public void girar() {
		int extremidad = MANO_DERECHA + (int) (Math.random() * PIE_IZQUIERDO);
		int color = ROJO + (int) (Math.random() * AMARILLO);

		switch (extremidad) {
		case MANO_DERECHA:
			this.extremidad = "MANO DERECHA";
			break;

		case MANO_IZQUIERDA:
			this.extremidad = "MANO IZQUIERDA";
			break;

		case PIE_DERECHO:
			this.extremidad = "PIE DERECHO";
			break;

		case PIE_IZQUIERDO:
			this.extremidad = "PIE IZQUIERDO";
			break;

		default:
			System.out.println("ERROR");
			break;

		}

		switch (color) {
		case ROJO:
			this.color = "ROJO";
			break;

		case AZUL:
			this.color = "AZUL";

			break;

		case VERDE:
			this.color = "VERDE";
			break;

		case AMARILLO:
			this.color = "AMARILLO";
			break;

		default:
			System.out.println("ERROR");
			break;
		}

	}

	public String toString() {
		return "Ruleta: " + " extremidad: "+ getExtremidad() + " color " + getColor();
	}

}
