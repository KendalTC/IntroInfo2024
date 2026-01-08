package Vista.Terminal;

/*
 *@Anthonny Lopez Martinez 		C4G614
 *@Johan Andrey Rivera Martinez		C4I975
 *@Kendal Trejos Cubero 	C4K374
 */
import Modelo.Enemigo;
import Modelo.Protagonista;
import Modelo.Tienda;

public class Narrador {
	Escritor escritor;
	Lector lector;

	public Narrador() {
		escritor = new Escritor();
		lector = new Lector();
	}

	public int menuInicio() {
		escritor.escribir("Inicia tu aventura!!  \n1.Iniciar \n2.Salir");
		return lector.leerInt();
	}

	public void historia() {
		String Historia = "Las posibilidades son múltiples;\n"
				+ "algunas elecciones son sencillas, otras sensatas, unas temerarias... y algunas\n"
				+ "peligrosas. Eres tú quien debe tomar las decisiones. Puedes jugar muchas veces y\n"
				+ "obtener resultados diferentes. Recuerda que tú decides la aventura, que tú eres la\n"
				+ "aventura. Si tomas una decisión imprudente, vuelve al principio y empieza de nuevo.\n"
				+ "No hay opciones acertadas o erróneas, sino muchas elecciones posibles. Elige tu\n"
				+ "propia aventura.";

		escritor.escribir(Historia);
	}

	public void instrucciones() {
		String Instrucciones = "El juego inicia con la opcion de escoger un personaje, el cual puede ser \n "
				+ "predeterminado al azar o uno con nombres personalizados. A continuacion se despliega \n"
				+ "un menu principal, en el que debes elegir entre EXPLORAR, ir a la TIENDA, ESTADO y SALIR del juego \n"
				+ "En la opcion de EXPLORAR vas a entrar primeramente a la zona de mares, en donde van a aparecer \n "
				+ "diferentes enemigos con un nivel basico, al obtener 4 victorias en esta zona, pasarás a la zona \n "
				+ "de islas, en donde encontrarás enemigos de nivel intermedio, luego de ganas 3 combates en esta zona \n "
				+ "pasarás a la zona de volcanes, donde se encuentran los enemigos mas fuertes. Durante todo el juego \n"
				+ "tienes diferentes opciones que puedes utilizar, como lo es la tienda y el botiquín, en donde \n "
				+ "puedes comprar y utilizar pociones. MUCHAS SUERTE!!";

		escritor.escribir(Instrucciones);
	}

	public void zonaMares() {
		escritor.escribir("Has entrado a la zona de Mares, ten cuidado, buena suerte");
	}

	public void zonaIslas() {
		escritor.escribir("Has entrado a la zona de Islas, ten cuidado, buena suerte");
	}

	public void zonaVolcanes() {
		escritor.escribir("Has entrado a la zona de Volcanes, ten cuidado, buena suerte");
	}

	public void huir() {
		escritor.escribir("Es mejor huir para reagruparse");
	}

	public void lucha(Enemigo enemigo, Protagonista prota, int danoGenerado, int danoRecibido) {
		escritor.escribir("HA EMPEZADO LA BATALLA!!" + "\n" + prota.getNombre() + " hizo un daño de " + danoGenerado
				+ " a " + enemigo.getNombre() + " con su ataque " + prota.getNombreAtaque() + "\n" + "\n"
				+ prota.getNombre() + " recibio " + danoRecibido + " puntos de daño, por el ataque: "
				+ enemigo.getNombreAtaque() + " del enemigo" + enemigo.getNombre() + "\n" + "\n Despues del encuentro: "
				+ "\nTu vitalidad es de " + prota.getVitalidad() + "\nLa vitalidad enemiga es de "
				+ enemigo.getVitalidad());
	}

	public void error() {
		escritor.escribir("Algo a salido mal, intentalo de nuevo");
	}

	public void compraVitalidad() {
		escritor.escribir("Has comprado una pocion de Vitalidad");
	}

	public void compraIntercambio() {
		escritor.escribir("Has comprado una pocion de Intercambio");
	}

	public int menuTienda(Tienda tienda, Protagonista prota) {
		escritor.escribir("Bienvenido a la tienda!! " + "\nTu dinero: " + prota.getDinero() + "\nPocion de Vitalidad "
				+ " Cantidad: " + tienda.getPocionVitalidad() + " Precio: " + tienda.getPrecioVitalidad() + "\n"
				+ "Pocion de Intercambio " + " Cantidad: " + tienda.getPocionIntercambio() + " Precio: "
				+ tienda.getPrecioIntercambio() + "\n" + "\nTu decision es valiosa: "
				+ " \n1.Comprar Pocion Vitalidad \n 2.Comprar Pocion de Intercambio \n 3.Volver al menu");
		return lector.leerInt();
	}

