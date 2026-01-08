package codigo_base_examen3;

public class PruebaJuego {
	/*
	 * NOMBRE COMPLETO DEL ESTUDIANTE CARNÉ
	 */
	public static void main(String[] args) {

		GestorES gestor = new GestorES();
		JuegoMoneda juegoMoneda = new JuegoMoneda();

		juegoMoneda.iniciarJuego(gestor);

	}

}
