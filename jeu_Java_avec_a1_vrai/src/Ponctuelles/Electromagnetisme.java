package Ponctuelles;
import Force.Ponctuelle;
import Mecanismes.Aimant;
import ToutCeQuiPeutVivre.Vivant;

public class Electromagnetisme extends Ponctuelle {
	public Electromagnetisme(Vivant vivant, Aimant aimant){
		super(vivant, 0, 0, aimant);
	}
	
	public void actualiserIntensite() {
		this.calculIntensiteX();
		this.calculIntensiteY();
	}

	public int calculIntensiteX() {
		int dx = this.getMecanisme().getXSG()-this.getVivant().getXSG();
		int dy = this.getMecanisme().getXSG()-this.getVivant().getXSG();
		int intensite = (int)((((Aimant) this.getMecanisme()).getQ()*Math.abs(dx))/Math.pow(Math.pow(dx, 2)+Math.pow(dy, 2),3/2));	
		return intensite;
	}
	
	public int calculIntensiteY() {
		int dx = this.getMecanisme().getXSG()-this.getVivant().getXSG();
		int dy = this.getMecanisme().getXSG()-this.getVivant().getXSG();
		int intensite = (int)((((Aimant) this.getMecanisme()).getQ()*Math.abs(dy))/Math.pow(Math.pow(dx, 2)+Math.pow(dy, 2),3/2));	
		return intensite;
	}
}