	public void seAcaboPocionVitalidad() {
		escritor.escribir("Lo sentimos, se han agotado nuestras pociones de vitalidad");
	}

	public void seAcaboPocionIntercambio() {
		escritor.escribir("Lo sentimos, se han agotado nuestras pociones de intercambio");
	}

	public void despedidaTienda() {
		escritor.escribir("Gracias por visitar la tienda, vuelve pronto");
	}

	public void dineroInsuficiente() {
		escritor.escribir("No tienes el dinero suficiente ");
	}

	public int eleccionPersonaje() {
		escritor.escribir(
				"Que personaje deseas tener?  \n" + "1.Personaje Predeterminado \n" + "2.Personaje Personalizado");
		return lector.leerInt();
	}

	public String nombreProta() {
		escritor.escribir("Indique el nombre de su protagonista");
		return lector.leerString();
	}

	public String nombreAtaque() {
		escritor.escribir("Indique el nombre del ataque del protagonista");
		return lector.leerString();
	}

	public void estadoProta(Protagonista prota) {
		escritor.escribir("El nombre de su protagonista es: " + prota.getNombre() + "\n Vitalidad: "
				+ prota.getVitalidad() + "\n Daño ataque: " + prota.getDanoAtaque() + "\n Nombre ataque: "
				+ prota.getNombreAtaque() + "\nDinero: " + prota.getDinero() + "\nPocion Vitalidad: "
				+ prota.getPocionVitalidad() + "\nPocion intercambio: " + prota.getPocionIntercambio());
	}

	public int menuPrincipal() {
		escritor.escribir("Elige tu camino en esta aventura \n 1.Explorar" + "\n 2.Estado " + "\n 3.Tienda "
				+ "\n 4.Salir del juego");
		return lector.leerInt();
	}

	public void aparicionEnemiga(Enemigo enemigo) {
		escritor.escribir("A aparecido " + enemigo.getNombre() + " ten cuidado \n" + "Su vitalidad es de "
				+ enemigo.getVitalidad() + " y su ataque de " + enemigo.getDanoAtaque());
	}

	public int subMenu(Enemigo enemigo) {
		escritor.escribir("Tu enemigo es: " + enemigo.getNombre()
				+ "\nElija una opcion: \n 1.Luchar \n 2.Correr \n 3.Tienda \n 4.Botiquin");
		return lector.leerInt();
	}

	public void derrota(Enemigo enemigo, Protagonista prota) {
		escritor.escribir("Has sido derrotado por " + enemigo.getNombre() + "\nESTADISTICAS 	" + prota.getNombre()
				+ "\nVictorias: " + prota.getVictorias() + "\nDerrotas: " + prota.getDerrotas());
	}

	public void victoria(Enemigo enemigo, Protagonista prota) {
		escritor.escribir("Has derrotado a " + enemigo.getNombre()
				+ "\nHas ganado 10 monedas por tu victoria, tu total de monedas es: " + prota.getDinero());
	}

	public void terminarJuego(Protagonista prota) {
		escritor.escribir("Muchas gracias por jugar, vuelve pronto!!" + "\nObtuviste " + prota.getVictorias()
				+ " victorias con tu personaje " + prota.getNombre() + "\nObtuviste " + prota.getDerrotas()
				+ " derrotas con tu personaje " + prota.getNombre());
	}

	public int botiquin(Protagonista prota) {
		escritor.escribir("Tienes: \nPociones de Intercambio: " + prota.getPocionIntercambio()
				+ "\nPociones de Vitalidad: " + prota.getPocionVitalidad() + "\n" + "\nElije sabiamente "
				+ "\n1.Utilizar pocion de Intercambio \n2.Utilizar pocion de Vitalidad \n3.Volver al menu");
		return lector.leerInt();
	}

	public void usoPocionVitalidad(int aumentoHP, Protagonista prota) {
		escritor.escribir("Has utilizado la Pocion de vitalidad tu hp aumento: " + aumentoHP + " \n ahora tienes: "
				+ prota.getVitalidad() + " de hp");
	}

	public void usoPocionIntercambio(Enemigo enemigo) {
		escritor.escribir("Has utilizado la Pocion de Intercambio la vitalidad de tu enemigo: " + enemigo.getVitalidad()
				+ " ahora sera tuya");
	}

	public void errorPociones() {
		escritor.escribir("No cuentas con pociones");
	}

	public void salidaBotiquin() {
		escritor.escribir("Has salido del Botiquin");
	}
}
