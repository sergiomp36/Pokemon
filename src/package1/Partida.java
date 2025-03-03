package package1;

import java.util.Random;
import java.util.Scanner;

public class Partida {


	Random r = new Random();
	Scanner input = new Scanner(System.in);
	
	private Pokemon pokemonJugador = new Pokemon();
	private Pokemon pokemonMaquina = new Pokemon();
	private Pokemon[] pokemonOpcionesJugador = new Pokemon[3];
	private Pokemon[] pokemonOpcionesMaquina = new Pokemon[3];
	
	
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
		pokemonOpcionesJugador[0] = new Charmander();
		pokemonOpcionesJugador[1] = new Squirtle();
		pokemonOpcionesJugador[2] = new Bulbasur();
		
		pokemonOpcionesMaquina[0] = new Charmander();
		pokemonOpcionesMaquina[1] = new Squirtle();
		pokemonOpcionesMaquina[2] = new Bulbasur();
	}

	private Pokemon escogerPokemonMaquina(){
		do {
		pokemonMaquina = pokemonOpcionesMaquina[r.nextInt(3)];
		}while(pokemonMaquina.equals(pokemonJugador));
		return pokemonMaquina;
	}

	private Pokemon escogerPokemonJugador(){
		int opcion;
		System.out.print("Escoge un pokemon: \n");
		for (int i = 0; i < pokemonOpcionesJugador.length; i++) {
			System.out.println("("+i + ") " + pokemonOpcionesJugador[i].getNombre());
		}
		opcion = input.nextInt();
		while (opcion < 0 || opcion > 2) {
			System.out.print("Opción no válida, vuelve a intentarlo: ");
			opcion = input.nextInt();
		}
		pokemonJugador = pokemonOpcionesJugador[opcion];
		
		return pokemonJugador;
	}

	private void combate(){
		int ronda = 1;
		do{
			imprimirValores();
			turnoJugador();
			if(pokemonMaquina.estaVivo()){
				turnoMaquina();
			}
			for(int i =0;i< ronda*2;i++) {
	        	pokemonJugador.subirNivel();
	        	pokemonMaquina.subirNivel();
	        }
		}while(pokemonJugador.estaVivo() && pokemonMaquina.estaVivo());
		
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
		
	}

	private void turnoMaquina(){
		Ataque ataque = escogerAtaqueMaquina();
		System.out.println("La máquina ha usado " + ataque.getNombre());
		ataque.aplicarAtaque(pokemonJugador);
		
	}

	private Ataque escogerAtaqueJugador(){
		int opcion;
		System.out.print("Escoge un ataque: ");
		for (int i = 0; i < pokemonJugador.ataques.size(); i++) {
			System.out.println("("+i + ") " + pokemonJugador.ataques.get(i).getNombre()+" ("+pokemonJugador.ataques.get(i).getDanio()+")");
		}
		opcion = input.nextInt();
		while (opcion < 0 || opcion >= pokemonJugador.ataques.size()) {
			System.out.print("Opción no válida, vuelve a intentarlo: ");
			opcion = input.nextInt();
		}
		return pokemonJugador.ataques.get(opcion);
	}

	private Ataque escogerAtaqueMaquina(){
		return pokemonMaquina.ataques.get(r.nextInt(pokemonMaquina.ataques.size()));
	}

	private void imprimirValores() {
		System.out.println("Jugador, "+pokemonJugador.getNombre()+" tiene "+pokemonJugador.getVidaActual()+" de vida y es de nivel "+pokemonJugador.getNivel());
		System.out.println("La máquina ("+pokemonMaquina.getNombre()+") tiene "+pokemonMaquina.getVidaActual()+" de vida y es de nivel "+pokemonMaquina.getNivel());
	}

}
