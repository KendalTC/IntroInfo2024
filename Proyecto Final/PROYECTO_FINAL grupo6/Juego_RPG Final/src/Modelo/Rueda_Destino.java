package Modelo;

/*
 *@Anthonny Lopez Martinez 		C4G614
 *@Johan Andrey Rivera Martinez		C4I975
 *@Kendal Trejos Cubero 	C4K374
 */
public class Rueda_Destino {
	private int maximo;
	private int minimo;
	private int valor;

	public Rueda_Destino() {
		maximo = 5;
		minimo = 1;
		valor = 2;
	}

	public Rueda_Destino(int maximo, int minimo, int valor) {
		super();
		this.maximo = maximo;
		this.minimo = minimo;
		this.valor = valor;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setRandom(int random) {
		this.valor = random;
	}

	public int getRandom() {
		return valor;
	}

	public String toString() {
		return "Rueda_Destino maximo=" + maximo + ", minimo=" + minimo + ", valor=" + valor;
	}

	public int girar(int minimo, int maximo) {
		return valor = minimo + (int) (Math.random() * (maximo - minimo + 1));
	}

}
