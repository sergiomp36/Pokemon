

public class Ataque {
	
	//Atributos
	protected String nombre;
	protected int danio;
	protected String tipo;
	protected int numeroDeUsos;
	protected int usosRestantes;

	
	//Metodos
	public boolean reducirUso() {
		
		if(this.usosRestantes>0) {
			this.usosRestantes--;
			return true;
		}
		
		return false;
	}
	
	public boolean aplicarAtaque(Pokemon pokemonAtacado) {
		if(!this.reducirUso()) { //no me quedan usos
			return false;
		}
		int danioTotal = 0;
		danioTotal = this.calcularDanio(pokemonAtacado.getTipo());
		pokemonAtacado.vidaActual=pokemonAtacado.vidaActual - danioTotal;

		return true;
		
		
	}
	
	public int calcularDanio(String tipoObjetivo) {
		double dano;
		dano = this.danio * this.calcularEficacia(tipoObjetivo);
		
		return (int)dano;
	}
	
	public double calcularEficacia(String tipoObjetivo) {
		if(tipoObjetivo=="fuego" && this.tipo=="agua" || tipoObjetivo=="planta" && this.tipo=="fuego" || tipoObjetivo=="agua" && this.tipo=="planta"){
			return 2;
		}else if(tipoObjetivo=="agua" && this.tipo=="fuego" || tipoObjetivo=="fuego" && this.tipo=="planta" || tipoObjetivo=="planta" && this.tipo=="agua"){
			return 0.5;
		}else {
			return 1;
		}

	}
	
	
	
	
	// getters y setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDanio() {
		return danio;
	}


	public void setDanio(int danio) {
		this.danio = danio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getNumeroDeUsos() {
		return numeroDeUsos;
	}


	public void setNumeroDeUsos(int numeroDeUsos) {
		this.numeroDeUsos = numeroDeUsos;
	}


	public int getUsosRestantes() {
		return usosRestantes;
	}


	public void setUsosRestantes(int usosRestantes) {
		this.usosRestantes = usosRestantes;
	}
}
