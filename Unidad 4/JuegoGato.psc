Algoritmo JuegoGato
	// Definir 
	Definir jugador1, jugador2 Como Cadena;
	jugador1 <- '';
	jugador2 <- '';
	Definir ficha1, ficha2 Como Cadena;
	ficha1 <- '';
	ficha2 <- '';
	Definir c1, c2, c3, c4, c5, c6, c7, c8, c9 Como Cadena;
	Definir eleccion1 Como Entero;
	Definir turnoJugador1 Como Logico;
	// Inicializar
	c1 <- '1';
	c2 <- '2';
	c3 <- '3';
	c4 <- '4';
	c5 <- '5';
	c6 <- '6';
	c7 <- '7';
	c8 <- '8';
	c9 <- '9';
	eleccion1 <- 0;
	turnoJugador1 <- verdadero;
	// Datos Entrada
	Escribir 'indique su nombre jugador 1';
	Leer jugador1;
	Escribir 'indique su nombre jugador 2 ';
	Leer jugador2;
	Escribir , jugador1, ' indique la ficha con la que desea jugar (X/O)';
	Leer ficha1;
	Escribir , jugador2, ' indique la ficha con la que desea jugar (distinta a la del otro jugador)';
	Leer ficha2;
	Escribir , jugador1, ' vas a jugar con la ficha: ', ficha1;
	Escribir , jugador2, ' vas a jugar con la ficha: ', ficha2;
	Repetir
		Escribir '__', c1, '_|___', c2, '__|_', c3, '__';
		Escribir '__', c4, '_|___', c5, '__|_', c6, '__';
		Escribir '__', c7, '_|___', c8, '__|_', c9, '__';
		Si turnoJugador1=verdadero Entonces
			Escribir , jugador1, ' indique la casilla en la que va a colocar su ficha';
			turnoJugador1 <- falso;
		SiNo
			Escribir , jugador2, ' indique la casilla en la que va a colocar su ficha';
			turnoJugador1 <- verdadero;
		FinSi
		Leer eleccion1;
		Segun eleccion1 Hacer
			1:
				c1 <- ficha1;
			2:
				c2 <- ficha1;
			3:
				c3 <- ficha1;
			4:
				c4 <- ficha1;
			5:
				c5 <- ficha1;
			6:
				c6 <- ficha1;
			7:
				c7 <- ficha1;
			8:
				c8 <- ficha1;
			9:
				c9 <- ficha1;
		FinSegun
		Si ficha1=='X' Entonces
			ficha1 <- 'O';
		SiNo
			ficha1 <- 'X';
		FinSi
	Mientras Que Verdadero
FinAlgoritmo
