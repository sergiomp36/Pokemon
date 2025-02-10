package pokemon;

public class main {
	
	public static void main(String[] args) {

		
				
		Ataque ataque1=FactoriaAtaques.getAtaque("fuego");
		Ataque ataque2=FactoriaAtaques.getAtaque("fuego");
		Ataque ataque3=FactoriaAtaques.getAtaque("fuego");

		System.out.println(ataque1.nombre);
		System.out.println(ataque2.nombre);
		System.out.println(ataque3.nombre);

	}


}
