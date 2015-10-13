package Ponctuelles;
import Force.Ponctuelle;
import Mecanismes.Aimant;
import ToutCeQuiPeutVivre.Vivant;

public class Electromagnetisme extends Ponctuelle {
	public Electromagnetisme(Vivant vivant, Aimant aimant){
		super(vivant, calculIntensiteX(vivant,aimant), calculIntensiteY(vivant,aimant));
	}
	
	public static int calculIntensiteX(Vivant vivant, Aimant aimant) {
		int dx = aimant.getXSG()-vivant.getXSG();
		int dy = aimant.getXSG()-vivant.getXSG();
		int intensite = (int)((aimant.getQ()*Math.abs(dx))/Math.pow(Math.pow(dx, 2)+Math.pow(dy, 2),3/2));	
		return intensite;
	}
	
	public static int calculIntensiteY(Vivant vivant, Aimant aimant) {
		int dx = aimant.getXSG()-vivant.getXSG();
		int dy = aimant.getXSG()-vivant.getXSG();
		int intensite = (int)((aimant.getQ()*Math.abs(dy))/Math.pow(Math.pow(dx, 2)+Math.pow(dy, 2),3/2));	
		return intensite;
	}
}
