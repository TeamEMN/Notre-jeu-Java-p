package Ponctuelles;
import Force.Ponctuelle;
import Mecanismes.Ressort;
import ToutCeQuiPeutVivre.Vivant;

public class ForceRessort extends Ponctuelle {
	public ForceRessort(Vivant vivant, Ressort ressort){
		super(vivant, calculIntensiteX(vivant,ressort), calculIntensiteY(vivant,ressort));
	}
	
	public static int calculIntensiteX(Vivant vivant, Ressort ressort) {
		int dx = ressort.getXSG()-vivant.getXSG();
		int dy = ressort.getXSG()-vivant.getXSG();
		double d = Math.pow(Math.pow(dx, 2)+Math.pow(dy, 2),1/2);
		int intensite = (int)((-ressort.getK()*dx*(d-ressort.getL0()))/d);
		return intensite;
	}
	
	public static int calculIntensiteY(Vivant vivant, Ressort ressort) {
		int dx = ressort.getXSG()-vivant.getXSG();
		int dy = ressort.getXSG()-vivant.getXSG();
		double d = Math.pow(Math.pow(dx, 2)+Math.pow(dy, 2),1/2);
		int intensite = (int)((-ressort.getK()*dy*(d-ressort.getL0()))/d);
		return intensite;
	}
}