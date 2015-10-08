package ModelePhysique;
import java.util.ArrayList;

import ToutCeQuiPeutVivre.Vivant;

public class Physique {
	
	private ArrayList<Force> _listeForces;
	
	public Physique(ArrayList<Force> listeForces) {
		this._listeForces = listeForces;
	}
	
	public void Newton(Vivant vivant) {
		int SommeForceVivantX;
		int SommeForceVivantY;
		for (int i = 0; i < this._listeForces.size(); i++) {
			if (this._listeForces[i]._vivant == vivant) {
				SommeForceVivantX += this._listeForces[i]._intensiteX;
				SommeForceVivantX += this._listeForces[i]._intensiteY;
			}
		}
	}
	

}
