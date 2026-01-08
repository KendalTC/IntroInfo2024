package Controlador;

/*
 *@Anthonny Lopez Martinez 		C4G614
 *@Johan Andrey Rivera Martinez		C4I975
 *@Kendal Trejos Cubero 	C4K374
 */
import Modelo.Enemigo;
import Modelo.Protagonista;
import Modelo.Rueda_Destino;
import Modelo.Tienda;
import Vista.Terminal.Narrador;

public class Interfaz {

	Protagonista prota = new Protagonista();
	Enemigo enemigo = new Enemigo();
	Rueda_Destino rueda = new Rueda_Destino();
	Narrador narrar = new Narrador();
	Tienda tienda = new Tienda();

	public void iniciarJuego() {
		boolean repetirInicio = false;
		narrar.instrucciones();
		narrar.historia();
		do {
			int eleccionInicio = narrar.menuInicio();
			switch (eleccionInicio) {

			case 1:// inciar
				seleccionPersonaje();
				break;

			case 2:// salir
				narrar.terminarJuego(prota);
				System.exit(0);
				break;

			default:
				narrar.error();
				repetirInicio = true;
				break;
			}
		} while (repetirInicio);
	}

	public void seleccionPersonaje() {
		boolean hayError = false;
		do {
			int eleccionPersonaje = narrar.eleccionPersonaje();
			switch (eleccionPersonaje) {

			case 1:// Predeterminado
				switch (rueda.girar(1, 4)) {
				case 1: // prota1
					Protagonista prota1 = new Protagonista("Gandalf", "Onda Vital", rueda.girar(200, 250),
							rueda.girar(150, 250), 0, 0, 100, 0, 0);
					prota = prota1;
					hayError = false;
					break;

				case 2: // prota2
					Protagonista prota2 = new Protagonista("Pedro Paramo", "Abandonar a sus hijos",
							rueda.girar(200, 250), rueda.girar(150, 250), 0, 0, 100, 0, 0);
					prota = prota2;
					hayError = false;
					break;

				case 3: // prota3
					Protagonista prota3 = new Protagonista("Chopper", "Llorar", rueda.girar(200, 250),
							rueda.girar(150, 250), 0, 0, 100, 0, 0);
					prota = prota3;
					hayError = false;
					break;

				case 4: // prota4
					Protagonista prota4 = new Protagonista("Antonio", "Quejarse", rueda.girar(200, 250),
							rueda.girar(150, 250), 0, 0, 100, 0, 0);
					prota = prota4;
					hayError = false;
					break;

				default:
					narrar.error();
					hayError = true;
					break;
				}
				break;

			case 2:// Personalizado
				String nombre = narrar.nombreProta();
				String nombreAtaque = narrar.nombreAtaque();

				Protagonista prota5 = new Protagonista(nombre, nombreAtaque, rueda.girar(200, 250),
						rueda.girar(150, 250), 0, 0, 100, 0, 0);
				prota = prota5;
				hayError = false;
				break;

			default:
				narrar.error();
				hayError = true;
				break;
			}
		} while (hayError);
		narrar.estadoProta(prota);
		interfazPrincipal();
	}

	public void interfazPrincipal() {
		boolean repetirMenu = false;
		do {
			int eleccionMenuPrincipal = narrar.menuPrincipal();

			switch (eleccionMenuPrincipal) {
			case 1:// Explorar
				interfazExploracion();
				repetirMenu = true;
				break;

			case 2:// estado
				narrar.estadoProta(prota);
				repetirMenu = true;
				break;

			case 3:// Tienda
				interfazTienda();
				repetirMenu = true;
				break;

			case 4:// Salir
				narrar.terminarJuego(prota);
				System.exit(0);
				break;

			default:
				narrar.error();
				repetirMenu = true;
				break;
			}
		} while (repetirMenu);
	}

	public void interfazExploracion() {
		boolean repetirExploracion = false;
		definirEnemigo();
		do {
			int eleccionSubMenu = narrar.subMenu(enemigo);
			switch (eleccionSubMenu) {
			case 1:// Luchar
				interfazBatalla();
				if ((prota.getVitalidad() > 0) && (enemigo.getVitalidad() > 0)) {
					repetirExploracion = true;
				} else if (prota.getVitalidad() < 0) {
					seleccionPersonaje();
				} else {
					repetirExploracion = false;
				}
				break;

			case 2:// huir
				narrar.huir();
				repetirExploracion = false;
				break;

			case 3:// tienda
				interfazTienda();
				repetirExploracion = true;
				break;

			case 4: // botiquin
				botiquin();
				repetirExploracion = true;
				break;

			default:
				narrar.error();
				repetirExploracion = true;
				break;
			}
		} while (repetirExploracion);
	}

	public void interfazBatalla() {
		int danioGenerado = 0;
		int danioRecibido = 0;
		// atacas
		danioGenerado = rueda.girar(1, prota.getDanoAtaque());
		enemigo.setVitalidad(enemigo.getVitalidad() - danioGenerado);

		danioRecibido = rueda.girar(1, enemigo.getDanoAtaque());
		prota.setVitalidad(prota.getVitalidad() - danioRecibido);
		narrar.lucha(enemigo, prota, danioGenerado, danioRecibido);

		if (prota.getVitalidad() <= 0) {
			prota.setDerrotas(prota.getDerrotas() + 1);
			prota.setDinero(prota.getDinero() - 3);
			narrar.derrota(enemigo, prota);

		} else if (enemigo.getVitalidad() <= 0) {
			prota.setVictorias(prota.getVictorias() + 1);
			prota.setDinero(prota.getDinero() + 10);
			narrar.victoria(enemigo, prota);
		}
	}

