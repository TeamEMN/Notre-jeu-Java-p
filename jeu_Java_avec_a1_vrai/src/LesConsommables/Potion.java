package LesConsommables;

import ToutCeQuiEstObjet.Consommable;

public class Potion extends Consommable {
	
	public Potion(String nom, int prix, String url, int valHp, int valMana, double valAtt, double valDef, double valVit){
		super(nom, prix, 100, url, valHp, valMana, valAtt, valDef, valVit);
	}
	
}
