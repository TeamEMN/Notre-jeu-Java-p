package ToutCeQuiEstObjet;

public class Consommable extends Objet {
	// privates
	// modificateurs : lorsque Conso est utilisé, l'attaque globale de l'utilisateur est multipliée par Conso._modifAttaque (idem pour les 4 autres)
	private int _modifPointsDeVie;
	private int _modifAttaque;
	private int _modifDefense;
	private int _modifVitesse;
	private int _modifMana;
	
	// constructeur
	public Consommable(String nom, int prix, int masse, String url, int modifPDV, int modifA, int modifD, int modifV, int modifM) {
		super(nom, prix, masse, url);
		this._modifPointsDeVie = modifPDV;
		this._modifAttaque = modifA;
		this._modifDefense = modifD;
		this._modifVitesse = modifV;
		this._modifMana = modifM;
	}
}
