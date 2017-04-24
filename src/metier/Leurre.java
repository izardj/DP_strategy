package metier;

public class Leurre extends Canard {

	@Override
	public void afficher() {
		System.out.println("Je suis un Leurre");
	}

	public Leurre() {
		super();
		comportementCanCan = new Cancan();
		comportementVol = new NePasVoler();
	}
	
}
