package ToutCeQuiEstObjet;

import ToutCeQuiPeutVivre.Vivant;

public class Consommable extends Objet {
	// Variables privées
	// Bonus (ou malus...) : lorsque Conso est utilisé, les HP (ou mana) actuels sont modifiés
	private int _modifHp;
	private int _modifMana;
	// Coefficients : lorsque Conso est utilisé, l'attaque globale de l'utilisateur est multipliée par Conso._coeffAttaque (idem pour les 2 autres)
	private double _coeffAttaque;
	private double _coeffDefense;
	private double _coeffVitesse;
	
	// Constructeur
	public Consommable(String nom, int prix, int masse, String url, int modifHp, int modifM, double coeffA, double coeffD, double coeffV) {
		super(nom, prix, masse, url);
		this._modifHp = modifHp;
		this._modifMana = modifM;
		this._coeffAttaque = coeffA;
		this._coeffDefense = coeffD;
		this._coeffVitesse = coeffV;
	}
	
	// Getters
	public int getModifHp() {
		return this._modifHp;
	}
	
	public int getModifMana() {
		return this._modifMana;
	}
	
	public double getCoeffAttaque() {
		return this._coeffAttaque;
	}
	
	public double getCoeffDefense() {
		return this._coeffDefense;
	}
	
	public double getCoeffVitesse() {
		return this._coeffVitesse;
	}
	
	// Setters
	public void setModifHp(int m) {
		this._modifHp = m;
	}
	
	public void setModifMana(int m) {
		this._modifMana = m;
	}
	
	public void setCoeffAttaque(double c) {
		this._coeffAttaque = c;
	}
	
	public void setCoeffDefense(double c) {
		this._coeffDefense = c;
	}
	
	public void setCoeffVitesse(double c) {
		this._coeffVitesse = c;
	}
	
	// Utilisation
	public void consommer(Vivant cible) {
		// Modifications (Hp et Mana)
		if (this.getModifHp() < 0) {
			cible.perdreHp(this.getModifHp());
		} else if (this.getModifHp() > 0) {
			cible.recupererHp(this.getModifHp());
		}
		
		if (this.getModifMana() < 0) {
			cible.perdreMana(this.getModifMana());
		} else if (this.getModifMana() > 0) {
			cible.recupererMana(this.getModifMana());
		}
		
		// Altérations (Att, Def, Vit)
		cible.modifModAttaque(this.getCoeffAttaque());
		cible.modifModDefense(this.getCoeffDefense());
		cible.modifModVitesse(this.getCoeffVitesse());
	}
	
}
