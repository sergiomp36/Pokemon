package package1;

import java.util.ArrayList;

public class Squirtle extends Pokemon{
	
	
	public Squirtle() {
		this.id = 1;
		this.nivel=1;
		this.nombre="Squirtle";
		this.vidaMaxima = 500;
		this.tipo="Agua";
		this.ataques = new ArrayList<Ataque>();
		this.aniadirAtaqueInicial();
		this.vidaActual=this.vidaMaxima;
	}

	public boolean subirNivel() {

		return super.subirNivel(5);
	}
}
