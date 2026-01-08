Algoritmo CantidadAgua
	Definir genero Como Cadena;
	
	Escribir 'Por favor indique su genero (Hombre / Mujer): ';
	Leer genero;
	
	Si genero=='Mujer' | genero == "mujer" Entonces
		Escribir 'Usted debe tomar 1.5 litro de agua diariamente';
		
	SiNo
		Si genero=='Hombre' | genero == "hombre" Entonces
			Escribir 'Usted debe tomar 1 litro de agua diariamente';
			
		SiNo
			Escribir 'Error, solo se permite: Hombre/Mujer';
		FinSi
	FinSi
FinAlgoritmo
