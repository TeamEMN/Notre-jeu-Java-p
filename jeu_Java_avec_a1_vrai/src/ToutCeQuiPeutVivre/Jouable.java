package ToutCeQuiPeutVivre;

import LesActionsSpecials.Attaque;

public class Jouable extends Vivant{

	public Jouable(int hpMax, int manaMax, int attaque, int defense,
			Attaque[] listeAttaque, int modAttaque, int modDefense,
			int modVitesse, int attaqueEquipement, int defenseEquipement,
			int vitesseEquipement, int manaMaxEquipement, int hpMaxEquipement,
			String type, int vitesse, int vitesseX, int vitesseY,
			int accelerationX, int accelerationY, int masse) {
		super(hpMax, manaMax, attaque, defense, listeAttaque, modAttaque, modDefense,
				modVitesse, attaqueEquipement, defenseEquipement, vitesseEquipement,
				manaMaxEquipement, hpMaxEquipement, type, vitesse, vitesseX, vitesseY,
				accelerationX, accelerationY, masse, 48, 48);
		
	}
	
	


	public static void main(String[] args) {
		Attaque[] listeAttaque = {};
		final Jouable personnagePrincipal = new Jouable(100, 120, 20, 30, listeAttaque, 0, 0, 0, 0, 0, 0, 0, 0, null, 10,
				0, 0, 0, 0, 60000);
	}
}
