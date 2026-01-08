package juego;
// ESTA CLASE ES UN OBJETO QUE REPRESENTAR A UN BLOQUE DE UNA IMAGEN PINTADO EN LA PANTALLA
// EL OBJETO BLOQUE CONTIENE TRES ATRIBUTOS [X, Y, URL]
// [X, Y] SON ATRIBUTOS QUE REPRESENTAN COORDENADAS EN UN PLANO CARTESIANO
// [URL] EL UN ATRIBUTO QUE GUARDA LA RUTA DE LA IMAGEN QUE SE DEBE MOSTRAR PARA FORMAR EL BLOQUE. 
public class Bloque{ 
	private int x;
	private int y; 
	private String url;

	public Bloque() {
	x = 220;
	y = 250;
	url = "img/zelda/link_down.png";
	
	}
	
	public Bloque(int x, int y, String url) {
		this.x = x;
		this.y = y;
		this.url = url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void actualizar() {
	
	}
}
