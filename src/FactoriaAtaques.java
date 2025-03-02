
import java.util.Random;

public class FactoriaAtaques {

	public static Ataque getAtaque(String nombre, int daño, String tipo, int numeroDeUsos) {
		return new Ataque(nombre, daño, tipo, numeroDeUsos);
	}

	public static Ataque getAtaqueAgua(int aux) {
		switch (aux) {
		case 0:
		    return new Ataque("Salpicar", 30, "Agua", 10);
		case 1:
		    return new Ataque("Pistola Agua", 40, "Agua", 25);
		case 2:
		    return new Ataque("Hidrobomba", 110, "Agua", 5);
		case 3:
		    return new Ataque("Surf", 90, "Agua", 15);
		case 4:
		    return new Ataque("Burbuja", 20, "Agua", 30);
		case 5:
		    return new Ataque("Aqua Jet", 40, "Agua", 20);
		case 6:
		    return new Ataque("Danza Lluvia", 35, "Agua", 5);
		case 7:
		    return new Ataque("Hidropulso", 60, "Agua", 20);
		case 8:
		    return new Ataque("Escaldar", 80, "Agua", 15);
		case 9:
		    return new Ataque("Cola Agua", 85, "Agua", 10);
		default:
		    return new Ataque("Chorro de Agua", 55, "Agua", 20);

		}

	}

	public static Ataque getAtaquePlanta(int aux) {
		switch (aux) {
		case 0:
		    return new Ataque("Hoja Navaja", 55, "Planta", 15);
		case 1:
		    return new Ataque("Rayo Solar", 120, "Planta", 5);
		case 2:
		    return new Ataque("Drenadoras", 20, "Planta", 10);
		case 3:
		    return new Ataque("Esporas", 30, "Planta", 20);
		case 4:
		    return new Ataque("Latigazo", 35, "Planta", 8);
		case 5:
		    return new Ataque("Látigo Cepa", 45, "Planta", 15);
		case 6:
		    return new Ataque("Energibola", 90, "Planta", 10);
		case 7:
		    return new Ataque("Síntesis", 70, "Planta", 5);
		case 8:
		    return new Ataque("Zumbido", 75, "Planta", 10);
		case 9:
		    return new Ataque("Somnífero", 65, "Planta", 15);
		default:
		    return new Ataque("Hoja Mágica", 60, "Planta", 20);

		}

	}

	public static Ataque getAtaqueFuego(int aux) {
		switch (aux) {
		case 0:
		    return new Ataque("Ascuas", 40, "Fuego", 25);
		case 1:
		    return new Ataque("Lanzallamas", 90, "Fuego", 10);
		case 2:
		    return new Ataque("Giro Fuego", 35, "Fuego", 15);
		case 3:
		    return new Ataque("Sofoco", 130, "Fuego", 5);
		case 4:
		    return new Ataque("Puño Fuego", 75, "Fuego", 15);
		case 5:
		    return new Ataque("Colmillo Ígneo", 65, "Fuego", 15);
		case 6:
		    return new Ataque("Danza Llama", 80, "Fuego", 10);
		case 7:
		    return new Ataque("Nitrocarga", 50, "Fuego", 20);
		case 8:
		    return new Ataque("Onda Ígnea", 95, "Fuego", 10);
		case 9:
		    return new Ataque("Llama Fatua", 45, "Fuego", 15);
		default:
		    return new Ataque("Bola de Fuego", 55, "Fuego", 20);

		}
	}
	
	public static void getAtaque(String tipo, int nivel) {
		switch (tipo) {
		case "Planta":
			getAtaquePlanta(nivel/10);
			break;
		case "Fuego":
			getAtaqueFuego(nivel/10);
			break;
		case "Agua":
			getAtaqueAgua(nivel/10);
			break;
		}


	}
}
