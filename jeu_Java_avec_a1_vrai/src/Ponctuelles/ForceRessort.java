package Ponctuelles;
import Force.Ponctuelle;
import Mecanismes.Ressort;
import ToutCeQuiPeutVivre.Vivant;

public class ForceRessort extends Ponctuelle {
	public ForceRessort(Vivant vivant, Ressort ressort){
		super(vivant, 0, 0, ressort);
	}
	
	public void actualiserIntensite() {
		this.calculIntensiteX();
		this.calculIntensiteY();
	}
	
	public int calculIntensiteX() {
		int dx = this.getMecanisme().getXSG()-this.getMecanisme().getXSG();
		int dy = this.getMecanisme().getXSG()-this.getVivant().getXSG();
		double d = Math.pow(Math.pow(dx, 2)+Math.pow(dy, 2),1/2);
		int intensite = (int)((-((Ressort) this.getMecanisme()).getK()*dx*(d-((Ressort) this.getMecanisme()).getL0()))/d);
		return intensite;
	}
	
	public int calculIntensiteY() {
		int dx = this.getMecanisme().getXSG()-this.getVivant().getXSG();
		int dy = this.getMecanisme().getXSG()-this.getVivant().getXSG();
		double d = Math.pow(Math.pow(dx, 2)+Math.pow(dy, 2),1/2);
		int intensite = (int)((-((Ressort) this.getMecanisme()).getK()*dy*(d-((Ressort) this.getMecanisme()).getL0()))/d);
		return intensite;
	}
}