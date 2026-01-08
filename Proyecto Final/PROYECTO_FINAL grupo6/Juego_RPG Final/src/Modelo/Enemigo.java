package Modelo;

/*
 *@Anthonny Lopez Martinez 		C4G614
 *@Johan Andrey Rivera Martinez		C4I975
 *@Kendal Trejos Cubero 	C4K374
 */
public class Enemigo {
	private String nombre;
	private String nombreAtaque;
	private int vitalidad;
	private int danoAtaque;

	public Enemigo() {
		nombre = "";
		nombreAtaque = "";
		vitalidad = 100;
		danoAtaque = 50;
	}

	public Enemigo(String nombre, String nombreAtaque, int vitalidad, int danoAtaque) {
		this.nombre = nombre;
		this.nombreAtaque = nombreAtaque;
		this.vitalidad = vitalidad;
		this.danoAtaque = danoAtaque;
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

	public String toString() {
		return "Enemigo nombre=" + nombre + ", nombreAtaque=" + nombreAtaque + ", vitalidad=" + vitalidad
				+ ", danoAtaque=" + danoAtaque;
	}

}
