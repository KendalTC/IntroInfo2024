package codigo_base_examen3;

public class Moneda {
	private int caraActual;
	
	public static final int CORONA = 1;
	public static final int ESCUDO = 2;

	public Moneda() {
		// atributos inicializados vacios
	}
	
	public Moneda(int caraActual) {
		this.caraActual = caraActual;
	}

	public int getCaraActual() {
		return caraActual;
	}

	public void setCaraActual(int caraActual) {
		this.caraActual = caraActual;
	}

	public void lanzar () {
		int cara = 1 + (int)(Math.random()*2);
		switch (cara) {
		case 1: 
			caraActual = CORONA;
			break;
		case 2:
			caraActual = ESCUDO;
			break;
		default:
			caraActual = ESCUDO;
			break;
		}
	}
	
	public String toString() {
		return "Moneda [caraActual=" + caraActual + "]";
	}
}
