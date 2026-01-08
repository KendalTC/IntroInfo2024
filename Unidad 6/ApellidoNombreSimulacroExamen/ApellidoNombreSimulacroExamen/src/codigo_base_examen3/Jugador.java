package codigo_base_examen3;

public class Jugador {
	private String nombre;
	private int puntaje;
	private Moneda moneda;

	public Jugador() {

	}
	
	public Jugador(String nombre, int puntaje, Moneda moneda) {
		this.nombre = nombre;
		this.puntaje = puntaje;
		this.moneda = moneda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntaje=" + puntaje + ", moneda=" + moneda + "]";
	}

}
