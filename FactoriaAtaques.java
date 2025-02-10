package pokemon;

import java.util.Random;

public class FactoriaAtaques {
	

	
	public static Ataque getAtaque(String tipo) {
		
		if(tipo=="fuego") {
			return getAtaqueFuego();
		}
		
		/*else if(tipo=="agua") {
			return getAtaqueAgua();
		}else if(tipo=="planta") {
			return getAtaquePlanta();
		}
		*/
		return new AtaqueNoEncontrado();

		
		
	}
	
	public static Ataque getAtaqueFuego() {
		Random rand = new Random();
		int num = rand.nextInt(3); // 0,1,2

		if(num==0) {
			return new Ascuas();
		}else if(num==1) {
			return new Lanzallamas();
		}else if(num==2) {
			return new Llamarada();
		}else {
			return new AtaqueNoEncontrado();
		}

	}
	
	
	

}

class Llamarada extends Ataque{
	
	Llamarada(){
		this.nombre="Llamarada";
		this.danio=120;
		this.tipo="fuego";
		this.numeroDeUsos=5;
		this.usosRestantes=this.numeroDeUsos;
	}
	
}

class Ascuas extends Ataque{
	
	Ascuas(){
		this.nombre="Ascuas";
		this.danio=30;
		this.tipo="fuego";
		this.numeroDeUsos=30;
		this.usosRestantes=this.numeroDeUsos;
	}
	
}

class Lanzallamas extends Ataque{
	
	Lanzallamas(){
		this.nombre="Lanzallamas";
		this.danio=80;
		this.tipo="fuego";
		this.numeroDeUsos=15;
		this.usosRestantes=this.numeroDeUsos;
	}
	
}


class AtaqueNoEncontrado extends Ataque {
	AtaqueNoEncontrado(){
		this.nombre="Ataque no encontrado";
		this.danio=0;
		this.tipo="";
		this.numeroDeUsos=0;
		this.usosRestantes=0;
	}
}