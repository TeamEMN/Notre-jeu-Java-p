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
	
	// gets
	public float getBonusPointsDeVie() {
		return this._bonusPointsDeVie;
	}
	
	public float getBonusAttaque() {
		return this._bonusAttaque;
	}
	
	public float getBonusDefense() {
		return this._bonusDefense;
	}
	
	public float getBonusVitesse() {
		return this._bonusVitesse;
	}
	
	public float getBonusMana() {
		return this._bonusMana;
	}
	
	// sets
	public void setBonusPointsDeVie(int b) {
		this._bonusPointsDeVie = b;
	}
	
	public void setBonusAttaque(int b) {
		this._bonusAttaque = b;
	}
	
	public void setBonusDefense(int b) {
		this._bonusDefense = b;
	}
	
	public void setBonusVitesse(int b) {
		this._bonusVitesse = b;
	}
	
	public void setBonusMana(int b) {
		this._bonusMana = b;
	}
	
}
