package ModelePhysique;
import java.util.ArrayList;

import ToutCeQuiPeutVivre.Vivant;

public class Physique {
	
	private ArrayList<Force> _listeForces;
	private int _dt; //Alexis : À voir si on la hardcode ici on si on la met dans une autre classe
	
	public Physique(ArrayList<Force> listeForces, int dt) {
		this._listeForces = listeForces;
		this._dt = dt;
	}
	
	
	//getteurs
	public ArrayList<Force> getListeForces() {
		return _listeForces;
	}
	public int getDt() {
		return _dt;
	}
	
	//setteurs
	public void setListeForces(ArrayList<Force> _listeForces) {
		this._listeForces = _listeForces;
	}
	public void setDt(int _dt) {
		this._dt = _dt;
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
		 vivant.setVitesseX(vivant.getVitesseX()+vivant.getAccelerationX()*this.getDt());
		 vivant.setVitesseY(vivant.getVitesseY()+vivant.getAccelerationY()*this.getDt());
		 vivant.setXSG(vivant.getXSG()+vivant.getVitesseX()*this.getDt());
		 vivant.setYSG(vivant.getYSG()+vivant.getVitesseY()*this.getDt());
		 
	 }
	

}
