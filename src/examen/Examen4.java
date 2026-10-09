package examen;

import java.util.Scanner;

public class Examen4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrebe tu nombre completo: ");
		
		String v_palabra = teclado.nextLine();
		
		int v_largo = v_palabra.length();

		for (int i = v_largo; i > 0; i--) {
			System.out.println(v_palabra.substring(0, i) );
		}
	}
}
