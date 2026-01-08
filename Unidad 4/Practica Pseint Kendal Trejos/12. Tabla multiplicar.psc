Algoritmo TablaMultiplicar
	definir i como entero;
	definir numTabla como entero ;
	definir producto como entero ;
	
	i = 0;
	numTabla = 0;
	producto = 0;
	
	Escribir "	Digite el numero de la tabla de multiplicar";
	Leer numTabla;
	Escribir "La tabla de multiplicar del  numero ", numTabla, " es: ";
	
	Para i<-0 Hasta 10 Con Paso 1 Hacer
		producto = numTabla * i;
		Escribir numTabla, "x" ,i, " = " ,producto;
	FinPara
FinAlgoritmo
