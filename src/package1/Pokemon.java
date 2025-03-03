package package1;

import java.util.ArrayList;

public class Pokemon {


	// Atributos

	protected int id;
	protected String nombre;
	protected int nivel;
	protected int vidaMaxima;
	protected int vidaActual;
	protected String tipo;
	protected ArrayList<Ataque> ataques;

	// CONSTRUCTORES
	public Pokemon(){
		
	}
	
	public boolean subirNivel(int aumentoVida) {
		if (this.nivel >= 100) {
			return false;
		}
		this.nivel++;
		if (this.nivel % 10 == 0) {
			this.ataques.add(FactoriaAtaques.getAtaque(this.tipo,this.nivel));
		}
		this.vidaMaxima += aumentoVida;
		this.vidaActual = this.vidaActual+aumentoVida;
		return true;
	}

	public void aniadirAtaqueInicial() {
		this.ataques.add(FactoriaAtaques.getAtaqueInicial(this.tipo));
	}
	
	public boolean estaVivo() {
		if (this.vidaActual > 0) {
			return true;
		}
		return false;
	}

	// GETTERS / SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public void setVidaActual(int vidaActual) {
		this.vidaActual = vidaActual;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Ataque> getAtaques() {
		return ataques;
	}

	public void setAtaques(ArrayList<Ataque> ataques) {
		this.ataques = ataques;
	}

	public boolean subirNivel() {
		// TODO Auto-generated method stub
		return false;
	}


}
