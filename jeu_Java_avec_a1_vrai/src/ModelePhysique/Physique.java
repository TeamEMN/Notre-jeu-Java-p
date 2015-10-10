package ModelePhysique;
import java.util.ArrayList;

import ToutCeQuiPeutVivre.Vivant;

public class Physique {
	
	private ArrayList<Force> _listeForces;
	
	public ArrayList<Force> getListeForces() {
		return _listeForces;
	}
	
	public Physique(ArrayList<Force> listeForces) {
		this._listeForces = listeForces;
	}
	
	public void Newton(Vivant vivant) {
		int SommeForceVivantX = 0;
		int SommeForceVivantY = 0;
		for (int i = 0; i < this.getListeForces().size(); i++) {
			if (this.getListeForces().get(i).getVivant() == vivant) {
				SommeForceVivantX += this.getListeForces().get(i).getIntensiteX();
				SommeForceVivantY += this.getListeForces().get(i).getIntensiteY();
			}
		}
		vivant.setAccelerationX(SommeForceVivantX/vivant.getMasse());
		vivant.setAccelerationY(SommeForceVivantY/vivant.getMasse());
	}
	

}
