import java.util.Random; 

public class Prueba {
	public static void main (String args []) {
		Random num = new Random (); 

		int random = num.nextInt (60);
		for (int i = 0; i <=100;i++){
		System.out.println (random);
		}
	}

}