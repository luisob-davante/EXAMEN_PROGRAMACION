package examen;

import java.util.Scanner;

public class Examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrebe tu nombre completo: ");
		
		String v_nombre = teclado.nextLine();
		char v_letra;
		
		v_nombre = v_nombre.replace(" ", "");
		
		int v_largo =  v_nombre.length();
		
		System.out.println("Caracteres totales: " + v_largo);
		
		v_letra = v_nombre.charAt(0);
		
		System.out.println("Primera letra:" + v_letra);
		
		teclado.close();
	}
}
