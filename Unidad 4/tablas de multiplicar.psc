Algoritmo TablasMultiplicar
	Definir i Como Entero;
	i <- 0;
	Definir j Como Entero;
	j <- 0;
	Definir resultado Como Entero;
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir 'tabla del: ', i;
		Para j<-0 Hasta 10 Con Paso 1 Hacer
			resultado <- i*j;
			Escribir , i, 'x', j, '=', resultado;
		FinPara
	FinPara
FinAlgoritmo
