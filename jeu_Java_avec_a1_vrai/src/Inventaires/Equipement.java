package Inventaires;

import LesEquipables.Arme;
import LesEquipables.Armure;
import LesEquipables.Casque;
import LesEquipables.Chaussures;
import LesEquipables.Talisman;

public class Equipement {
	// Variables privées
	private Arme _arme1;
	private Arme _arme2;
	private Armure _armure;
	private Casque _casque;
	private Chaussures _chaussures;
	private Talisman _talisman1;
	private Talisman _talisman2;
	private Talisman _talisman3;
	private Talisman _talisman4;
	
	// Constructeur
	public Equipement(Arme arme1, Arme arme2, Armure armure, Casque casque, Chaussures chaussures, Talisman talisman1, Talisman talisman2, Talisman talisman3, Talisman talisman4) {
		this._arme1 = arme1;
		this._arme2 = arme2;
		this._armure = armure;
		this._casque = casque;
		this._chaussures = chaussures;
		this._talisman1 = talisman1;
		this._talisman2 = talisman2;
		this._talisman3 = talisman3;
		this._talisman4 = talisman4;
	}

	// Getters
	public Arme getArme1() {
		return _arme1;
	}
	
	public Arme getArme2() {
		return _arme2;
	}
	
	public Armure getArmure() {
		return _armure;
	}
	
	public Casque getCasque() {
		return _casque;
	}
	
	public Chaussures getChaussures() {
		return _chaussures;
	}
	
	public Talisman getTalisman1() {
		return _talisman1;
	}
	
	public Talisman getTalisman2() {
		return _talisman2;
	}
	
	public Talisman getTalisman3() {
		return _talisman3;
	}
	
	public Talisman getTalisman4() {
		return _talisman4;
	}
	
	// Setters
	public void setArme1(Arme _arme1) {
		this._arme1 = _arme1;
	}
	
	public void setArme2(Arme _arme2) {
		this._arme2 = _arme2;
	}
	
	public void setArmure(Armure _armure) {
		this._armure = _armure;
	}
	
	public void setCasque(Casque _casque) {
		this._casque = _casque;
	}
	
	public void setChaussures(Chaussures _chaussures) {
		this._chaussures = _chaussures;
	}
	
	public void setTalisman1(Talisman _talisman1) {
		this._talisman1 = _talisman1;
	}
	
	public void setTalisman2(Talisman _talisman2) {
		this._talisman2 = _talisman2;
	}
	
	public void setTalisman3(Talisman _talisman3) {
		this._talisman3 = _talisman3;
	}
	
	public void setTalisman4(Talisman _talisman4) {
		this._talisman4 = _talisman4;
	}
	
	// Fonctions utiles !
	
	// Valeur totale de l'équipement
	public int getHpTotal() {
		return this._arme1.getBonusHp()+this._arme2.getBonusHp()+this._armure.getBonusHp()+this._casque.getBonusHp()+this._chaussures.getBonusHp()+this._talisman1.getBonusHp()+this._talisman2.getBonusHp()+this._talisman3.getBonusHp()+this._talisman4.getBonusHp();
	}

	public int getAttaqueTotale() {
		return this._arme1.getBonusAttaque()+this._arme2.getBonusAttaque()+this._armure.getBonusAttaque()+this._casque.getBonusAttaque()+this._chaussures.getBonusAttaque()+this._talisman1.getBonusAttaque()+this._talisman2.getBonusAttaque()+this._talisman3.getBonusAttaque()+this._talisman4.getBonusAttaque();
	}
	
	public int getDefenseTotale() {
		return this._arme1.getBonusDefense()+this._arme2.getBonusDefense()+this._armure.getBonusDefense()+this._casque.getBonusDefense()+this._chaussures.getBonusDefense()+this._talisman1.getBonusDefense()+this._talisman2.getBonusDefense()+this._talisman3.getBonusDefense()+this._talisman4.getBonusDefense();
	}
	
	public int getVitesseTotale() {
		return this._arme1.getBonusVitesse()+this._arme2.getBonusVitesse()+this._armure.getBonusVitesse()+this._casque.getBonusVitesse()+this._chaussures.getBonusVitesse()+this._talisman1.getBonusVitesse()+this._talisman2.getBonusVitesse()+this._talisman3.getBonusVitesse()+this._talisman4.getBonusVitesse();
	}
	
	public int getManaTotal() {
		return this._arme1.getBonusMana()+this._arme2.getBonusMana()+this._armure.getBonusMana()+this._casque.getBonusMana()+this._chaussures.getBonusMana()+this._talisman1.getBonusMana()+this._talisman2.getBonusMana()+this._talisman3.getBonusMana()+this._talisman4.getBonusMana();
	}
	
	public int getMasseTotale() {
		return this._arme1.getMasse()+this._arme2.getMasse()+this._armure.getMasse()+this._casque.getMasse()+this._chaussures.getMasse()+this._talisman1.getMasse()+this._talisman2.getMasse()+this._talisman3.getMasse()+this._talisman4.getMasse();
	}
	
	// Changement d'un équipable : set, tout simplement - notons qu'il faut d'abord ranger l'ancien dans l'inventaire, ou il sera perdu !
}
