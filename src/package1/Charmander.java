package package1;

import java.util.ArrayList;

public class Charmander extends Pokemon{
	
	public Charmander() {
		this.id = 1;
		this.nivel=1;
		this.nombre="Charmander";
		this.vidaMaxima = 500;
		this.tipo="Fuego";
		this.ataques = new ArrayList<Ataque>();
		this.aniadirAtaqueInicial();
		this.vidaActual=this.vidaMaxima;
	}

	@Override
	public boolean subirNivel() {
		
		
		return super.subirNivel(3);
	}
}
