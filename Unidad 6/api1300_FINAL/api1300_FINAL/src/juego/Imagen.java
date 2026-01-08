package juego;

import utils.Constantes;
import utils.Teclado;

//ESTA CLASE ES UN OBJETO QUE REPRESENTAR A UNA IMAGEN PINTADA EN LA PANTALLA
//EL OBJETO iMAGEN CONTIENE TRES ATRIBUTOS [X, Y, URL]
//[X, Y] SON ATRIBUTOS QUE REPRESENTAN COORDENADAS EN UN PLANO CARTESIANO
//[URL] EL UN ATRIBUTO QUE GUARDA LA RUTA DE LA IMAGEN QUE SE DEBE MOSTRAR PARA FORMAR LA IMAGEN. 

public class Imagen {
	private int x;
	private int y;
	private String url;

	public static final int VELOCIDAD = 7;

	public Imagen() {
		x = 210;
		y = 250;
		url = "img/zelda/link_down.png";

	}

	public Imagen(int x, int y, String url) {
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

	public int getY() {
		return y;
	}

	public String toString() {

		return "Imagen: x: " + x;
	}

	public void actualizar() {
		mover();
		limites();
	}

	private void mover() {
		if (Teclado.abajo) {
			y += VELOCIDAD;

		} else if (Teclado.arriba) {
			y -= VELOCIDAD;

		} else if (Teclado.derecha) {
			x += VELOCIDAD;

		} else if (Teclado.izquierda) {
			x -= VELOCIDAD;

		}

	}

	private void limites() {
		if (x < 0) {
			x = 0;
		} else if (x > Constantes.WIDTH) {
			x = Constantes.WIDTH - Constantes.IMG_WIDTH;
		} else if (y < 0) {
			y = 0;
		} else if (y > Constantes.HEIGHT) {
			y = Constantes.HEIGHT - Constantes.IMG_HEIGHT;
		}

	}

}
