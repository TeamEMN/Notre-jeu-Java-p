package ToutCeQuiEstObjet;

public class Equipable extends Objet {
	// privates
	// bonus : lorsque Equip est équipé, l'utilisateur reçoit comme bonus d'attaque absolu Equip._bonusAttaque (idem pour les 4 autres)
	private int _bonusPointsDeVie;
	private int _bonusAttaque;
	private int _bonusDefense;
	private int _bonusVitesse;
	private int _bonusMana;
	
	// constructeur
	public Equipable(String nom, int prix, int masse, String url, int bonusPDV, int bonusA, int bonusD, int bonusV, int bonusM) {
		super(nom, prix, masse, url);
		this._bonusPointsDeVie = bonusPDV;
		this._bonusAttaque = bonusA;
		this._bonusDefense = bonusD;
		this._bonusVitesse = bonusV;
		this._bonusMana = bonusM;
	}
}
