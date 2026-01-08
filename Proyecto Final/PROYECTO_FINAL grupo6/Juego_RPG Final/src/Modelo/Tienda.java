package Modelo;

/*
 *@Anthonny Lopez Martinez 		C4G614
 *@Johan Andrey Rivera Martinez		C4I975
 *@Kendal Trejos Cubero 	C4K374
 */
public class Tienda {
	private int pocionVitalidad;
	private int pocionIntercambio;
	private int precioVitalidad;
	private int precioIntercambio;

	public static final int PRECIO_VITALIDAD = 30;
	public static final int PRECIO_INTERCAMBIO = 40;

	public Tienda() {
		pocionVitalidad = 5;
		pocionIntercambio = 4;
		precioVitalidad = PRECIO_VITALIDAD;
		precioIntercambio = PRECIO_INTERCAMBIO;

	}

	public Tienda(int pocionVitalidad, int pocionIntercambio, int precioVitalidad, int precioIntercambio) {
		this.pocionVitalidad = pocionVitalidad;
		this.pocionIntercambio = pocionIntercambio;
		this.precioVitalidad = precioVitalidad;
		this.precioIntercambio = precioIntercambio;
	}

	public int getPocionVitalidad() {
		return pocionVitalidad;
	}

	public void setPocionVitalidad(int pocionVitalidad) {
		this.pocionVitalidad = pocionVitalidad;
	}

	public int getPocionIntercambio() {
		return pocionIntercambio;
	}

	public void setPocionIntercambio(int pocionIntercambio) {
		this.pocionIntercambio = pocionIntercambio;
	}

	public int getPrecioVitalidad() {
		return precioVitalidad;
	}

	public void setPrecioVitalidad(int precioVitalidad) {
		this.precioVitalidad = precioVitalidad;
	}

	public int getPrecioIntercambio() {
		return precioIntercambio;
	}

	public void setPrecioIntercambio(int precioIntercambio) {
		this.precioIntercambio = precioIntercambio;
	}

	public String toString() {
		return "Tienda: pocionVitalidad:" + pocionVitalidad + " pocionIntercambio:" + pocionIntercambio
				+ " precioVitalidad:" + precioVitalidad + " precioIntercambio:" + precioIntercambio;
	}
}