	public void definirEnemigo() {
		int vitalidad = 0;
		int danioAtaque = 0;

		if (prota.getVictorias() <= 3) {
			narrar.zonaMares();
			switch (rueda.girar(1, 2)) {
			case 1:// enemigo 1
				vitalidad = rueda.girar(50, 80);
				danioAtaque = rueda.girar(50, 80);

				Enemigo enemigo1 = new Enemigo("Sirena", "Salpicadura", vitalidad, danioAtaque);
				enemigo = enemigo1;
				break;

			case 2:// enemigo2
				vitalidad = rueda.girar(50, 80);
				danioAtaque = rueda.girar(50, 80);

				Enemigo enemigo2 = new Enemigo("Aquaman", "Aqua punch", vitalidad, danioAtaque);
				enemigo = enemigo2;
				break;

			default:
				narrar.error();
				break;
			}
		} else if ((prota.getVictorias() > 3) && (prota.getVictorias() <= 6)) {
			narrar.zonaIslas();
			switch (rueda.girar(1, 2)) {
			case 1: // Enemigo 3
				vitalidad = rueda.girar(75, 150);
				danioAtaque = rueda.girar(75, 150);

				Enemigo enemigo3 = new Enemigo("Humano", "Patada", vitalidad, danioAtaque);
				enemigo = enemigo3;
				break;

			case 2: // Enemigo 4
				vitalidad = rueda.girar(75, 150);
				danioAtaque = rueda.girar(75, 150);

				Enemigo enemigo4 = new Enemigo("Perro Rabioso", "Mordida", vitalidad, danioAtaque);
				enemigo = enemigo4;
				break;

			default:
				narrar.error();
				break;
			}

		} else if (prota.getVictorias() > 6) {
			narrar.zonaVolcanes();
			switch (rueda.girar(1, 2)) {
			case 1:// Enemigo 5
				vitalidad = rueda.girar(150, 200);
				danioAtaque = rueda.girar(150, 200);

				Enemigo enemigo5 = new Enemigo("Hombre Lava", "Fire punch", vitalidad, danioAtaque);
				enemigo = enemigo5;
				break;

			case 2: // Enemigo 6
				vitalidad = rueda.girar(150, 200);
				danioAtaque = rueda.girar(150, 200);

				Enemigo enemigo6 = new Enemigo("Dios de Lava", "Lluvia de Lava", vitalidad, danioAtaque);
				enemigo = enemigo6;
				break;

			default:
				narrar.error();
				break;
			}
		} else {
			narrar.error();
		}
		narrar.aparicionEnemiga(enemigo);
	}

	public void interfazTienda() {
		boolean repetirTienda = true;
		while (repetirTienda) {
			int eleccionTienda = narrar.menuTienda(tienda, prota);

			switch (eleccionTienda) {
			case 1:// vitalidad
				if ((prota.getDinero() >= tienda.getPrecioVitalidad()) && (tienda.getPocionVitalidad() > 0)) {
					prota.setPocionVitalidad(prota.getPocionVitalidad() + 1);
					tienda.setPocionVitalidad(tienda.getPocionVitalidad() - 1);
					prota.setDinero(prota.getDinero() - tienda.getPrecioVitalidad());
					narrar.compraVitalidad();
				} else if ((tienda.getPocionVitalidad() <= 0)) {
					narrar.seAcaboPocionVitalidad();
				} else {
					narrar.dineroInsuficiente();
				}
				break;

			case 2:// intercambio
				if ((prota.getDinero() >= tienda.getPrecioIntercambio()) && (tienda.getPocionIntercambio() > 0)) {
					prota.setPocionIntercambio(prota.getPocionIntercambio() + 1);
					tienda.setPocionIntercambio(tienda.getPocionIntercambio() - 1);
					prota.setDinero(prota.getDinero() - tienda.getPrecioIntercambio());
					narrar.compraIntercambio();
				} else if (tienda.getPrecioIntercambio() <= 0) {
					narrar.seAcaboPocionIntercambio();
				} else {
					narrar.dineroInsuficiente();
				}
				break;

			case 3:// salir
				repetirTienda = false;
				narrar.despedidaTienda();
				break;

			default:
				repetirTienda = true;
				narrar.error();
				break;
			}
		}
	}

	public void botiquin() {
		boolean repetirBotiquin = true;
		do {
			int eleccionBotiquin = narrar.botiquin(prota);
			switch (eleccionBotiquin) {
			case 1:
				if (prota.getPocionIntercambio() > 0) {
					narrar.usoPocionIntercambio(enemigo);
					int vitalidadTemp = prota.getVitalidad();
					prota.setVitalidad(enemigo.getVitalidad());
					enemigo.setVitalidad(vitalidadTemp);
					prota.setPocionIntercambio(prota.getPocionIntercambio() - 1);
				} else {
					narrar.errorPociones();
				}
				repetirBotiquin = true;
				break;

			case 2:
				if (prota.getPocionVitalidad() > 0) {
					int aumentoHP = rueda.girar(25, 50);
					prota.setVitalidad(prota.getVitalidad() + aumentoHP);
					narrar.usoPocionVitalidad(aumentoHP, prota);
					prota.setPocionVitalidad(prota.getPocionVitalidad() - 1);
				} else {
					narrar.errorPociones();
				}
				repetirBotiquin = true;
				break;

			case 3:
				repetirBotiquin = false;
				narrar.salidaBotiquin();
				break;

			default:
				narrar.error();
				repetirBotiquin = true;
				break;
			}
		} while (repetirBotiquin);
	}
}
