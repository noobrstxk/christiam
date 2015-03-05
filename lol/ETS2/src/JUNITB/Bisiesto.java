package JUNITB;

import java.util.Scanner;


public class Bisiesto {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime el año: ");
		int fecha = teclado.nextInt();
		
		if (fecha % 4 == 0 && (fecha % 100 != 0 || fecha % 400 == 0)) 
			System.out.print("Si es bisiesto");
		else
			System.out.print("No es bisiesto");
		
		teclado.close();
	}

}
