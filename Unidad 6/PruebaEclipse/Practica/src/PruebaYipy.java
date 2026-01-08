
public class PruebaYipy {

	public static void main(String[] args) {
		Yipy yipy = new Yipy("Chocolate", "Pozuelo");
		
		System.out.println("La marca de la galleta es: " + yipy.getMarca()+ " Y el sabor es: "+ yipy.getSabor());
		
		System.out.println(yipy.toString());

	}

}
