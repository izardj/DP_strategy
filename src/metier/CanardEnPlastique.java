package metier;

public class CanardEnPlastique extends Canard {

	@Override
	public void afficher() {
		System.out.println("Je suis un Canard en plastique");
	}
	public CanardEnPlastique() {
		super();
		comportementCanCan = new Coincoin();
		comportementVol = new NePasVoler();
	}
}
