package Champs;
import Force.Champs;
import ToutCeQuiPeutVivre.Vivant;

public class Poids extends Champs {
	
	public Poids(Vivant vivant, int g){
		super(vivant,0,vivant.getMasse()*g);
	}

}
