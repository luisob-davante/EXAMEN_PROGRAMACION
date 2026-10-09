package examen;

import java.util.Scanner;

public class Examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresar cantidad de segundos: ");
		
		int v_horas;
		int v_minutos;
		int v_res = 0;
		int v_segundos = teclado.nextInt();

		if (v_segundos >= 60) {
			if (v_segundos >= 3600) {
				if (v_segundos > 86400) {
					System.out.println("Eso es mas que un dia");
				}	
				v_horas = v_segundos / 3600;
				
				v_res = v_segundos % 3600;
				
				if (v_res > 60 ) {
					v_minutos = v_res / 60;
					v_res = v_res % 60;
					System.out.println("Tiene " + v_horas + " horas " + v_minutos + " minutos y " + v_res + " segundos.");
				} else {
					System.out.println("Tiene " + v_horas + " y " + v_res + " segundos.");
				}
			}
			else {
				v_minutos = v_segundos / 60;
				v_res = v_segundos % 60;
				System.out.println("Tiene " + v_minutos + " minutos y " + v_res + " segundos.");
			}
		} else {
			System.out.println("Tiene " + v_segundos + " segundos");
		}
		

		teclado.close();
	}

}
