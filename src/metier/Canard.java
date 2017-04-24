package metier;

public abstract class Canard {

	protected ComportementVol comportementVol;
	protected ComportementCanCan comportementCanCan;

	public void effectuerCancan() {
		comportementCanCan.cancaner();
	}

	public void effectuerVol() {
		comportementVol.voler();
	}

	public void nager() {
		System.out.println("Je nage");
	}

	public abstract void afficher();

	public ComportementVol getComportementVol() {
		return comportementVol;
	}

	public void setComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}

	public ComportementCanCan getComportementCanCan() {
		return comportementCanCan;
	}

	public void setComportementCanCan(ComportementCanCan comportementCanCan) {
		this.comportementCanCan = comportementCanCan;
	}
}
