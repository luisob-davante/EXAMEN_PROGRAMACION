package examen;

import java.util.Scanner;

public class Examen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresar numero: ");
		
		int v_num = teclado.nextInt();
		
		if (v_num <= 10) {
			
			System.out.println(v_num + " x 1 = " + (v_num * 1));
			System.out.println(v_num + " x 2 = " + (v_num * 2));
			System.out.println(v_num + " x 3 = " + (v_num * 3));
			System.out.println(v_num + " x 4 = " + (v_num * 4));
			System.out.println(v_num + " x 5 = " + (v_num * 5));
			System.out.println(v_num + " x 6 = " + (v_num * 6));
			System.out.println(v_num + " x 7 = " + (v_num * 7));
			System.out.println(v_num + " x 8 = " + (v_num * 8));
			System.out.println(v_num + " x 9 = " + (v_num * 9));
			System.out.println(v_num + " x 10 = " + (v_num * 10));
			System.out.println(v_num + " x 11 = " + (v_num * 11));
			System.out.println(v_num + " x 12 = " + (v_num * 12));
			
		} else {
			System.out.print("Numero fuera de rango.");
		}
		
		teclado.close();

	}

}
