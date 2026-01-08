package Modelo;

public class Usuario {
	private String nombre; 

	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return "Usuario: Nombre: " + nombre;
	}
}
