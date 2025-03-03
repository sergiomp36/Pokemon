package package1;

import java.util.ArrayList;

public class Bulbasur extends Pokemon {
	
	public Bulbasur() {
		this.id = 1;
		this.nivel=1;
		this.nombre="Bulbasur";
		this.vidaMaxima = 500;
		this.tipo="Planta";
		this.ataques = new ArrayList<Ataque>();
		this.aniadirAtaqueInicial();
		this.vidaActual=this.vidaMaxima;
	}

	@Override
	public boolean subirNivel() {
		return super.subirNivel(3);
	}
}
