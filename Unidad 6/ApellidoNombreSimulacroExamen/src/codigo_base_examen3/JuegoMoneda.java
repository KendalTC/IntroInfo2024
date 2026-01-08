package codigo_base_examen3;
/*
 * @author Kendal Trejos Cubero 		Carne C4K374
 * 
 */

public class JuegoMoneda {
	int decision = 0;
	boolean continuar = true;
	String nombreJ1 = "";
	String nombreJ2 = "";
	String caraJ1 = "";
	String caraJ2 = "";
	String caraActualJ1 = "";
	String caraActualJ2 = "";
	int puntajeJ1 = 0;
	int puntajeJ2 = 0;
	private static final String CARA_1 = "Corona";
	private static final String CARA_2 = "Escudo";

	int eleccionCara = 0;

	Moneda monedaJ1;
	Moneda monedaJ2;

	public void iniciarJuego(GestorES gestor) {

		gestor.mostrarMensaje("Bienvenido al juego");

		decision = gestor.solicitarEntero("Desean tirar las monedas? \n 1.Si \n2.No");
		if (decision == 1) {
			continuar = true;
		} else {
			continuar = false;
		}

		nombreJ1 = gestor.solicitarString("Jugador 1 indique su nombre");
		Jugador j1 = new Jugador(nombreJ1, 0,  new Moneda());
		monedaJ1 = j1.getMoneda();

		eleccionCara = gestor
				.solicitarEntero(j1.getNombre() + " Con que cara de su moneda desea jugar? \n 1.Corona \n2.Escudo");
		monedaJ1.setCaraActual(eleccionCara);
		switch (eleccionCara) {
		case 1:
			caraJ1 = CARA_1;
			caraJ2 = CARA_2;
			monedaJ2.setCaraActual(2);
			break;

		case 2:
			caraJ1 = CARA_2;
			caraJ2 = CARA_1;
			monedaJ2.setCaraActual(1);

			break;

		default:
			break;
		}
		nombreJ2 = gestor.solicitarString("Jugador 2 indique su nombre");
		Jugador j2 = new Jugador(nombreJ2, 0,new Moneda());
		monedaJ2 =j2.getMoneda();

		while (continuar) {
			gestor.mostrarMensaje(j1.getNombre() + " Vas a jugar con: " + caraJ1);
			gestor.mostrarMensaje(j2.getNombre() + " Vas a jugar con: " + caraJ2);

			gestor.mostrarMensaje("Se han tirado las monedas ");
			monedaJ1.lanzar();
			monedaJ2.lanzar();

			switch (monedaJ1.getCaraActual()) {
			case 1:
				caraActualJ1 = CARA_1;
				break;
				
			case 2:
				caraActualJ1 = CARA_2;
				break;
				
			default:
				break;
			}
			switch (monedaJ2.getCaraActual()) {
			case 1:
				caraActualJ2 = CARA_1;
				break;

			case 2:
				caraActualJ2 = CARA_2;

				break;

			default:
				break;
			}
			gestor.mostrarMensaje(j1.getNombre() + " la cara de tu moneda es: " + caraActualJ1);
			gestor.mostrarMensaje(j2.getNombre() + " la cara de tu moneda es: " + caraActualJ2);

			if ((caraJ1 == caraActualJ1) && (caraJ1 == caraActualJ2)) {
				gestor.mostrarMensaje("El ganador de esta ronda es: " + j1.getNombre());
				puntajeJ1 ++;
				j1.setPuntaje(puntajeJ1);

			} else if ((caraJ2 == caraActualJ2) && (caraJ2 == caraActualJ1)) {
				gestor.mostrarMensaje("El ganador de esta ronda es: " + j2.getNombre());
				puntajeJ2 ++;
				j1.setPuntaje(puntajeJ2);

			} else {
				gestor.mostrarMensaje("Se ha dado un empate");
			}

			decision = gestor.solicitarEntero("Desean tirar de nuevo  las monedas? \n 1.Si \n2.No");

			if (decision == 1) {
				continuar = true;
			} else {
				continuar = false;
			}
		}
		gestor.mostrarMensaje("Ha terminado el juego");
		gestor.mostrarMensaje(j1.getNombre() + " Su total de puntos es: " + j1.getPuntaje());
		gestor.mostrarMensaje(j2.getNombre() + " Su total de puntos es: " + j2.getPuntaje());

		if (j1.getPuntaje() > j2.getPuntaje()) {
			gestor.mostrarMensaje(j1.getNombre() + " Ha ganado el juego");
		} else if (j2.getPuntaje() > j1.getPuntaje()) {
			gestor.mostrarMensaje(j2.getNombre() + "Ha gando el juego");

		} else {
			gestor.mostrarMensaje("Se ha dado un empate");
		}
	}
}
