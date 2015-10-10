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
		int SommeForceVivantX = 0; // Initialisation de la somme des forces projetées en x
		int SommeForceVivantY = 0; // Initialisation de la somme des forces projetées en y
		for (int i = 0; i < this.getListeForces().size(); i++) {
			if (this.getListeForces().get(i).getVivant() == vivant) { // on ne prend que les forces affectées à vivant
				SommeForceVivantX += this.getListeForces().get(i).getIntensiteX(); // on somme les forces en x
				SommeForceVivantY += this.getListeForces().get(i).getIntensiteY(); // on somme les forces en y
			}
		}
		vivant.setAccelerationX(SommeForceVivantX/vivant.getMasse()); // on balance l'accélération en x dans vivant 
		vivant.setAccelerationY(SommeForceVivantY/vivant.getMasse()); // on balance l'accélération en y dans vivant
	}
	
	

}
