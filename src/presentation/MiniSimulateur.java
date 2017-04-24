package presentation;

import metier.Canard;
import metier.CanardEnPlastique;
import metier.Coincoin;
import metier.Colvert;
import metier.Leurre;
import metier.VolerAvecDesAiles;

public class MiniSimulateur {

	public static void main(String[] args) {
		System.out.println("------------------------   COLVERT   -----------------------");
		Canard colvert = new Colvert();
		colvert.afficher();
		colvert.nager();
		colvert.effectuerCancan();
		colvert.effectuerVol();
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------   LEURRE   ------------------------");
		Canard leurre = new Leurre();
		leurre.afficher();
		leurre.nager();
		leurre.effectuerCancan();
		leurre.effectuerVol();
		System.out.println("--------------------------------------------------------------");

		System.out.println("----------------------   CANARD PLASTIQUE   ------------------");
		Canard plastoc = new CanardEnPlastique();
		plastoc.afficher();
		plastoc.nager();
		plastoc.effectuerCancan();
		plastoc.effectuerVol();
		System.out.println("--------------------------------------------------------------");

		System.out.println("--------   CHANGER DYNAMIQUEMENT COMPORTEMENT LEURRE   -------");
		leurre.setComportementCanCan(new Coincoin());
		leurre.setComportementVol(new VolerAvecDesAiles());
		leurre.afficher();
		leurre.nager();
		leurre.effectuerCancan();
		leurre.effectuerVol();
	}

}
