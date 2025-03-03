package package1;

import java.util.Scanner;

public class Main {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion;
		do {
			mostrarMenu();
			Scanner input = new Scanner(System.in);
			opcion = input.nextInt();
			switch (opcion) {
			case 1:
				Partida p = new Partida();
				p.jugar();
				break;
			case 2:
				break;
			default:
				System.out.println("Opción no válida, vuelve a intentarlo");
				break;
			}

		} while (opcion != 2);
		
	}
	
	private static void mostrarMenu() {
		System.out.println("(1) Jugar");
		System.out.println("(2) Salir");
		System.out.println("Elige una opción: ");
	}

}
