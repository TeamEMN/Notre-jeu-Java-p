package ToutCeQuiEstObjet;

public class Equipable extends Objet {
	// Variables privées
	// Bonus : lorsque Equip est équipé, l'utilisateur reçoit comme bonus d'attaque absolu Equip._bonusAttaque (idem pour les 4 autres)
	private int _bonusHp;
	private int _bonusAttaque;
	private int _bonusDefense;
	private int _bonusVitesse;
	private int _bonusMana;
	
	// Constructeur
	public Equipable(String nom, int prix, int masse, String url, int bonusHp, int bonusA, int bonusD, int bonusV, int bonusM) {
		super(nom, prix, masse, url);
		this._bonusHp = bonusHp;
		this._bonusAttaque = bonusA;
		this._bonusDefense = bonusD;
		this._bonusVitesse = bonusV;
		this._bonusMana = bonusM;
	}
	
	// Getters
	public float getBonusHp() {
		return this._bonusHp;
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
	
	// Setters
	public void setBonusHp(int b) {
		this._bonusHp = b;
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
