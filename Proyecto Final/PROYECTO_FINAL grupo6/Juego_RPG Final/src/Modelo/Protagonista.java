package Modelo;

/*
 *@Anthonny Lopez Martinez 		C4G614
 *@Johan Andrey Rivera Martinez		C4I975
 *@Kendal Trejos Cubero 	C4K374
 */
public class Protagonista {
	private String nombre;
	private String nombreAtaque;
	private int vitalidad;
	private int danoAtaque;
	private int pocionVitalidad;
	private int pocionIntercambio;
	private int dinero;
	private int victorias;
	private int derrotas;

	public Protagonista() {
		nombre = "";
		nombreAtaque = "";
		vitalidad = 100;
		danoAtaque = 50;
		pocionVitalidad = 0;
		pocionIntercambio = 0;
		dinero = 100;
		victorias = 0;
		derrotas = 0;
	}

	public Protagonista(String nombre, String nombreAtaque, int vitalidad, int danoAtaque, int pocionVitalidad,
			int pocionIntercambio, int dinero, int victorias, int derrotas) {
		this.nombre = nombre;
		this.nombreAtaque = nombreAtaque;
		this.vitalidad = vitalidad;
		this.danoAtaque = danoAtaque;
		this.pocionVitalidad = pocionVitalidad;
		this.pocionIntercambio = pocionIntercambio;
		this.dinero = dinero;
		this.victorias = victorias;
		this.derrotas = derrotas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombreAtaque(String nombreAtaque) {
		this.nombreAtaque = nombreAtaque;
	}

	public String getNombreAtaque() {
		return nombreAtaque;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}

	public int getVitalidad() {
		return vitalidad;
	}

	public void setDanoAtaque(int danoAtaque) {
		this.danoAtaque = danoAtaque;
	}

	public int getDanoAtaque() {
		return danoAtaque;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getDinero() {
		return dinero;
	}

	public void setPocionVitalidad(int pocionVitalidad) {
		this.pocionVitalidad = pocionVitalidad;
	}

	public int getPocionVitalidad() {
		return pocionVitalidad;
	}

	public void setPocionIntercambio(int pocionIntercambio) {
		this.pocionIntercambio = pocionIntercambio;
	}

	public int getPocionIntercambio() {
		return pocionIntercambio;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public String toString() {
		return "Protagonista nombre=" + nombre + ", nombreAtaque=" + nombreAtaque + ", vitalidad=" + vitalidad
				+ ", danoAtaque=" + danoAtaque + ", pocionVitalidad=" + pocionVitalidad + ", pocionIntercambio="
				+ pocionIntercambio + ", dinero=" + dinero + ", victorias=" + victorias + ", derrotas=" + derrotas;
	}

}
