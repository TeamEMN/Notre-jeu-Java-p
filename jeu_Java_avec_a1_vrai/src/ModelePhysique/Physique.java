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
		int SommeForceVivantX = 0; //Alexis : Initialisation de la somme des forces projetées en x
		int SommeForceVivantY = 0; //Alexis : Initialisation de la somme des forces projetées en y
		for (int i = 0; i < this.getListeForces().size(); i++) {
			if (this.getListeForces().get(i).getVivant() == vivant) { //Alexis : on ne prend que les forces affectées à vivant
				SommeForceVivantX += this.getListeForces().get(i).getIntensiteX(); //Alexis : on somme les forces en x
				SommeForceVivantY += this.getListeForces().get(i).getIntensiteY(); //Alexis : on somme les forces en y
			}
		}
		vivant.setAccelerationX(SommeForceVivantX/vivant.getMasse()); //Alexis : on balance l'accélération en x dans vivant 
		vivant.setAccelerationY(SommeForceVivantY/vivant.getMasse()); //Alexis : on balance l'accélération en y dans vivant
	}
	 public void Integration(Vivant vivant) {
		 int dt = 1; //Alexis : À voir si on la hardcode ici on si on la met en argument (ou dans une autre classe)
		 vivant.setVitesseX(vivant.getVitesseX()+vivant.getAccelerationX()*dt);
		 vivant.setVitesseY(vivant.getVitesseY()+vivant.getAccelerationY()*dt);
		 vivant.set
		 
	 }
	

}
