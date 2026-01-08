Algoritmo RequisitosHardware
	//Definir
	definir ram, almacenamiento, nucleos Como Entero;
	definir NUCLEO como entero;
	NUCLEO = 4;
	definir ALMACENAMIENTO_MIN como entero;
	ALMACENAMIENTO_MIN = 500 ;
	definir RAM_MINIMA como entero;
	RAM_MINIMA = 2;
	
	//Inicializar
	ram = 0;
	almacenamiento = 0;
	nucleos = 0;
	
	
	
	
	Escribir 'Indique la cantidad de memoria RAM del computador en Gb';
	Leer ram;
	Escribir 'Indique la memoria de almacenamiento del computador en Gb';
	Leer almacenamiento;
	Escribir 'Indique la cantidad de nucleos del procesador con los que cuenta el computador';
	Leer nucleos;
	
	Si ram >= RAM_MINIMA Entonces
		Si almacenamiento >= ALMACENAMIENTO_MIN Entonces
			Si nucleos == NUClEO Entonces
				Escribir 'Su ordenador si cumple con los requisitos';
			SiNo
				Escribir 'Su ordenador no cumple con los requistos minimos de hardware';
			FinSi
		SiNo
			Escribir 'Su ordenador no cumple con los requisitos minimos de hardware';
		FinSi
	SiNo
		Escribir 'Su ordenador no cumple con los requisitos minimos de hardware';
	FinSi
FinAlgoritmo
