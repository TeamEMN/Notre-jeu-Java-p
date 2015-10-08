package ToutCeQuiEstObjet;

public class Consommable extends Objet {
	// privates
	// modificateurs : lorsque Conso est utilisé, l'attaque globale de l'utilisateur est multipliée par Conso._modifAttaque (idem pour les 4 autres)
	private float _modifPointsDeVie;
	private float _modifAttaque;
	private float _modifDefense;
	private float _modifVitesse;
	private float _modifMana;
	// généralement les potions et élixirs ont un effet limité dans le temps, je propose donc de noter leur durée d'efficacité en secondes ici
	// mais il ne faut pas non plus que ça pose problème pour les potions de soin par exemple
	private int _dureeEffet;
	
	// constructeur
	public Consommable(String nom, int prix, int masse, String url, float modifPDV, float modifA, float modifD, float modifV, float modifM, int duree) {
		super(nom, prix, masse, url);
		this._modifPointsDeVie = modifPDV;
		this._modifAttaque = modifA;
		this._modifDefense = modifD;
		this._modifVitesse = modifV;
		this._modifMana = modifM;
		this._dureeEffet = duree;
	}
	
	// gets
	public float getModifPointsDeVie() {
		return this._modifPointsDeVie;
	}
	
	public float getModifAttaque() {
		return this._modifAttaque;
	}
	
	public float getModifDefense() {
		return this._modifDefense;
	}
	
	public float getModifVitesse() {
		return this._modifVitesse;
	}
	
	public float getModifMana() {
		return this._modifMana;
	}
	
	public int getDureeEffet() {
		return this._dureeEffet;
	}
	
	// sets
	public void setModifPointsDeVie(float m) {
		this._modifPointsDeVie = m;
	}
	
	public void setModifAttaque(float m) {
		this._modifAttaque = m;
	}
	
	public void setModifDefense(float m) {
		this._modifDefense = m;
	}
	
	public void setModifVitesse(float m) {
		this._modifVitesse = m;
	}
	
	public void setModifMana(float m) {
		this._modifMana = m;
	}
	
	public void setDureeEffet(int d) {
		this._dureeEffet = d;
	}
	
}
