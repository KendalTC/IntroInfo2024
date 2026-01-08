Algoritmo NumeroMayor
	Definir num1 Como Real;
	Definir num2 Como Real;
	num1 = 0;
	num2= 0;
	
	Escribir 'Digite el primer numero con el que desea trabajar';
	Leer num1;
	Escribir 'Digite el segundo numero con el que desea trabajar ';
	Leer num2;
	
	Si num1>num2  Entonces
		Escribir 'El numero mayor es: ', num1;
	SiNo
		si num1 == num2 entonces 
			escribir "Los numeros ingresados son iguales";
			
		sino 
			Escribir 'El numero mayor es: ', num2;
		finsi
	FinSi
FinAlgoritmo
