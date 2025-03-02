
public class Partida {

	Random r = new Random();
	Scanner input = new Scanner(System.in);
	
	private Pokemon pokemonJugador = new Pokemon();
	private Pokemon pokemonMaquina = new Pokemon();
	private Pokemon[] pokemonOpciones = new Pokemon[3];
	
	
	//CONSTUCTOR
	public Partida () {
		
	}
	
	//MÉTODOS

	public void jugar() {
		inicializarOpciones();
		escogerPokemonJugador();
		escogerPokemonMaquina();
		System.out.println("Tu pokemon es: " + pokemonJugador.getNombre());
		System.out.println("El pokemon de la máquina es: " + pokemonMaquina.getNombre());
		combate();
	}



	private void inicializarOpciones() {
		pokemonOpciones[0] = new Bulbasur(1,"Bulbasur",1,800);
		pokemonOpciones[1] = new Charmander(1,"Charmander",1,600);
		pokemonOpciones[2] = new Squirtle(1,"Squirtle",1,500);
	}

	private Pokemon escogerPokemonMaquina(){
		pokemonMaquina = pokemonOpciones[r.nextInt(3)];
		return pokemonMaquina;
	}

	private Pokemon escogerPokemonJugador(){
		int opcion;
		System.out.print("Escoge un pokemon: ");
		for (int i = 0; i < pokemonOpciones.length; i++) {
			System.out.println("("+i + ") " + pokemonOpciones[i].getNombre());
		}
		opcion = input.nextInt();
		while (opcion < 0 || opcion > 2) {
			System.out.print("Opción no válida, vuelve a intentarlo: ");
			opcion = input.nextInt();
		}
		pokemonJugador = pokemonOpciones[opcion];
		return pokemonJugador;
	}

	private void combate(){
		while(pokemonJugador.estaVivo() && pokemonMaquina.estaVivo()){
			turnoJugador();
			if(pokemonMaquina.estaVivo()){
				turnoMaquina();
			}
		}
		if(pokemonJugador.estaVivo()){
			System.out.println("Has ganado");
		}else{
			System.out.println("Has perdido");
		}
	}

	private void turnoJugador(){
		Ataque ataque = escogerAtaqueJugador();
		System.out.println("Has usado " + ataque.getNombre());
		ataque.aplicarAtaque(pokemonMaquina);
		pokemonJugador.subirNivel();
	}

	private void turnoMaquina(){
		Ataque ataque = escogerAtaqueMaquina();
		System.out.println("La máquina ha usado " + ataque.getNombre());
		ataque.aplicarAtaque(pokemonJugador);
		pokemonMaquina.subirNivel();
	}

	private Ataque escogerAtaqueJugador(){
		int opcion;
		System.out.print("Escoge un ataque: ");
		for (int i = 0; i < pokemonJugador.ataques.size(); i++) {
			System.out.println("("+i + ") " + pokemonJugador.ataques.get(i).getNombre());
		}
		opcion = input.nextInt();
		while (opcion < 0 || opcion > pokemonJugador.ataques.size()) {
			System.out.print("Opción no válida, vuelve a intentarlo: ");
			opcion = input.nextInt();
		}
		return pokemonJugador.ataques.get(opcion);
	}

	private Ataque escogerAtaqueMaquina(){
		return pokemonMaquina.ataques.get(r.nextInt(pokemonMaquina.ataques.size()));
	}


}
