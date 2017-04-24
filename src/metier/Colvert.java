package metier;

public class Colvert extends Canard {

	@Override
	public void afficher() {
		System.out.println("Je suis un Colvert");
	}

	public Colvert() {
		super();
		comportementCanCan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}

}
